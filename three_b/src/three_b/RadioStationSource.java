package three_b;

public class RadioStationSource implements MusicSource {
    private String station;

    public RadioStationSource(String station) {
        this.station = station;
    }

    @Override
    public void play() {
        System.out.println("Playing radio station: " + station);
    }
}
