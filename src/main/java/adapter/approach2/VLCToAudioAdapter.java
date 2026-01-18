package adapter.approach2;

public class VLCToAudioAdapter implements IMediaPlayer {
    AdvMediaPlayer advMediaPlayer;

    public VLCToAudioAdapter(AdvMediaPlayer advMediaPlayer) {
        this.advMediaPlayer = advMediaPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        advMediaPlayer.playVLC(audioType, fileName);
    }
}
