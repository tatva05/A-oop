package musicstreamapplication;

public class Client {
    public static void main(String[] args) {
        // Create local file player
        MusicSource localFilePlayer = new LocalFileAdapter(new LocalFilePlayer());
        // Create online streaming player
        MusicSource onlineStreamingPlayer = new OnlineStreamingAdapter(new OnlineStreamingPlayer());
        // Create radio station player
        MusicSource radioStationPlayer = new RadioStationAdapter(new RadioStationPlayer());

        // Decorate local file player with equalizer and volume control
        MusicSource decoratedLocalFilePlayer = new VolumeControlDecorator(new EqualizerDecorator(localFilePlayer));
        // Decorate online streaming player with equalizer and volume control
        MusicSource decoratedOnlineStreamingPlayer = new VolumeControlDecorator(new EqualizerDecorator(onlineStreamingPlayer));
        // Decorate radio station player with equalizer and volume control
        MusicSource decoratedRadioStationPlayer = new VolumeControlDecorator(new EqualizerDecorator(radioStationPlayer));

        // Play music from different sources with decorations
        System.out.println("Playing from local file:");
        decoratedLocalFilePlayer.play();

        System.out.println("\nPlaying from online streaming:");
        decoratedOnlineStreamingPlayer.play();

        System.out.println("\nPlaying from radio station:");
        decoratedRadioStationPlayer.play();
    }
}
