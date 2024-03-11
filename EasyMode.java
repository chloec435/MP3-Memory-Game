import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class EasyMode {
    private JFrame frame;
    private JButton[][] icons = new JButton[4][4];
    private ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
    public EasyMode() {
        easyFrame();
    }
    public void addImages() {
        images.add(new ImageIcon("https://i.pinimg.com/736x/1c/68/9b/1c689b554c3f1d8704868da7185199e1.jpg"));
        images.add(new ImageIcon("https://i.etsystatic.com/41972288/r/il/7365a9/5200425836/il_300x300.5200425836_eebb.jpg"));
        images.add(new ImageIcon("https://png.pngtree.com/png-clipart/20230326/original/pngtree-bunny-with-easter-eggs-png-image_9004872.png"));
        images.add(new ImageIcon("https://i.pinimg.com/736x/93/65/32/93653297fdfdef40d51bb2fa961d46a8.jpg"));
        images.add(new ImageIcon("https://www.disneyclips.com/images/images/minnie-mouse-easter-eggs.png"));
        images.add(new ImageIcon("https://clipart-library.com/newimages/easter-clip-art-16.jpg"));
        images.add(new ImageIcon("https://www.disneyclips.com/images/images/goofy-easter6.png"));
        images.add(new ImageIcon("https://www.disneyclips.com/images/images/mickey-mouse-easter5.png"));
    }
    public void easyFrame() {
        addImages();
        frame = new JFrame();
        frame.setSize(800,840); //y-axis off by 40 for some reason
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        int xAxis = 0;
        int yAxis = 0;
        for (int r = 0; r < icons.length; r++) {
            for (int c = 0; c < icons[r].length; c++) {
                int index = (int)(Math.random() * images.size()); //image length 0???
                icons[r][c] = new JButton();
                icons[r][c].setBounds(xAxis + 40, yAxis + 40, 150, 150);
                images.remove(index);
                frame.add(icons[r][c]);
                xAxis += 190;
            }
            xAxis = 0;
            yAxis += 190;
        }
        JButton last = new JButton(); //missing last button for some reason
        last.setBounds(610, 650, 150, 150);
        frame.add(last);
        frame.setVisible(true);
    }

}
