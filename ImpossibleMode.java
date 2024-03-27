import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class ImpossibleMode extends Mode {
    public ImpossibleMode() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        super("impossible",7,8);
    }
}
