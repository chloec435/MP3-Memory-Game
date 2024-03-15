import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class Images {
    private URL eImage1;
    private URL eImage2;
    private URL eImage3;
    private URL eImage4;
    private URL eImage5;
    private URL eImage6;
    private URL eImage7;
    private URL eImage8;
    private final ArrayList<ImageIcon> easyModeImages = new ArrayList<ImageIcon>();
    private final ArrayList<ImageIcon> mediumModeImages = new ArrayList<ImageIcon>();
    private final ArrayList<ImageIcon> hardModeImages = new ArrayList<ImageIcon>();
    public Images(int difficulty) {
        urls();
        if (difficulty == 0) {
            addEasyImages();
        }
        if (difficulty == 1) {
            addMediumImages();
        }
        if (difficulty == 2) {
            addHardImages();
        }
    }
    public void urls() {
        eImage1 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/34c8c5273925172ddeec167cb931926c.png");
        eImage2 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/mickey-mouse-easter3.png");
        eImage3 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/daisy-easter.png");
        eImage4 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/donald-easter5.png");
        eImage5 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/goofy-easter6.png");
        eImage6 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/mickey-mouse-easter5.png");
        eImage7 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-mouse-easter-eggs.png");
        eImage8 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-pluto-easter.png");
    }
    public void addEasyImages() {
        ImageIcon one = new ImageIcon(new ImageIcon(eImage1).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(one, one));
        ImageIcon two = new ImageIcon(new ImageIcon(eImage2).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(two, two));
        ImageIcon three = new ImageIcon(new ImageIcon(eImage3).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(three, three));
        ImageIcon four = new ImageIcon(new ImageIcon(eImage4).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(four, four));
        ImageIcon five = new ImageIcon(new ImageIcon(eImage5).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(five, five));
        ImageIcon six = new ImageIcon(new ImageIcon(eImage6).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(six, six));
        ImageIcon seven = new ImageIcon(new ImageIcon(eImage7).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(seven, seven));
        ImageIcon eight = new ImageIcon(new ImageIcon(eImage8).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(eight, eight));
    }
    public void addMediumImages() {
        ImageIcon one = new ImageIcon(new ImageIcon(eImage1).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(one, one, one, one));
        ImageIcon two = new ImageIcon(new ImageIcon(eImage2).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(two, two, two, two));
        ImageIcon three = new ImageIcon(new ImageIcon(eImage3).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(three, three, three, three));
        ImageIcon four = new ImageIcon(new ImageIcon(eImage4).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(four, four, four, four));
        ImageIcon five = new ImageIcon(new ImageIcon(eImage5).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(five, five, five, five));
        ImageIcon six = new ImageIcon(new ImageIcon(eImage6).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(six, six, six, six));
        ImageIcon seven = new ImageIcon(new ImageIcon(eImage7).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(seven, seven, seven, seven));
        ImageIcon eight = new ImageIcon(new ImageIcon(eImage8).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(eight, eight, eight, eight, eight, eight, eight, eight));
    }
    public void addHardImages() {

    }
    public ArrayList<ImageIcon> getEasyModeImages() {
        return easyModeImages;
    }
    public ArrayList<ImageIcon> getMediumModeImages() {
        return mediumModeImages;
    }
    public ArrayList<ImageIcon> getHardModeImages() {
        return hardModeImages;
    }
}
