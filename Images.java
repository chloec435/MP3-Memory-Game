import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class Images {
    private final ArrayList<URL> easyModeURLs = new ArrayList<URL>();
    private final ArrayList<URL> mediumModeURLs = new ArrayList<URL>();
    private final ArrayList<URL> hardModeURLs = new ArrayList<URL>();
    private final ArrayList<URL> impossibleModeURLs = new ArrayList<URL>();
    private final ArrayList<ImageIcon> easyModeImages = new ArrayList<ImageIcon>();
    private final ArrayList<ImageIcon> mediumModeImages = new ArrayList<ImageIcon>();
    private final ArrayList<ImageIcon> hardModeImages = new ArrayList<ImageIcon>();
    private final ArrayList<ImageIcon> impossibleModeImages = new ArrayList<ImageIcon>();
    public Images(String difficulty) {
        urls();
        if (difficulty.equals("impossible")) {
            addImpossibleImages();
        }
        if (difficulty.equals("hard")) {
            addHardImages();
        }
        if (difficulty.equals("medium")) {
            addMediumImages();
        }
        if (difficulty.equals("easy")) {
            addEasyImages();
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

        URL mImage1 = MediumMode.class.getClassLoader().getResource("Images/MediumMode/Bugs_Bunny.svg.png");
        URL mImage2 = MediumMode.class.getClassLoader().getResource("Images/MediumMode/Daffy_Duck.svg.png");
        URL mImage3 = MediumMode.class.getClassLoader().getResource("Images/MediumMode/ElmerFudd.png");
        URL mImage4 = MediumMode.class.getClassLoader().getResource("Images/MediumMode/Lola_Bunny_(SVG).png");
        URL mImage5 = MediumMode.class.getClassLoader().getResource("Images/MediumMode/Marvin_the_Martian.svg.png");
        URL mImage6 = MediumMode.class.getClassLoader().getResource("Images/MediumMode/Porky_Pig.svg.png");
        URL mImage7 = MediumMode.class.getClassLoader().getResource("Images/MediumMode/Sylvester_the_Cat.svg.png");
        URL mImage8 = MediumMode.class.getClassLoader().getResource("Images/MediumMode/Taz-Looney_Tunes.svg.png");
        URL mImage9 = MediumMode.class.getClassLoader().getResource("Images/MediumMode/Tweety.svg.png");
        URL mImage10 = MediumMode.class.getClassLoader().getResource("Images/MediumMode/Yosemite_Sam.svg.png");
        mediumModeURLs.addAll(Arrays.asList(mImage1, mImage2, mImage3, mImage4,
                mImage5, mImage6, mImage7, mImage8, mImage9, mImage10));

        URL hImage1 = HardMode.class.getClassLoader().getResource("Images/HardMode/Gary_the_Snail.png");
        URL hImage2 = HardMode.class.getClassLoader().getResource("Images/HardMode/Mr._Krabs.svg.png");
        URL hImage3 = HardMode.class.getClassLoader().getResource("Images/HardMode/Mrs._Puff.svg.png");
        URL hImage4 = HardMode.class.getClassLoader().getResource("Images/HardMode/Patrick_Star.svg.png");
        URL hImage5 = HardMode.class.getClassLoader().getResource("Images/HardMode/Pearl_the_Whale.svg.png");
        URL hImage6 = HardMode.class.getClassLoader().getResource("Images/HardMode/Plankton_and_Karen.svg.png");
        URL hImage7 = HardMode.class.getClassLoader().getResource("Images/HardMode/Sandy_Cheeks.svg.png");
        URL hImage8 = HardMode.class.getClassLoader().getResource("Images/HardMode/spongebob-gary.png");
        URL hImage9 = HardMode.class.getClassLoader().getResource("Images/HardMode/spongebob.png");
        URL hImage10 = HardMode.class.getClassLoader().getResource("Images/HardMode/patrick.png");
        URL hImage11 = HardMode.class.getClassLoader().getResource("Images/HardMode/spongebob-yay.png");
        URL hImage12 = HardMode.class.getClassLoader().getResource("Images/HardMode/spongebob-good.png");
        URL hImage13 = HardMode.class.getClassLoader().getResource("Images/HardMode/spongebob-and-friends.png");
        URL hImage14 = HardMode.class.getClassLoader().getResource("Images/HardMode/SpongeBob_SquarePants_character.svg.png");
        URL hImage15 = HardMode.class.getClassLoader().getResource("Images/HardMode/Squidward_Tentacles.svg.png");
        hardModeURLs.addAll(Arrays.asList(hImage1, hImage2, hImage3, hImage4, hImage5, hImage6, hImage7,
                hImage8, hImage9, hImage10, hImage11, hImage12, hImage13, hImage14, hImage15));

        URL iImage1 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Abe_Simpson.png");
        URL iImage2 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Apu_Nahasapeemapetilon_(The_Simpsons).png");
        URL iImage3 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Barney_Gumble.png");
        URL iImage4 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Bart_Simpson_200px.png");
        URL iImage5 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Chief_Wiggum.png");
        URL iImage6 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Dr._Hibbert.svg.png");
        URL iImage7 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Edna_Krabappel.png");
        URL iImage8 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/FatTony.png");
        URL iImage9 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Frink.png");
        URL iImage10 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/GroundskeeperWillie.png");
        URL iImage11 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Homer_Simpson_2006.png");
        URL iImage12 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Krustytheclown.png");
        URL iImage13 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Lisa_Simpson.png");
        URL iImage14 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Maggie_Simpson.png");
        URL iImage15 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Marge_Simpson.png");
        URL iImage16 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Mayor_Quimby.png");
        URL iImage17 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Milhouse_Van_Houten.png");
        URL iImage18 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Moe_Szyslak.png");
        URL iImage19 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Mr_Burns.png");
        URL iImage20 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Ned_Flanders.png");
        URL iImage21 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Nelson_Muntz.png");
        URL iImage22 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Patty_Bouvier.png");
        URL iImage23 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Ralph_Wiggum.png");
        URL iImage24 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Rev_Lovejoy.png");
        URL iImage25 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Selma_Bouvier.png");
        URL iImage26 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Seymour_Skinner.png");
        URL iImage27 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/The_Simpsons-Jeff_Albertson.png");
        URL iImage28 = ImpossibleMode.class.getClassLoader().getResource("Images/ImpossibleMode/Waylon_Smithers_1.png");
        impossibleModeURLs.addAll(Arrays.asList(iImage1, iImage2, iImage3, iImage4, iImage5, iImage6, iImage7, iImage8,
                iImage9, iImage10, iImage11, iImage12, iImage13, iImage14, iImage15, iImage16, iImage17, iImage18,
                iImage19, iImage20, iImage21, iImage22, iImage23, iImage24, iImage25, iImage26, iImage27, iImage28));
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
    public void addImpossibleImages() {
        for (int i = 0; i < 28; i++) {
            ImageIcon icon = new ImageIcon(getScaled(new ImageIcon(impossibleModeURLs.get(i)), 125, 150));
            impossibleModeImages.addAll(Arrays.asList(icon, icon));
        }
    }
    public Image getScaled(ImageIcon icon, int width, int height) {
        return icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }
    public ArrayList<ImageIcon> getImages(String difficulty) {
        if (difficulty.equals("impossible")) {
            return impossibleModeImages;
        } else if (difficulty.equals("hard")) {
            return hardModeImages;
        } else if (difficulty.equals("medium")) {
            return mediumModeImages;
        } else {
            return easyModeImages;
        }
    }
}
