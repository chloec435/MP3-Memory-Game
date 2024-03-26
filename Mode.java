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
    private final ImageIcon startIcon;
    private final ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
    private final ArrayList<JButton> matched = new ArrayList<JButton>();
    private JButton firstButton = null;
    private JButton secondButton = null;
    private int firstRow;
    private int firstColumn;
    private int secondRow;
    private int secondColumn;
    private int matches;
    private final String difficulty;
    private final Clip match;
    private final Clip mismatch;
    private final Clip theme;
    private Clip current;
    private final int rows;
    private final int columns;

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
            startIcon = new ImageIcon(new ImageIcon(Objects.requireNonNull(EasyMode.class.getClassLoader()
                    .getResource("Images/EasyMode/Mickey_Mouse_Clubhouse_logo.svg.png")))
                    .getImage().getScaledInstance(300, 150, Image.SCALE_SMOOTH));
        } else if (difficulty.equals("medium")) {
            startIcon = new ImageIcon(new ImageIcon(Objects.requireNonNull(EasyMode.class.getClassLoader()
                    .getResource("Images/MediumMode/Looney_Tunes_logo_1985-present.png")))
                    .getImage().getScaledInstance(235, 150, Image.SCALE_SMOOTH));
        } else {
            startIcon = new ImageIcon(new ImageIcon(Objects.requireNonNull(EasyMode.class.getClassLoader()
                    .getResource("Images/HardMode/Spongebob_Squarepants_Logo.png")))
                    .getImage().getScaledInstance(215, 215, Image.SCALE_SMOOTH));
        }
        startingFrame();
        checkSame(row*column/2);
//        showAll(rows, columns);
    }

    public void addImages() {
        Images iconImages = new Images(difficulty);
        images.addAll(Arrays.asList(iconImages.getImages(difficulty).toArray(new ImageIcon[0])));
    }

    public void startingFrame() {
        frame = new JFrame();
        frame.setSize(1250, 1080);
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
        frame.setVisible(true);
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                theme.stop();
                Startup start = new Startup();
            }
        });
    }
    public void checkSame(int totalMatches) {
        for (int r = 0; r < icons.length; r++) {
            for (int c = 0; c < icons[0].length; c++) {
                int finalR = r;
                int finalC = c;
                theme.start();
                current = theme;
                icons[r][c].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton clickedButton = icons[finalR][finalC];
                        clickedButton.setIcon(assignedImage[finalR][finalC]);
                        if (firstButton == null) {
                            firstButton = clickedButton;
                            firstRow = finalR;
                            firstColumn = finalC;
                        } else if (firstButton != clickedButton && secondButton == null) {
                            secondButton = clickedButton;
                            secondRow = finalR;
                            secondColumn = finalC;
                            if (assignedImage[firstRow][firstColumn] == assignedImage[secondRow][secondColumn]) {
                                matches++;
                                tryPlay(match);
                                if (matches < totalMatches) {
                                    disableAll();
                                    Timer timer = new Timer(2000, new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            firstButton.setEnabled(false);
                                            secondButton.setEnabled(false);
                                            matched.addAll(Arrays.asList(firstButton, clickedButton));
                                            enableAll("allExcept");
                                            firstButton = null;
                                            secondButton = null;
                                        }
                                    });
                                    timer.setRepeats(false);
                                    timer.start();
                                } else if (matches == totalMatches) {
                                    theme.setFramePosition(0);
                                    theme.loop(Clip.LOOP_CONTINUOUSLY);
                                    theme.start();
                                    enableAll("end");
                                    JOptionPane.showMessageDialog(frame, "Congratulations! " +
                                                    "You've matched all pairs.",
                                            "Game Over", JOptionPane.INFORMATION_MESSAGE);
                                }
                            } else {
                                disableAll();
                                theme.stop();
                                tryPlay(mismatch);
                                Timer timer = new Timer(2000, new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        firstButton.setIcon(startIcon);
                                        secondButton.setIcon(startIcon);
                                        enableAll("allExcept");
                                        firstButton = null;
                                        secondButton = null;
                                    }
                                });
                                timer.setRepeats(false);
                                timer.start();
                            }
                        }
                    }
                });
            }
        }
    }
    public void tryPlay(Clip sound) {
        if (current.isRunning()) {
            current.stop();
        }
        try {
            play(sound);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        current = sound;
    }
    public void play(Clip sound) throws InterruptedException {
        sound.setFramePosition(0);
        sound.start();
    }
    public void disableAll() {
        for (int r = 0; r < icons.length; r++) {
            for (int c = 0; c < icons[0].length; c++) {
                if (icons[r][c] != firstButton && icons[r][c] != secondButton) {
                    icons[r][c].setEnabled(false);
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
                    ActionListener[] aListeners = icon[c].getActionListeners();
                    for (ActionListener al : aListeners) {
                        icon[c].removeActionListener(al);
                    }
                }
            }
        }
    }
    public void showAll(int rows, int columns) {
        frame = new JFrame();
        frame.setSize(1250, 1080);
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
        theme.loop(Clip.LOOP_CONTINUOUSLY);
        theme.start();
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                theme.stop();
                Startup start = new Startup();
            }
        });
    }
}
