package three_b;

public class LocalFileSource implements MusicSource {
    private String filePath;

    public LocalFileSource(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void play() {
        System.out.println("Playing local file from path: " + filePath);
    }
}
