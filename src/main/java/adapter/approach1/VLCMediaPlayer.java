package adapter.approach1;

public class VLCMediaPlayer {
    public void playVLC(String audioType, String fileName) {
        System.out.printf("Playing VLC file [%s] in format [%s]\n", fileName, audioType);
    }
}

// Problem : Client has used IMediaPlayer in code at multiple places
// VLCMediaPlayer has playVLC() function & not play()
// cannot implement IMediaPlayer here!