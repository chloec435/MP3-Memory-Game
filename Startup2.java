import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Startup2 {
    private EasyMode easyMode;
//    private MediumMode mediumMode;
//    private HardMode hardMode;
    private JFrame frame;
    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel bottomPanel;

    public Startup2() {
        frame();
        easyButton();
        mediumButton();
        hardButton();
        frame.setVisible(true);
    }
    public void frame() {
        frame = new JFrame("Memory Game");
//        frame.setLayout(new GridLayout(2,1));
//        frame.getContentPane().setBackground(Color.BLACK);
        mainPanel = new JPanel(new BorderLayout());
        frame.add(mainPanel);
        topPanel = new JPanel();
//        JLabel label = new JLabel("MEMORY GAME");
//        label.setHorizontalAlignment(SwingConstants.CENTER);
//        label.setVerticalAlignment(SwingConstants.BOTTOM);
//        label.setHorizontalTextPosition(SwingConstants.CENTER);
//        label.setVerticalTextPosition(SwingConstants.CENTER);
//        System.out.println(label.getHorizontalAlignment());
//        System.out.println(label.getVerticalAlignment());
//        topPanel.add(label);
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
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
        easy.setBackground(Color.GREEN);
        easy.setFont(new Font("Arial", Font.PLAIN, 40));
//        gbc.anchor = GridBagConstraints.SOUTH;
//        gbc.weightY = 0;
//        gbc.weightX = 0;
        easy.setPreferredSize(new Dimension(570, 100));
        easy.setBorderPainted(false);
//        easy.setBounds(275, 570, 450, 90);
        bottomPanel.add(easy, BorderLayout.NORTH);
//        panel.add(easy, BorderLayout.CENTER);
//        contentPane.setSize(900,900);
//        contentPane.setVisible(true)
        easy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                easyMode = new EasyMode();
            }
        });
    }
    public void mediumButton() {
//        Container contentPane = frame.getContentPane();
//        contentPane.setLayout(new FlowLayout());
        //    private GridBagConstraints gbc;
        JButton medium = new JButton("Medium Mode");
        medium.setBackground(Color.YELLOW);
        medium.setFont(new Font("Arial", Font.PLAIN, 40));
//        gbc.anchor = GridBagConstraints.SOUTH;
//        gbc.weightY = 0;
//        gbc.weightX = 0;
        medium.setPreferredSize(new Dimension(570, 100));
        medium.setBorderPainted(false);
//        easy.setBounds(275, 570, 450, 90);
        bottomPanel.add(medium, BorderLayout.CENTER);
//        panel.add(easy, BorderLayout.CENTER);
//        contentPane.setSize(900,900);
//        contentPane.setVisible(true)
        medium.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                easyMode = new EasyMode();
            }
        });
    }
    public void hardButton() {
//        Container contentPane = frame.getContentPane();
//        contentPane.setLayout(new FlowLayout());
        //    private GridBagConstraints gbc;
        JButton hard = new JButton("Hard Mode");
        hard.setBackground(Color.RED);
        hard.setFont(new Font("Arial", Font.PLAIN, 40));
//        gbc.anchor = GridBagConstraints.SOUTH;
//        gbc.weightY = 0;
//        gbc.weightX = 0;
        hard.setPreferredSize(new Dimension(570, 100));
        hard.setBorderPainted(false);
//        easy.setBounds(275, 570, 450, 90);
        bottomPanel.add(hard, BorderLayout.SOUTH);
//        panel.add(easy, BorderLayout.CENTER);
//        contentPane.setSize(900,900);
//        contentPane.setVisible(true)
        hard.addActionListener(new ActionListener() {
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
