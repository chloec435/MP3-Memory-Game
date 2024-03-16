import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
public class EasyMode {
    private JFrame frame;
    private final JButton[][] icons = new JButton[4][4];
    private final ImageIcon[][] assignedImage = new ImageIcon[4][4];
    private final ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
    private final ArrayList<JButton> matched = new ArrayList<JButton>();
    private ImageIcon startIcon = new ImageIcon(new ImageIcon
            (EasyMode.class.getClassLoader().getResource
                    ("Images/EasyMode/Mickey_Mouse_Clubhouse_logo.svg.png"))
            .getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH));
    private JButton firstButton = null;
    private int firstRow;
    private int firstColumn;
    private int matches;

    public EasyMode() {
        addImages();
        startingFrame();
        checkSame();
    }

    public void addImages() {
        Images iconImages = new Images(0);
        images.addAll(Arrays.asList(iconImages.getEasyModeImages().toArray(new ImageIcon[0])));
    }

    public void startingFrame() {
        frame = new JFrame();
        frame.setSize(800, 800);
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
        frame.setLayout(new GridLayout(4, 4));
        frame.setVisible(true);
    }
    public void checkSame() {
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
                                if (matches < 8) {
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
                                } else if (matches == 8) {
                                    enableAll("end");
                                    JOptionPane.showMessageDialog(frame, "Congratulations! " +
                                            "You've matched all pairs.", "Game Over", JOptionPane.INFORMATION_MESSAGE);
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException ex) {
                                        throw new RuntimeException(ex);
                                    }
                                    frame.dispose();
                                }
                            } else {
                                disableAll(firstButton, clickedButton);
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
