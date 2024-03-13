import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

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
        addEasyImages();
    }
    public void urls() {
        image1 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/34c8c5273925172ddeec167cb931926c.png");
        image2 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/mickey-mouse-easter3.png");
        image3 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/daisy-easter.png");
        image4 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/donald-easter5.png");
        image5 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/goofy-easter6.png");
        image6 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/mickey-mouse-easter5.png");
        image7 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-mouse-easter-eggs.png");
        image8 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-pluto-easter.png");
    }
    public void addEasyImages() {
        urls();
        ImageIcon one = new ImageIcon(new ImageIcon(image1).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(one, one));
        ImageIcon two = new ImageIcon(new ImageIcon(image2).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(two, two));
        ImageIcon three = new ImageIcon(new ImageIcon(image3).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(three, three));
        ImageIcon four = new ImageIcon(new ImageIcon(image4).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(four, four));
        ImageIcon five = new ImageIcon(new ImageIcon(image5).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(five, five));
        ImageIcon six = new ImageIcon(new ImageIcon(image6).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(six, six));
        ImageIcon seven = new ImageIcon(new ImageIcon(image7).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(seven, seven));
        ImageIcon eight = new ImageIcon(new ImageIcon(image8).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(eight, eight));
    }
    public ArrayList<ImageIcon> getEasyModeImages() {
        return easyModeImages;
    }
}
