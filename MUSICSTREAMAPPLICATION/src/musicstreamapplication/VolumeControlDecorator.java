package musicstreamapplication;

public class VolumeControlDecorator extends MusicSourceDecorator {
    public VolumeControlDecorator(MusicSource decoratedMusicSource) {
        super(decoratedMusicSource);
    }

    @Override
    public void play() {
        decoratedMusicSource.play();
        adjustVolume();
    }

    private void adjustVolume() {
        System.out.println("Adjusting volume...");
    }
}
