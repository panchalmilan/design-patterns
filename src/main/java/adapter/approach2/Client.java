package adapter.approach2;

public class Client {
    public static void main(String[] args) {
        IMediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play("mp3", "MP3 Song");

        IMediaPlayer mediaPlayer2 = new VLCToAudioAdapter(new VLCMediaPlayer());
        mediaPlayer2.play("vlc", "VLC Song");
    }
}
