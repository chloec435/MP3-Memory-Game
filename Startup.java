import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Startup {
    private EasyMode easyMode;
//    private MediumMode mediumMode;
//    private HardMode hardMode;
    private JFrame frame;
    private JPanel mainPanel;
    private JPanel topPanel;
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
        mainPanel = new JPanel(new BorderLayout());
        frame.add(mainPanel);
        topPanel = new JPanel();
        JButton button = new JButton();
        button.setPreferredSize(new Dimension(100,500));
        button.setEnabled(false);
        button.setBorderPainted(false);
        button.setBackground(new Color(153,153,255));
        topPanel.add(button);
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
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void easyButton() {
//        Container contentPane = frame.getContentPane();
//        contentPane.setLayout(new FlowLayout());
        //    private GridBagConstraints gbc;
        JButton easy = new JButton("Easy Mode");
        easy.setBackground(new Color(187, 255, 153));
        easy.setFont(new Font("Arial", Font.PLAIN, 40));
//        gbc.anchor = GridBagConstraints.SOUTH;
//        gbc.weightY = 0;
//        gbc.weightX = 0;
        easy.setPreferredSize(new Dimension(570, 115));
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
        medium.setBackground(new Color(255, 221, 153));
        medium.setFont(new Font("Arial", Font.PLAIN, 40));
//        gbc.anchor = GridBagConstraints.SOUTH;
//        gbc.weightY = 0;
//        gbc.weightX = 0;
        medium.setPreferredSize(new Dimension(570, 115));
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
        hard.setBackground(new Color(255, 153, 204));
        hard.setFont(new Font("Arial", Font.PLAIN, 40));
//        gbc.anchor = GridBagConstraints.SOUTH;
//        gbc.weightY = 0;
//        gbc.weightX = 0;
        hard.setPreferredSize(new Dimension(570, 115));
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


// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class Startup {
//     private EasyMode easyMode;
// //    private MediumMode mediumMode;
// //    private HardMode hardMode;
//     private JFrame frame;

//     public Startup() {
//         frame();
//         easyButton();
// //        mediumButton();
// //        hardButton();
//     }
//     public void frame() {
//         frame = new JFrame("Memory Game");
// //        frame.setLayout(new GridBagLayout());
// //        gbc = new GridBagConstraints();
// //        gbc.anchor = GridBagConstraints.SOUTH;
// //        gbc.weightY = 0;
// //        gbc.weightX = 0;
//         frame.setSize(1000, 1000);
//         frame.setLocationRelativeTo(null);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setVisible(true);
//     }
//     public void easyButton() {
// //        Container contentPane = frame.getContentPane();
// //        contentPane.setLayout(new FlowLayout());
//         //    private GridBagConstraints gbc;
//         JButton easy = new JButton("Easy Mode");
//         easy.setFont(new Font("Arial", Font.PLAIN, 40));
// //        gbc.anchor = GridBagConstraints.SOUTH;
// //        gbc.weightY = 0;
// //        gbc.weightX = 0;
//         easy.setBounds(275, 570, 450, 90);
//         frame.add(easy);
// //        contentPane.setSize(900,900);
// //        contentPane.setVisible(true)
//         easy.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e){
//                 easyMode = new EasyMode();
//             }
//         });
//     }
// //    public void mediumButton() {
// //        JButton medium = new JButton("Medium Mode");
// //        medium.setFont(new Font("Arial", Font.PLAIN, 40));
// ////        gbc.anchor = GridBagConstraints.SOUTH;
// ////        gbc.weightY = 0;
// ////        gbc.weightX = 0;
// //        medium.setBounds(275, 685, 450, 90);
// //        frame.add(medium);
// //        medium.addActionListener(new ActionListener() {
// //            public void actionPerformed(ActionEvent e){
// //                mediumMode = new MediumMode();
// //            }
// //        });
// //    }
// //    public void hardButton() {
// //        JButton hard = new JButton("Hard Mode");
// //        hard.setFont(new Font("Arial", Font.PLAIN, 40));
// ////        gbc.anchor = GridBagConstraints.SOUTH;
// ////        gbc.weightY = 0;
// ////        gbc.weightX = 0;
// //        hard.setBounds(275, 800, 450, 90);
// //        frame.add(hard);
// ////        hard.addActionListener(new ActionListener() {
// ////            public void actionPerformed(ActionEvent e){
// ////                hardMode = new HardMode();
// ////            }
// ////        });
// //    }
// }
