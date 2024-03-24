import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class EasyMode extends Mode{
    public EasyMode() throws UnsupportedAudioFileException, LineUnavailableException, IOException {

        super("easy",3,4);
    }
}
