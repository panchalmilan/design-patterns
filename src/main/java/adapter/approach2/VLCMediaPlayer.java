package adapter.approach2;


/**
 * Adaptee
 */
public class VLCMediaPlayer implements AdvMediaPlayer {
    public void playVLC(String audioType, String fileName) {
        System.out.printf("Playing VLC file [%s] in format [%s]\n", fileName, audioType);
    }
}