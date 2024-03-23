import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class Images {
    private final ArrayList<URL> easyModeURLs = new ArrayList<URL>();
    private final ArrayList<URL> mediumModeURLs = new ArrayList<URL>();
    private final ArrayList<URL> hardModeURLs = new ArrayList<URL>();
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
        URL eImage1 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-pluto-easter.png");
        URL eImage2 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/mickey-mouse-easter5.png");
        URL eImage3 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/daisy-easter.png");
        URL eImage4 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/donald-easter5.png");
        URL eImage5 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/goofy-easter6.png");
        URL eImage6 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-mouse-easter-eggs.png");
        easyModeURLs.addAll(Arrays.asList(eImage1, eImage2, eImage3, eImage4, eImage5, eImage6));

        URL mImage1 = EasyMode.class.getClassLoader().getResource("Images/MediumMode/Bugs_Bunny.svg.png");
        URL mImage2 = EasyMode.class.getClassLoader().getResource("Images/MediumMode/Daffy_Duck.svg.png");
        URL mImage3 = EasyMode.class.getClassLoader().getResource("Images/MediumMode/ElmerFudd.png");
        URL mImage4 = EasyMode.class.getClassLoader().getResource("Images/MediumMode/Lola_Bunny_(SVG).png");
        URL mImage5 = EasyMode.class.getClassLoader().getResource("Images/MediumMode/Marvin_the_Martian.svg.png");
        URL mImage6 = EasyMode.class.getClassLoader().getResource("Images/MediumMode/Porky_Pig.svg.png");
        URL mImage7 = EasyMode.class.getClassLoader().getResource("Images/MediumMode/Sylvester_the_Cat.svg.png");
        URL mImage8 = EasyMode.class.getClassLoader().getResource("Images/MediumMode/Taz-Looney_Tunes.svg.png");
        URL mImage9 = EasyMode.class.getClassLoader().getResource("Images/MediumMode/Tweety.svg.png");
        URL mImage10 = EasyMode.class.getClassLoader().getResource("Images/MediumMode/Yosemite_Sam.svg.png");
        mediumModeURLs.addAll(Arrays.asList(mImage1, mImage2, mImage3, mImage4,
                mImage5, mImage6, mImage7, mImage8, mImage9, mImage10));

        URL hImage1 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-mouse-easter-eggs.png");
        URL hImage2 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-pluto-easter.png");
        URL hImage3 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/34c8c5273925172ddeec167cb931926c.png");
        URL hImage4 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/mickey-mouse-easter3.png");
        URL hImage5 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/daisy-easter.png");
        URL hImage6 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/donald-easter5.png");
        URL hImage7 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/goofy-easter6.png");
        URL hImage8 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/mickey-mouse-easter5.png");
        URL hImage9 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-mouse-easter-eggs.png");
        URL hImage10 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-pluto-easter.png");
        URL hImage11 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-mouse-easter-eggs.png");
        URL hImage12 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/minnie-pluto-easter.png");
        URL hImage13 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/34c8c5273925172ddeec167cb931926c.png");
        URL hImage14 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/mickey-mouse-easter3.png");
        URL hImage15 = EasyMode.class.getClassLoader().getResource("Images/EasyMode/daisy-easter.png");
        hardModeURLs.addAll(Arrays.asList(hImage1, hImage2, hImage3, hImage4, hImage5, hImage6, hImage7,
                hImage8, hImage9, hImage10, hImage11, hImage12, hImage13, hImage14, hImage15));
    }
    public void addEasyImages() {
        for (int i = 0; i < 6; i++) {
            ImageIcon icon = new ImageIcon(getScaled(new ImageIcon(easyModeURLs.get(i)), 235, 260));
            easyModeImages.addAll(Arrays.asList(icon, icon));
        }
    }
    public void addMediumImages() {
        for (int i = 0; i < 10; i++) {
            ImageIcon icon = new ImageIcon(getScaled(new ImageIcon(mediumModeURLs.get(i)), 175, 215));
            mediumModeImages.addAll(Arrays.asList(icon, icon));
        }
    }
    public void addHardImages() {
        for (int i = 0; i < 15; i++) {
            ImageIcon icon = new ImageIcon(getScaled(new ImageIcon(hardModeURLs.get(i)), 200, 1000/6));
            hardModeImages.addAll(Arrays.asList(icon, icon));
        }
    }
    public Image getScaled(ImageIcon icon, int width, int height) {
        return icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
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



//        ImageIcon one = new ImageIcon(new ImageIcon(eImage1).getImage().getScaledInstance(1000/3, 250, Image.SCALE_SMOOTH));
//        easyModeImages.addAll(Arrays.asList(one, one));
//        ImageIcon two = new ImageIcon(new ImageIcon(eImage2).getImage().getScaledInstance(1000/3, 250, Image.SCALE_SMOOTH));
//        easyModeImages.addAll(Arrays.asList(two, two));
//        ImageIcon three = new ImageIcon(new ImageIcon(eImage3).getImage().getScaledInstance(1000/3, 250, Image.SCALE_SMOOTH));
//        easyModeImages.addAll(Arrays.asList(three, three));
//        ImageIcon four = new ImageIcon(new ImageIcon(eImage4).getImage().getScaledInstance(1000/3, 250, Image.SCALE_SMOOTH));
//        easyModeImages.addAll(Arrays.asList(four, four));
//        ImageIcon five = new ImageIcon(new ImageIcon(eImage5).getImage().getScaledInstance(1000/3, 250, Image.SCALE_SMOOTH));
//        easyModeImages.addAll(Arrays.asList(five, five));
//        ImageIcon six = new ImageIcon(new ImageIcon(eImage6).getImage().getScaledInstance(1000/3, 250, Image.SCALE_SMOOTH));
//        easyModeImages.addAll(Arrays.asList(six, six));

//        ImageIcon one = new ImageIcon(new ImageIcon(mImage1).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
//        mediumModeImages.addAll(Arrays.asList(one, one));
//        ImageIcon two = new ImageIcon(new ImageIcon(mImage2).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
//        mediumModeImages.addAll(Arrays.asList(two, two));
//        ImageIcon three = new ImageIcon(new ImageIcon(mImage3).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
//        mediumModeImages.addAll(Arrays.asList(three, three));
//        ImageIcon four = new ImageIcon(new ImageIcon(mImage4).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
//        mediumModeImages.addAll(Arrays.asList(four, four));
//        ImageIcon five = new ImageIcon(new ImageIcon(mImage5).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
//        mediumModeImages.addAll(Arrays.asList(five, five));
//        ImageIcon six = new ImageIcon(new ImageIcon(mImage6).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
//        mediumModeImages.addAll(Arrays.asList(six, six));
//        ImageIcon seven = new ImageIcon(new ImageIcon(mImage7).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
//        mediumModeImages.addAll(Arrays.asList(seven, seven));
//        ImageIcon eight = new ImageIcon(new ImageIcon(mImage8).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
//        mediumModeImages.addAll(Arrays.asList(eight, eight));
//        ImageIcon nine = new ImageIcon(new ImageIcon(mImage9).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
//        mediumModeImages.addAll(Arrays.asList(nine, nine));
//        ImageIcon ten = new ImageIcon(new ImageIcon(mImage10).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));
//        mediumModeImages.addAll(Arrays.asList(ten, ten));

//        ImageIcon one = new ImageIcon(getScaled(new ImageIcon(hImage15), 200, 1000/6));
//        hardModeImages.addAll(Arrays.asList(one, one));
//        ImageIcon two = new ImageIcon(getScaled(new ImageIcon(hImage15), 200, 1000/6));
//        hardModeImages.addAll(Arrays.asList(two, two));
//        ImageIcon three = new ImageIcon(getScaled(new ImageIcon(hImage15), 200, 1000/6));
//        hardModeImages.addAll(Arrays.asList(three, three));
//        ImageIcon four = new ImageIcon(getScaled(new ImageIcon(hImage15), 200, 1000/6));
//        hardModeImages.addAll(Arrays.asList(four, four));
//        ImageIcon five = new ImageIcon(getScaled(new ImageIcon(hImage15), 200, 1000/6));
//        hardModeImages.addAll(Arrays.asList(five, five));
//        ImageIcon six = new ImageIcon(getScaled(new ImageIcon(hImage15), 200, 1000/6));
//        hardModeImages.addAll(Arrays.asList(six, six));
//        ImageIcon seven = new ImageIcon(getScaled(new ImageIcon(hImage15), 200, 1000/6));
//        hardModeImages.addAll(Arrays.asList(seven, seven));
//        ImageIcon eight = new ImageIcon(getScaled(new ImageIcon(hImage15), 200, 1000/6));
//        hardModeImages.addAll(Arrays.asList(eight, eight));
//        ImageIcon nine = new ImageIcon(getScaled(new ImageIcon(hImage15), 200, 1000/6));
//        hardModeImages.addAll(Arrays.asList(nine, nine));
//        ImageIcon ten = new ImageIcon(getScaled(new ImageIcon(hImage15), 200, 1000/6));
//        hardModeImages.addAll(Arrays.asList(ten, ten));
//        ImageIcon eleven = new ImageIcon(getScaled(new ImageIcon(hImage15), 200, 1000/6));
//        hardModeImages.addAll(Arrays.asList(eleven, eleven));
//        ImageIcon twelve = new ImageIcon(getScaled(new ImageIcon(hImage15), 200, 1000/6));
//        hardModeImages.addAll(Arrays.asList(twelve, twelve));
//        ImageIcon thirteen = new ImageIcon(getScaled(new ImageIcon(hImage15), 200, 1000/6));
//        hardModeImages.addAll(Arrays.asList(thirteen, thirteen));
//        ImageIcon fourteen = new ImageIcon(getScaled(new ImageIcon(hImage15), 200, 1000/6));
//        hardModeImages.addAll(Arrays.asList(fourteen, fourteen));
//        ImageIcon fifteen = new ImageIcon(getScaled(new ImageIcon(hImage15), 200, 1000/6));
//        hardModeImages.addAll(Arrays.asList(fifteen, fifteen));
