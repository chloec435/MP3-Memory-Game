import java.io.File;

public class Sounds {
    private File match;
    private File mismatch;
    private File theme;
    public Sounds(String difficulty){
        if (difficulty.equals("easy")) {
            easySounds();
        } else if (difficulty.equals("medium")) {
            mediumSounds();
        } else {
            hardSounds();
        }
    }
    public void easySounds(){
        match = new File("Audio/MMC/MMC You Did It.wav");
        mismatch = new File("Audio/MMC/MM No! (5).wav");
        theme = new File("Audio/MMC/MMC Theme Song.wav");
    }
    public void mediumSounds(){
        match = new File("Audio/MMC/MMC Well All Right, You Did It.wav");
        mismatch = new File("Audio/MMC/MM No! (6).wav");
        theme = new File("Audio/MMC/MMC Theme Song.wav");
    }
    public void hardSounds(){
        match = new File("Audio/MMC/MMC Well All Right, You Did It.wav");
        mismatch = new File("Audio/MMC/MM No! (6).wav");
        theme = new File("Audio/MMC/MMC Theme Song.wav");
    }
    public File getMatch() {
        return match;
    }
    public File getMismatch() {
        return mismatch;
    }
    public File getTheme() {
        return theme;
    }
}
