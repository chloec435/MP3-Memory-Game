import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class EasyMode {
    private JFrame frame;
    private Images iconImages;
    private JButton[][] icons = new JButton[4][4];
    private ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
    public EasyMode() {
        addImages();
        easyFrame();
    }
    public void addImages() {
        iconImages = new Images();
        images.addAll(Arrays.asList(iconImages.getEasyModeImages().toArray(new ImageIcon[0])));
        System.out.println(images);
    }
    public void easyFrame() {
        frame = new JFrame();
        frame.setSize(800,800); //y-axis off by 40 for some reason
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
//        int xAxis = 0;
//        int yAxis = 0;
        int index;
        for (int r = 0; r < icons.length; r++) {
            for (int c = 0; c < icons[0].length; c++) {
                index = (int)(Math.random() * images.size());
                icons[r][c] = new JButton(images.get(index));
//                icons[r][c].setBounds(xAxis + 40, yAxis + 40, 150, 150);
                images.remove(index);
                frame.add(icons[r][c]);
//                xAxis += 190;
            }
//            xAxis = 0;
//            yAxis += 190;
        }
//        JButton last = new JButton(); //missing last button for some reason
////        last.setBounds(610, 650, 150, 150);
////        images.remove(0);
//        frame.add(last);
        frame.setLayout(new GridLayout(4,4));
        frame.setVisible(true);
    }
//    public void addImages() {
//        URL image1 = EasyMode.class.getClassLoader().getResource("easter basket choco bunny.jpg");
//        images.add(new ImageIcon("easter basket choco bunny.jpg"));
//        images.add(new ImageIcon("easter basket three eggs.jpg"));
//        images.add(new ImageIcon("easter goofy.png"));
//        images.add(new ImageIcon("easter mickey mouse.png"));
//        images.add(new ImageIcon("easter minnie mouse.png"));
//        images.add(new ImageIcon("easter pluto.jpg"));
//        images.add(new ImageIcon("white bunny easter egg.jpg"));
//        images.add(new ImageIcon("white realistic bunny.png"));
//        images.add(new ImageIcon("easter basket choco bunny.jpg"));
//        images.add(new ImageIcon("easter basket three eggs.jpg"));
//        images.add(new ImageIcon("easter goofy.png"));
//        images.add(new ImageIcon("easter mickey mouse.png"));
//        images.add(new ImageIcon("easter minnie mouse.png"));
//        images.add(new ImageIcon("easter pluto.jpg"));
//        images.add(new ImageIcon("white bunny easter egg.jpg"));
//        images.add(new ImageIcon("white realistic bunny.png"));
//        System.out.println(images);
//    }
}
