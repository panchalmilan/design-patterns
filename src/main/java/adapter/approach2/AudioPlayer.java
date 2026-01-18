package adapter.approach2;

/**
 * This AudioPlayer classes supports playing mp3 audio type only
 */
public class AudioPlayer implements IMediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        System.out.printf("Playing file [%s] in format [%s]\n", fileName, audioType);
    }
}
