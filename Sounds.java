import java.io.File;

public class Sounds {
    private File match;
    private File mismatch;
    private File theme;
    public Sounds(String difficulty){
        if (difficulty.equals("impossible")) {
            impossibleSounds();
        } if (difficulty.equals("hard")) {
            hardSounds();
        } else if (difficulty.equals("medium")) {
            mediumSounds();
        } else {
            easySounds();
        }
    }
    public void easySounds(){
        match = new File("Audio/MMC/MMC Well All Right.wav");
        mismatch = new File("Audio/MMC/MM No! (7).wav");
        theme = new File("Audio/MMC/MMC Theme Song.wav");
    }
    public void mediumSounds(){
        match = new File("Audio/LT/LT Yippee! Hooray!.wav");
        mismatch = new File("Audio/LT/LT That's Wrong Ya Try It Again!.wav");
        theme = new File("Audio/LT/Looney Tunes_ The Merry-Go-Round Broke Down Evolution 1937 - Present.wav");
    }
    public void hardSounds(){
        match = new File("Audio/SS/SS Yes! Yeah!.wav");
        mismatch = new File("Audio/SS/SS Wa Wa Wa.wav");
        theme = new File("Audio/SS/SS Theme Song.wav");
    }
    public void impossibleSounds(){
        match = new File("Audio/SS/SS Yes! Yeah!.wav");
        mismatch = new File("Audio/SS/SS Wa Wa Wa.wav");
        theme = new File("Audio/SS/SS Theme Song.wav");
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
