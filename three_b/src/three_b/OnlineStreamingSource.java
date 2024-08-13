package three_b;

public class OnlineStreamingSource implements MusicSource {
    private String url;

    public OnlineStreamingSource(String url) {
        this.url = url;
    }

    @Override
    public void play() {
        System.out.println("Streaming music from URL: " + url);
    }
}
