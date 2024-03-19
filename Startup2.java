import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Startup {
    private EasyMode easyMode;
//    private MediumMode mediumMode;
//    private HardMode hardMode;
    private JFrame frame;
    private JPanel panel;

    public Startup() {
        frame();
        easyButton();
//        mediumButton();
//        hardButton();
        frame.setVisible(true);
    }
    public void frame() {
        frame = new JFrame("Memory Game");
        frame.setLayout(new BoxLayout(frame, BoxLayout.Y_AXIS));
        frame.getContentPane().setBackground(Color.BLACK);
//        panel = new JPanel();
//        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//        JLabel label = new JLabel("MEMORY GAME", JLabel.CENTER);
//        panel.add(label);
        frame.getContentPane().add(panel);
//        frame.setLayout(new GridBagLayout());
//        gbc = new GridBagConstraints();
//        gbc.anchor = GridBagConstraints.SOUTH;
//        gbc.weightY = 0;
//        gbc.weightX = 0;
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void easyButton() {
//        Container contentPane = frame.getContentPane();
//        contentPane.setLayout(new FlowLayout());
        //    private GridBagConstraints gbc;
        JButton easy = new JButton("Easy Mode");
        easy.setBackground(Color.YELLOW);
        easy.setFont(new Font("Arial", Font.PLAIN, 40));
//        gbc.anchor = GridBagConstraints.SOUTH;
//        gbc.weightY = 0;
//        gbc.weightX = 0;
        easy.setBounds(275, 570, 450, 90);
        frame.add(easy, BorderLayout.CENTER);
//        panel.add(easy, BorderLayout.CENTER);
//        contentPane.setSize(900,900);
//        contentPane.setVisible(true)
        easy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                easyMode = new EasyMode();
            }
        });
    }
//    public void mediumButton() {
//        JButton medium = new JButton("Medium Mode");
//        medium.setFont(new Font("Arial", Font.PLAIN, 40));
////        gbc.anchor = GridBagConstraints.SOUTH;
////        gbc.weightY = 0;
////        gbc.weightX = 0;
//        medium.setBounds(275, 685, 450, 90);
//        frame.add(medium);
//        medium.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e){
//                mediumMode = new MediumMode();
//            }
//        });
//    }
//    public void hardButton() {
//        JButton hard = new JButton("Hard Mode");
//        hard.setFont(new Font("Arial", Font.PLAIN, 40));
////        gbc.anchor = GridBagConstraints.SOUTH;
////        gbc.weightY = 0;
////        gbc.weightX = 0;
//        hard.setBounds(275, 800, 450, 90);
//        frame.add(hard);
////        hard.addActionListener(new ActionListener() {
////            public void actionPerformed(ActionEvent e){
////                hardMode = new HardMode();
////            }
////        });
//    }
}
