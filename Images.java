import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;

public class Images {
    private URL image1;
    private URL image2;
    private URL image3;
    private URL image4;
    private URL image5;
    private URL image6;
    private URL image7;
    private URL image8;
    private ArrayList<ImageIcon> easyModeImages = new ArrayList<ImageIcon>();
    public Images() {
        addImages();
    }
    public void urls() {
        image1 = EasyMode.class.getClassLoader().getResource("easter basket choco bunny.jpg");
        image2 = EasyMode.class.getClassLoader().getResource("easter basket three eggs.jpg");
        image3 = EasyMode.class.getClassLoader().getResource("easter goofy.png");
        image4 = EasyMode.class.getClassLoader().getResource("easter mickey mouse.png");
        image5 = EasyMode.class.getClassLoader().getResource("easter minnie mouse.png");
        image6 = EasyMode.class.getClassLoader().getResource("easter pluto.jpg");
        image7 = EasyMode.class.getClassLoader().getResource("white bunny easter egg.jpg");
        image8 = EasyMode.class.getClassLoader().getResource("white realistic bunny.png");
    }
    public void addImages() {
        urls();
        for (int i = 0; i < 2; i++) {
            easyModeImages.add(new ImageIcon(image1));
            easyModeImages.add(new ImageIcon(image2));
            easyModeImages.add(new ImageIcon(image3));
            easyModeImages.add(new ImageIcon(image4));
            easyModeImages.add(new ImageIcon(image5));
            easyModeImages.add(new ImageIcon(image6));
            easyModeImages.add(new ImageIcon(image7));
            easyModeImages.add(new ImageIcon(image8));
        }
    }
    public ArrayList<ImageIcon> getEasyModeImages() {
        return easyModeImages;
    }
}
