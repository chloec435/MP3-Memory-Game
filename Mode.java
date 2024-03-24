import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Mode {
    private JFrame frame;
    private final JButton[][] icons;
    private final ImageIcon[][] assignedImage;
    private final ImageIcon easyStartIcon = new ImageIcon(new ImageIcon(Objects.requireNonNull(EasyMode.class.getClassLoader()
            .getResource("Images/EasyMode/Mickey_Mouse_Clubhouse_logo.svg.png")))
            .getImage().getScaledInstance(235, 100, Image.SCALE_SMOOTH));
    private final ImageIcon mediumStartIcon = new ImageIcon(new ImageIcon(Objects.requireNonNull(EasyMode.class.getClassLoader()
            .getResource("Images/MediumMode/Looney_Tunes_logo_1985-present.png")))
            .getImage().getScaledInstance(185, 100, Image.SCALE_SMOOTH));
    private final ImageIcon hardStartIcon = new ImageIcon(new ImageIcon(Objects.requireNonNull(EasyMode.class.getClassLoader()
            .getResource("Images/HardMode/Spongebob_Squarepants_Logo.png")))
            .getImage().getScaledInstance(175, 150, Image.SCALE_SMOOTH));
    private ImageIcon startIcon;
    private final ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
    private final ArrayList<JButton> matched = new ArrayList<JButton>();
    private JButton firstButton = null;
    private int firstRow;
    private int firstColumn;
    private int matches;
    private String difficulty;
    private Clip match;
    private Clip mismatch;
    private Clip theme;
    private int rows;
    private int columns;

    public Mode(String modeDifficulty, int row, int column) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        icons = new JButton[row][column];
        assignedImage = new ImageIcon[row][column];
        rows = row;
        columns = column;
        Sounds sounds = new Sounds(modeDifficulty);
        match = AudioSystem.getClip();
        match.open(AudioSystem.getAudioInputStream(sounds.getMatch()));
        mismatch = AudioSystem.getClip();
        mismatch.open(AudioSystem.getAudioInputStream(sounds.getMismatch()));
        theme = AudioSystem.getClip();
        theme.open(AudioSystem.getAudioInputStream(sounds.getTheme()));
        difficulty = modeDifficulty;
        addImages();
        if (difficulty.equals("easy")) {
            startIcon = easyStartIcon;
        } else if (difficulty.equals("medium")) {
            startIcon = mediumStartIcon;
        } else {
            startIcon = hardStartIcon;
        }
        startingFrame();
        checkSame(row*column/2);
//        showAll(difficulty, rows, columns);
    }

    public void addImages() {
        Images iconImages = new Images(difficulty);
        images.addAll(Arrays.asList(iconImages.getImages(difficulty).toArray(new ImageIcon[0])));
    }

    public void startingFrame() {
        frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        int index;
        for (int r = 0; r < icons.length; r++) {
            for (int c = 0; c < icons[0].length; c++) {
                icons[r][c] = new JButton(startIcon);
                icons[r][c].setBackground(Color.WHITE);
                frame.add(icons[r][c]);
                index = (int) (Math.random() * images.size());
                assignedImage[r][c] = images.get(index);
                images.remove(index);
            }
        }
        frame.setLayout(new GridLayout(rows, columns));
//        theme.start();
        frame.setVisible(true);
    }
    public void checkSame(int totalMatches) {
        for (int r = 0; r < icons.length; r++) {
            for (int c = 0; c < icons[0].length; c++) {
                int finalR = r;
                int finalC = c;
                icons[r][c].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JButton clickedButton = icons[finalR][finalC];
                        clickedButton.setIcon(assignedImage[finalR][finalC]);
                        if (firstButton == null) {
                            firstButton = clickedButton;
                            firstRow = finalR;
                            firstColumn = finalC;
                        } else if (firstButton != clickedButton){
                            if (assignedImage[firstRow][firstColumn] == assignedImage[finalR][finalC]) {
                                matches++;
                                theme.stop();
                                tryPlay(match);
                                if (matches < totalMatches) {
                                    disableAll(firstButton, clickedButton);
                                    Timer timer = new Timer(1000, new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            firstButton.setEnabled(false);
                                            clickedButton.setEnabled(false);
                                            matched.addAll(Arrays.asList(firstButton, clickedButton));
                                            enableAll("allExcept");
                                            firstButton = null;
                                        }
                                    });
                                    timer.setRepeats(false);
                                    timer.start();
//                                    thread(match.getMicrosecondLength()/1000);
//                                    theme.start();
                                } else if (matches == totalMatches) {
                                    theme.start();
                                    enableAll("end");
                                    JOptionPane.showMessageDialog(frame, "Congratulations! " +
                                            "You've matched all pairs.",
                                            "Game Over", JOptionPane.INFORMATION_MESSAGE);
                                    theme.start();
                                    public void windowClosed(WindowEvent e) {
                                        theme.stop();
                                    }
//                                    frame.dispose();
//                                    theme.stop();
                                    Startup start = new Startup();
                                }
                            } else {
                                disableAll(firstButton, clickedButton);
                                theme.stop();
                                tryPlay(mismatch);
                                Timer timer = new Timer(1000, new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {

                                        firstButton.setIcon(startIcon);
                                        clickedButton.setIcon(startIcon);
                                        enableAll("allExcept");
                                        firstButton = null;
                                    }
                                });
                                timer.setRepeats(false);
                                timer.start();
//                                thread(mismatch.getMicrosecondLength()/1000);
//                                theme.start();
                            }
                        }
                    }
                });
            }
        }
    }
    public void thread(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void tryPlay(Clip sound) {
        try {
            play(sound);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void play(Clip sound) throws InterruptedException {
        sound.setFramePosition(0);
        sound.start();
    }
    public void disableAll(JButton firstButton, JButton secondButton) {
        for (JButton[] icon : icons) {
            for (int c = 0; c < icons[0].length; c++) {
                if (icon[c] != firstButton && icon[c] != secondButton) {
                    icon[c].setEnabled(false);
                }
            }
        }
    }
    public void enableAll(String type) {
        for (JButton[] icon : icons) {
            for (int c = 0; c < icons[0].length; c++) {
                if (type.equals("allExcept") && !matched.contains(icon[c])) {
                    icon[c].setEnabled(true);
                } else if (type.equals("end")) {
                    icon[c].setEnabled(true);
                }
            }
        }
    }
    public void showAll(int rows, int columns) {
        frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        int index;
        for (int r = 0; r < icons.length; r++) {
            for (int c = 0; c < icons[0].length; c++) {
                index = (int) (Math.random() * images.size());
                icons[r][c] = new JButton(images.get(index));
                icons[r][c].setBackground(Color.WHITE);
                frame.add(icons[r][c]);
                images.remove(index);
            }
        }
        frame.setLayout(new GridLayout(rows, columns));
        frame.setVisible(true);
    }
}
