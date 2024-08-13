package musicstreamapplication;

public class EqualizerDecorator extends MusicSourceDecorator {
    public EqualizerDecorator(MusicSource decoratedMusicSource) {
        super(decoratedMusicSource);
    }

    @Override
    public void play() {
        decoratedMusicSource.play();
        setEqualizer();
    }

    private void setEqualizer() {
        System.out.println("Applying equalizer settings...");
    }
}
