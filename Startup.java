import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Objects;

public class Startup {
    private JFrame frame;
    private JPanel bottomPanel;
    public Startup() {
        frame();
        easyButton();
        mediumButton();
        hardButton();
        frame.setVisible(true);
    }
    public void frame() {
        frame = new JFrame("Memory Game");
        JPanel mainPanel = new JPanel(new BorderLayout());
        frame.add(mainPanel);
        JPanel topPanel = new JPanel();
        JLabel label = new JLabel(new ImageIcon(new ImageIcon
                (Objects.requireNonNull(Startup.class.getClassLoader().getResource("Images/Startup/Memory-Game.png")))
                .getImage().getScaledInstance(1250, 500, Image.SCALE_SMOOTH)));
        topPanel.add(label);
        topPanel.setBackground(new Color(153,153,255));
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout(0,25));
        bottomPanel.setBackground(new Color(153,153,255));
        JPanel extraPanel = new JPanel();
        JButton button2 = new JButton();
        button2.setPreferredSize(new Dimension(100,50));
        button2.setEnabled(false);
        button2.setBorderPainted(false);
        button2.setBackground(new Color(153,153,255));
        extraPanel.add(button2);
        extraPanel.setBackground(new Color(153,153,255));
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(bottomPanel, BorderLayout.CENTER);
        mainPanel.add(extraPanel, BorderLayout.SOUTH);
        frame.setSize(1250, 1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void easyButton() {
        JButton easy = new JButton();
        easy.setLayout(new BorderLayout());
        JLabel easyModeImage = new JLabel(new ImageIcon(new ImageIcon
                (Objects.requireNonNull(Startup.class.getClassLoader().getResource("Images/Startup/EasyMode.png")))
                .getImage().getScaledInstance(700, 150, Image.SCALE_SMOOTH)));
        easy.add(easyModeImage, BorderLayout.CENTER);
        easy.setBackground(new Color(187, 255, 153));
        easy.setPreferredSize(new Dimension(570, 110));
        easy.setBorderPainted(false);
        bottomPanel.add(easy, BorderLayout.NORTH);
        easy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                frame.dispose();
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
        medium.setMaximumSize(new Dimension(570, 110));
        medium.setBorderPainted(false);
        bottomPanel.add(medium, BorderLayout.CENTER);
        medium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                frame.dispose();
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
        hard.setPreferredSize(new Dimension(570, 110));
        hard.setBorderPainted(false);
        bottomPanel.add(hard, BorderLayout.SOUTH);
        hard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                frame.dispose();
                try {
                    HardMode hardMode = new HardMode();
                } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}
