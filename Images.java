import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class Images {
    private URL eImage1;private URL eImage2;private URL eImage3;
    private URL eImage4;private URL eImage5;private URL eImage6;
    private URL mImage1;private URL mImage2;private URL mImage3;private URL mImage4;private URL mImage5;
    private URL mImage6;private URL mImage7;private URL mImage8;private URL mImage9;private URL mImage10;
//    private URL mImage11;private URL mImage12;private URL mImage13;private URL mImage14;
//    private URL mImage15;private URL mImage16;private URL mImage17;private URL mImage18;
    private URL hImage1;private URL hImage2;private URL hImage3;private URL hImage4;private URL hImage5;
    private URL hImage6;private URL hImage7;private URL hImage8;private URL hImage9;private URL hImage10;
    private URL hImage11;private URL hImage12;private URL hImage13;private URL hImage14;private URL hImage15;
    private final ArrayList<ImageIcon> easyModeImages = new ArrayList<ImageIcon>();
    private final ArrayList<ImageIcon> mediumModeImages = new ArrayList<ImageIcon>();
    private final ArrayList<ImageIcon> hardModeImages = new ArrayList<ImageIcon>();
    public Images(String difficulty) {
        urls();
        if (difficulty.equals("easy")) {
            addEasyImages();
        }
        if (difficulty.equals("medium")) {
            addMediumImages();
        }
        if (difficulty.equals("hard")) {
            addHardImages();
        }
    }
    public void urls() {
        eImage1 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-pluto-easter.png");
        eImage2 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/mickey-mouse-easter5.png");
        eImage3 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/daisy-easter.png");
        eImage4 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/donald-easter5.png");
        eImage5 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/goofy-easter6.png");
        eImage6 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-mouse-easter-eggs.png");

        mImage1 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/34c8c5273925172ddeec167cb931926c.png");
        mImage2 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/mickey-mouse-easter3.png");
        mImage3 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/daisy-easter.png");
        mImage4 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/donald-easter5.png");
        mImage5 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/goofy-easter6.png");
        mImage6 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/mickey-mouse-easter5.png");
        mImage7 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/daisy-easter.png");
        mImage8 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/donald-easter5.png");
        mImage9 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/goofy-easter6.png");
        mImage10 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/mickey-mouse-easter5.png");

        hImage1 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-mouse-easter-eggs.png");
        hImage2 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-pluto-easter.png");
        hImage3 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/34c8c5273925172ddeec167cb931926c.png");
        hImage4 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/mickey-mouse-easter3.png");
        hImage5 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/daisy-easter.png");
        hImage6 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/donald-easter5.png");
        hImage7 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/goofy-easter6.png");
        hImage8 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/mickey-mouse-easter5.png");
        hImage9 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-mouse-easter-eggs.png");
        hImage10 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-pluto-easter.png");
        hImage11 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-mouse-easter-eggs.png");
        hImage12 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-pluto-easter.png");
        hImage13 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/34c8c5273925172ddeec167cb931926c.png");
        hImage14 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/mickey-mouse-easter3.png");
        hImage15 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/daisy-easter.png");
    }
    public void addEasyImages() {
        ImageIcon one = new ImageIcon(new ImageIcon(eImage1).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(one, one));
        ImageIcon two = new ImageIcon(new ImageIcon(eImage2).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(two, two));
        ImageIcon three = new ImageIcon(new ImageIcon(eImage3).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(three, three));
        ImageIcon four = new ImageIcon(new ImageIcon(eImage4).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(four, four));
        ImageIcon five = new ImageIcon(new ImageIcon(eImage5).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(five, five));
        ImageIcon six = new ImageIcon(new ImageIcon(eImage6).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(six, six));
        ImageIcon seven = new ImageIcon(new ImageIcon(eImage7).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(seven, seven));
        ImageIcon eight = new ImageIcon(new ImageIcon(eImage8).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
        easyModeImages.addAll(Arrays.asList(eight, eight));
    }
    public void addMediumImages() {
        ImageIcon one = new ImageIcon(new ImageIcon(mImage1).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
        mediumModeImages.addAll(Arrays.asList(one, one));
        ImageIcon two = new ImageIcon(new ImageIcon(mImage2).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
        mediumModeImages.addAll(Arrays.asList(two, two));
        ImageIcon three = new ImageIcon(new ImageIcon(mImage3).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
        mediumModeImages.addAll(Arrays.asList(three, three));
        ImageIcon four = new ImageIcon(new ImageIcon(mImage4).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
        mediumModeImages.addAll(Arrays.asList(four, four));
        ImageIcon five = new ImageIcon(new ImageIcon(mImage5).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
        mediumModeImages.addAll(Arrays.asList(five, five));
        ImageIcon six = new ImageIcon(new ImageIcon(mImage6).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
        mediumModeImages.addAll(Arrays.asList(six, six));
        ImageIcon seven = new ImageIcon(new ImageIcon(mImage7).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
        mediumModeImages.addAll(Arrays.asList(seven, seven));
        ImageIcon eight = new ImageIcon(new ImageIcon(mImage8).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
        mediumModeImages.addAll(Arrays.asList(eight, eight));
        ImageIcon nine = new ImageIcon(new ImageIcon(mImage9).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
        mediumModeImages.addAll(Arrays.asList(nine, nine));
        ImageIcon ten = new ImageIcon(new ImageIcon(mImage10).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
        mediumModeImages.addAll(Arrays.asList(ten, ten));
    }
    public void addHardImages() {
        ImageIcon one = new ImageIcon(new ImageIcon(hImage1).getImage().getScaledInstance(200, 1000/6, Image.SCALE_SMOOTH));
        hardModeImages.addAll(Arrays.asList(one, one));
        ImageIcon two = new ImageIcon(new ImageIcon(hImage2).getImage().getScaledInstance(200, 1000/6, Image.SCALE_SMOOTH));
        hardModeImages.addAll(Arrays.asList(two, two));
        ImageIcon three = new ImageIcon(new ImageIcon(hImage3).getImage().getScaledInstance(200, 1000/6, Image.SCALE_SMOOTH));
        hardModeImages.addAll(Arrays.asList(three, three));
        ImageIcon four = new ImageIcon(new ImageIcon(hImage4).getImage().getScaledInstance(200, 1000/6, Image.SCALE_SMOOTH));
        hardModeImages.addAll(Arrays.asList(four, four));
        ImageIcon five = new ImageIcon(new ImageIcon(hImage5).getImage().getScaledInstance(200, 1000/6, Image.SCALE_SMOOTH));
        hardModeImages.addAll(Arrays.asList(five, five));
        ImageIcon six = new ImageIcon(new ImageIcon(hImage6).getImage().getScaledInstance(200, 1000/6, Image.SCALE_SMOOTH));
        hardModeImages.addAll(Arrays.asList(six, six));
        ImageIcon seven = new ImageIcon(new ImageIcon(hImage7).getImage().getScaledInstance(200, 1000/6, Image.SCALE_SMOOTH));
        hardModeImages.addAll(Arrays.asList(seven, seven));
        ImageIcon eight = new ImageIcon(new ImageIcon(hImage8).getImage().getScaledInstance(200, 1000/6, Image.SCALE_SMOOTH));
        hardModeImages.addAll(Arrays.asList(eight, eight));
        ImageIcon nine = new ImageIcon(new ImageIcon(hImage9).getImage().getScaledInstance(200, 1000/6, Image.SCALE_SMOOTH));
        hardModeImages.addAll(Arrays.asList(nine, nine));
        ImageIcon ten = new ImageIcon(new ImageIcon(hImage10).getImage().getScaledInstance(200, 1000/6, Image.SCALE_SMOOTH));
        hardModeImages.addAll(Arrays.asList(ten, ten));
        ImageIcon eleven = new ImageIcon(new ImageIcon(hImage11).getImage().getScaledInstance(200, 1000/6, Image.SCALE_SMOOTH));
        hardModeImages.addAll(Arrays.asList(eleven, eleven));
        ImageIcon twelve = new ImageIcon(new ImageIcon(hImage12).getImage().getScaledInstance(200, 1000/6, Image.SCALE_SMOOTH));
        hardModeImages.addAll(Arrays.asList(twelve, twelve));
        ImageIcon thirteen = new ImageIcon(new ImageIcon(hImage13).getImage().getScaledInstance(200, 1000/6, Image.SCALE_SMOOTH));
        hardModeImages.addAll(Arrays.asList(thirteen, thirteen));
        ImageIcon fourteen = new ImageIcon(new ImageIcon(hImage14).getImage().getScaledInstance(200, 1000/6, Image.SCALE_SMOOTH));
        hardModeImages.addAll(Arrays.asList(fourteen, fourteen));
        ImageIcon fifteen = new ImageIcon(new ImageIcon(hImage15).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
        hardModeImages.addAll(Arrays.asList(fifteen, fifteen));
    }
    public ArrayList<ImageIcon> getImages(String difficulty) {
        if (difficulty.equals("easy")) {
            return easyModeImages;
        } else if (difficulty.equals("medium")) {
            return mediumModeImages;
        } else {
            return hardModeImages;
        }
    }
}
