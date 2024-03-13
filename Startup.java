import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Startup {
    private EasyMode easyMode;
    private JFrame frame;
    private GridBagConstraints gbc;
    private JButton easy;
    private JButton medium;
    private JButton hard;
    public Startup() {
        frame();
        easyButton();
        mediumButton();
        hardButton();
    }
    public void frame() {
        frame = new JFrame();
//        frame.setLayout(new GridBagLayout());
//        gbc = new GridBagConstraints();
//        gbc.anchor = GridBagConstraints.SOUTH;
//        gbc.weighty = 0;
//        gbc.weightx = 0;
        frame.setSize(900, 900);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void easyButton() {
//        Container contentPane = frame.getContentPane();
//        contentPane.setLayout(new FlowLayout());
        easy = new JButton("Easy Mode");
        easy.setFont(new Font("Arial", Font.PLAIN, 40));
//        gbc.anchor = GridBagConstraints.SOUTH;
//        gbc.weighty = 0;
//        gbc.weightx = 0;
        easy.setBounds(225, 450, 450, 90);
        frame.add(easy);
//        contentPane.setSize(900,900);
//        contentPane.setVisible(true)
        easy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                easyMode = new EasyMode();
            }
        });
    }
    public void mediumButton() {
        medium = new JButton("Medium Mode");
        medium.setFont(new Font("Arial", Font.PLAIN, 40));
//        gbc.anchor = GridBagConstraints.SOUTH;
//        gbc.weighty = 0;
//        gbc.weightx = 0;
        medium.setBounds(225, 575, 450, 90);
        frame.add(medium);
//        medium.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e){
//                mediumMode = new EasyMode();
//            }
//        });
    }
    public void hardButton() {
        hard = new JButton("Hard Mode");
        hard.setFont(new Font("Arial", Font.PLAIN, 40));
//        gbc.anchor = GridBagConstraints.SOUTH;
//        gbc.weighty = 0;
//        gbc.weightx = 0;
        hard.setBounds(225, 700, 450, 90);
        frame.add(hard);
//        hard.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e){
//                hardMode = new EasyMode();
//            }
//        });
    }
}
