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

        URL hImage1 = EasyMode.class.getClassLoader().getResource("Images/HardMode/Gary_the_Snail.png");
        URL hImage2 = EasyMode.class.getClassLoader().getResource("Images/HardMode/Mr._Krabs.svg.png");
        URL hImage3 = EasyMode.class.getClassLoader().getResource("Images/HardMode/Mrs._Puff.svg.png");
        URL hImage4 = EasyMode.class.getClassLoader().getResource("Images/HardMode/Patrick_Star.svg.png");
        URL hImage5 = EasyMode.class.getClassLoader().getResource("Images/HardMode/Pearl_the_Whale.svg.png");
        URL hImage6 = EasyMode.class.getClassLoader().getResource("Images/HardMode/Plankton_and_Karen.svg.png");
        URL hImage7 = EasyMode.class.getClassLoader().getResource("Images/HardMode/Sandy_Cheeks.svg.png");
        URL hImage8 = EasyMode.class.getClassLoader().getResource("Images/HardMode/spongebob-gary.png");
        URL hImage9 = EasyMode.class.getClassLoader().getResource("Images/HardMode/spongebob.png");
        URL hImage10 = EasyMode.class.getClassLoader().getResource("Images/HardMode/patrick.png");
        URL hImage11 = EasyMode.class.getClassLoader().getResource("Images/HardMode/spongebob-yay.png");
        URL hImage12 = EasyMode.class.getClassLoader().getResource("Images/HardMode/spongebob-good.png");
        URL hImage13 = EasyMode.class.getClassLoader().getResource("Images/HardMode/spongebob-and-friends.png");
        URL hImage14 = EasyMode.class.getClassLoader().getResource("Images/HardMode/SpongeBob_SquarePants_character.svg.png");
        URL hImage15 = EasyMode.class.getClassLoader().getResource("Images/HardMode/Squidward_Tentacles.svg.png");
        hardModeURLs.addAll(Arrays.asList(hImage1, hImage2, hImage3, hImage4, hImage5, hImage6, hImage7,
                hImage8, hImage9, hImage10, hImage11, hImage12, hImage13, hImage14, hImage15));
    }
    public void addEasyImages() {
        for (int i = 0; i < 6; i++) {
            ImageIcon icon = new ImageIcon(getScaled(new ImageIcon(easyModeURLs.get(i)), 300, 325));
            easyModeImages.addAll(Arrays.asList(icon, icon));
        }
    }
    public void addMediumImages() {
        for (int i = 0; i < 10; i++) {
            ImageIcon icon = new ImageIcon(getScaled(new ImageIcon(mediumModeURLs.get(i)), 175, 250));
            mediumModeImages.addAll(Arrays.asList(icon, icon));
        }
    }
    public void addHardImages() {
        for (int i = 0; i < 15; i++) {
            ImageIcon icon = new ImageIcon(getScaled(new ImageIcon(hardModeURLs.get(i)), 175, 200));
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
