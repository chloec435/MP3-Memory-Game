import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
public class MediumMode {
    private JFrame frame;
    private final JButton[][] icons = new JButton[6][6];
    private final ImageIcon[][] assignedImage = new ImageIcon[6][6];
    private final ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
    private final ArrayList<JButton> matched = new ArrayList<JButton>();
    private JButton firstButton = null;
    private int firstRow;
    private int firstColumn;
    private int matches;

    public MediumMode() {
        addImages();
        startingFrame();
        checkSame();
    }

    public void addImages() {
        Images iconImages = new Images(1);
        images.addAll(Arrays.asList(iconImages.getEasyModeImages().toArray(new ImageIcon[0])));
    }

    public void startingFrame() {
        frame = new JFrame("Mickey Mouse Clubhouse Memory Game");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        int index;
        for (int r = 0; r < icons.length; r++) {
            for (int c = 0; c < icons[0].length; c++) {
                icons[r][c] = new JButton(new ImageIcon(new ImageIcon
                        (MediumMode.class.getClassLoader().getResource
                                ("Images/EasyMode/Mickey_Mouse_Clubhouse_logo.svg.png"))
                        .getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH)));
                icons[r][c].setBackground(Color.WHITE);
                frame.add(icons[r][c]);
                index = (int) (Math.random() * images.size());
                assignedImage[r][c] = images.get(index);
                images.remove(index);
            }
        }
        frame.setLayout(new GridLayout(6, 6));
        frame.setVisible(true);
    }
    public void checkSame() {
        for (int r = 0; r < icons.length; r++) {
            for (int c = 0; c < icons[0].length; c++) {
                int finalR = r;
                int finalC = c;
                icons[r][c].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton clickedButton = icons[finalR][finalC];
                        clickedButton.setIcon(assignedImage[finalR][finalC]);
                        if (firstButton == null) {
                            firstButton = clickedButton;
                            firstRow = finalR;
                            firstColumn = finalC;
                        } else {
                            disableAll(firstButton, clickedButton);
                            if (firstButton != clickedButton &&
                                    assignedImage[firstRow][firstColumn] ==
                                            assignedImage[finalR][finalC]) {
                                // Matching images
                                firstButton.setEnabled(false);
                                clickedButton.setEnabled(false);
                                matched.addAll(Arrays.asList(firstButton, clickedButton));
                                enableAll();
                                firstButton = null;
                                matches++;
                                if (matches == 18) {
                                    JOptionPane.showMessageDialog(frame, "Congratulations! " +
                                            "You've matched all pairs.", "Game Over", JOptionPane.INFORMATION_MESSAGE);
                                }
                            } else {
                                Timer timer = new Timer(1000, new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        firstButton.setIcon(null);
                                        clickedButton.setIcon(null);
                                        enableAll();
                                        firstButton = null;
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
    public void disableAll(JButton firstButton, JButton secondButton) {
        for (JButton[] icon : icons) {
            for (int c = 0; c < icons[0].length; c++) {
                if (icon[c] != firstButton && icon[c] != secondButton) {
                    icon[c].setEnabled(false);
                }
            }
        }
    }
    public void enableAll() {
        for (JButton[] icon : icons) {
            for (int c = 0; c < icons[0].length; c++) {
                if (!matched.contains(icon[c])) {
                    icon[c].setEnabled(true);
                }
            }
        }
    }
}




//icons[r][c].addActionListener(new ActionListener() {
//@Override
//public void actionPerformed(ActionEvent e) {
//        icons[row][column].setIcon(images.get(index[0]));
//        images.remove(index[0]);
//        }
//        });
//    public void easyButtons() {
//        int index;
//        for (int r = 0; r < icons.length; r++) {
//            for (int c = 0; c < icons[0].length; c++) {
//                cover[r][c] = new JButton();
//                frame.add(cover[r][c]);
//                index = (int)(Math.random() * images.size());
//                icons[r][c] = new JButton(images.get(index));
//                images.remove(index);
//                icons[r][c].setEnabled(true);
//                frame.add(icons[r][c]);
//            }
//        }
//    }
//    public void checkSame() {
//        for (int i = 0; i < images.size()-1; i++) {
//            for (int j = i + 1; j < images.size(); j++) {
//                if (images.get(i) == images.get(j)) {
//
//                }
//            }
//        }
//    }
