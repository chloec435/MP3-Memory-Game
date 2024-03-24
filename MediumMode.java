import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class MediumMode extends Mode{
    public MediumMode() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        super("medium",4,5);
    }
}
