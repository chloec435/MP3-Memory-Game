import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class EasyMode {
    private JFrame frame;
    private JLayeredPane layeredPane;
    private Images iconImages;
    private JButton[][] cover = new JButton[4][4];
    private JButton[][] icons = new JButton[4][4];
    private ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
    public EasyMode() {
        addImages();
        startingFrame();
    }
    public void addImages() {
        iconImages = new Images();
        images.addAll(Arrays.asList(iconImages.getEasyModeImages().toArray(new ImageIcon[0])));
        System.out.println(images);
    }
    public void startingFrame() {
        frame = new JFrame();
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        easyPanel();
        layeredPane = frame.getLayeredPane();
        frame.setLayout(new GridLayout(4,4));
        frame.setVisible(true);
    }
    public void easyPanel() {
        for (int r = 0; r < icons.length; r++) {
            for (int c = 0; c < icons[0].length; c++) {
            }
        }
        int index;
        for (int r = 0; r < icons.length; r++) {
            for (int c = 0; c < icons[0].length; c++) {
                cover[r][c] = new JButton();
                layeredPane.add(icons[r][c]);
                index = (int)(Math.random() * images.size());
                icons[r][c] = new JButton(images.get(index));
                images.remove(index);
                layeredPane.add(icons[r][c]);
            }
        }
    }
//    public void checkSame() {
//        for (int i = 0; i < images.size()-1; i++) {
//            for (int j = i + 1; j < images.size(); j++) {
//                if (images.get(i) == images.get(j)) {
//
//                }
//            }
//        }
//    }
}
