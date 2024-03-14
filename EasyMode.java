import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class EasyMode {
    private JFrame frame;
    private CardLayout card;
    private Images iconImages;
    private JButton[][] cover = new JButton[4][4];
    private JButton[][] icons = new JButton[4][4];
    private ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();

    public EasyMode() {
        addImages();
        startingFrame();
        clickedButton();
    }

    public void addImages() {
        iconImages = new Images();
        images.addAll(Arrays.asList(iconImages.getEasyModeImages().toArray(new ImageIcon[0])));
    }
    public void startingFrame() {
        frame = new JFrame();
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        for (int r = 0; r < icons.length; r++) {
            for (int c = 0; c < icons[0].length; c++) {
                cover[r][c] = new JButton();
                frame.add(cover[r][c]);
            }
        }
        frame.setLayout(new GridLayout(4, 4));
        frame.setVisible(true);
    }
    public void clickedButton() {
        int index = (int)(Math.random() * images.size());
        for (int r = 0; r < icons.length; r++) {
            for (int c = 0; c < icons[0].length; c++) {
                int row = r;
                int column = c;
                icons[r][c].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        icons[row][column].setIcon(images.get(index));
                    }
                }
            }
        }
    }
    public void checkS
}





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
