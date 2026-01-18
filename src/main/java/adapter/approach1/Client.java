package adapter.approach1;

public class Client {
    public static void main(String[] args) {
        IMediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play("mp3", "MP3 Song");
    }
}
