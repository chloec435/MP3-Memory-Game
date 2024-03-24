import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class HardMode extends Mode {
    public HardMode() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        super("hard",5,6);
    }
}
