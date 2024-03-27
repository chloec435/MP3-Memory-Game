import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Startup {
    private JFrame frame;
    private JPanel bottomPanel;
    private JPanel extraPanel;
    private Clip opening;
    public Startup(boolean tOF) {
    }
    public Startup() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        frame();
        easyButton();
        mediumButton();
        hardButton();
        impossibleButton();
        frame.setVisible(true);
    }
    public void frame() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        frame = new JFrame("Memory Game");
        JPanel mainPanel = new JPanel(new BorderLayout());
        frame.add(mainPanel);
        JPanel topPanel = new JPanel();
        JLabel label = new JLabel(new ImageIcon(new ImageIcon
                (Objects.requireNonNull(Startup.class.getClassLoader().getResource("Images/Startup/Memory-Game.png")))
                .getImage().getScaledInstance(1000, 400, Image.SCALE_SMOOTH)));
        topPanel.add(label);
        topPanel.setBackground(new Color(153,153,255));
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout(0,25));
        bottomPanel.setBackground(new Color(153,153,255));
        extraPanel = new JPanel();
        extraPanel.setLayout(new BorderLayout());
        JButton button2 = new JButton();
        button2.setPreferredSize(new Dimension(100,25));
        button2.setEnabled(false);
        button2.setBorderPainted(false);
        button2.setBackground(new Color(153,153,255));
        extraPanel.add(button2);
        extraPanel.setBackground(new Color(153,153,255));
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(bottomPanel, BorderLayout.CENTER);
        mainPanel.add(extraPanel, BorderLayout.SOUTH);
        frame.setSize(1100, 1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        opening = AudioSystem.getClip();
        opening.open(AudioSystem.getAudioInputStream(new File("Audio/Background Cartoon Music Loop ｜ (Download and Royalty FREE).wav")));
        opening.loop(Clip.LOOP_CONTINUOUSLY);
        opening.start();
    }
    public void easyButton() {
        JButton easy = new JButton();
        easy.setLayout(new BorderLayout());
        JLabel easyModeImage = new JLabel(new ImageIcon(new ImageIcon
                (Objects.requireNonNull(Startup.class.getClassLoader().getResource("Images/Startup/EasyMode.png")))
                .getImage().getScaledInstance(700, 150, Image.SCALE_SMOOTH)));
        easy.add(easyModeImage, BorderLayout.CENTER);
        easy.setBackground(new Color(187, 255, 153));
        easy.setPreferredSize(new Dimension(570, 115));
        easy.setBorderPainted(false);
        bottomPanel.add(easy, BorderLayout.NORTH);
        easy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                frame.dispose();
                opening.stop();
                try {
                    EasyMode easyMode = new EasyMode();
                } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
    public void mediumButton() {
        JButton medium = new JButton();
        medium.setLayout(new BorderLayout());
        JLabel mediumModeImage = new JLabel(new ImageIcon(new ImageIcon
                (Objects.requireNonNull(Startup.class.getClassLoader().getResource("Images/Startup/MediumMode.png")))
                .getImage().getScaledInstance(700, 150, Image.SCALE_SMOOTH)));
        medium.add(mediumModeImage, BorderLayout.CENTER);
        medium.setBackground(new Color(255, 221, 153));
        medium.setMaximumSize(new Dimension(570, 115));
        medium.setBorderPainted(false);
        bottomPanel.add(medium, BorderLayout.CENTER);
        medium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                frame.dispose();
                opening.stop();
                try {
                    MediumMode mediumMode = new MediumMode();
                } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
    public void hardButton() {
        JButton hard = new JButton();
        hard.setLayout(new BorderLayout());
        JLabel hardModeImage = new JLabel(new ImageIcon(new ImageIcon
                (Objects.requireNonNull(Startup.class.getClassLoader().getResource("Images/Startup/HardMode.png")))
                .getImage().getScaledInstance(700, 150, Image.SCALE_SMOOTH)));
        hard.add(hardModeImage, BorderLayout.CENTER);
        hard.setBackground(new Color(255, 153, 204));
        hard.setPreferredSize(new Dimension(570, 115));
        hard.setBorderPainted(false);
        bottomPanel.add(hard, BorderLayout.SOUTH);
        hard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                frame.dispose();
                opening.stop();
                try {
                    HardMode hardMode = new HardMode();
                } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
    public void impossibleButton() {
        JButton impossible = new JButton();
        impossible.setLayout(new BorderLayout());
        JLabel impossibleModeImage = new JLabel(new ImageIcon(new ImageIcon
                (Objects.requireNonNull(Startup.class.getClassLoader().getResource("Images/Startup/ImpossibleMode.png")))
                .getImage().getScaledInstance(900, 175, Image.SCALE_SMOOTH)));
        impossible.add(impossibleModeImage, BorderLayout.CENTER);
        impossible.setBackground(new Color(159, 210, 249));
        impossible.setPreferredSize(new Dimension(1250, 115));
        impossible.setBorderPainted(false);
        extraPanel.add(impossible, BorderLayout.SOUTH);
        impossible.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                frame.dispose();
                opening.stop();
                try {
                    ImpossibleMode impossibleMode = new ImpossibleMode();
                    JOptionPane.showMessageDialog(frame, "Maximize the window to see full images.",
                            "Maximize Window", JOptionPane.INFORMATION_MESSAGE);
                } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}
