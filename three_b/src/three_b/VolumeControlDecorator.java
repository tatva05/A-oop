package three_b;

public class VolumeControlDecorator extends MusicPlayerDecorator {

    public VolumeControlDecorator(MusicPlayer decoratedMusicPlayer) {
        super(decoratedMusicPlayer);
    }

    @Override
    public void play() {
        decoratedMusicPlayer.play();
        setVolumeControl();
    }

    private void setVolumeControl() {
        System.out.println("Setting volume control.");
    }
}
