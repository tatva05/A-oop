package three_b;
public class MusicStreamingApp {

    public static void main(String[] args) {
        // Create different music sources
        MusicSource localFile = new LocalFileSource("path/to/local/file.mp3");
        MusicSource onlineStream = new OnlineStreamingSource("http://example.com/stream");
        MusicSource radioStation = new RadioStationSource("Cool FM");

        // Create basic music players
        MusicPlayer localFilePlayer = new BasicMusicPlayer(localFile);
        MusicPlayer onlineStreamPlayer = new BasicMusicPlayer(onlineStream);
        MusicPlayer radioStationPlayer = new BasicMusicPlayer(radioStation);

        // Decorate music players with additional features
        MusicPlayer localFilePlayerWithFeatures = new EqualizerDecorator(new VolumeControlDecorator(localFilePlayer));
        MusicPlayer onlineStreamPlayerWithFeatures = new EqualizerDecorator(new VolumeControlDecorator(onlineStreamPlayer));
        MusicPlayer radioStationPlayerWithFeatures = new EqualizerDecorator(new VolumeControlDecorator(radioStationPlayer));

        // Play music with additional features
        localFilePlayerWithFeatures.play();
        onlineStreamPlayerWithFeatures.play();
        radioStationPlayerWithFeatures.play();
    }
}
