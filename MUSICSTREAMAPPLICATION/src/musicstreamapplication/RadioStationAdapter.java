package musicstreamapplication;

public class RadioStationAdapter implements MusicSource {
    private RadioStationPlayer radioStationPlayer;

    public RadioStationAdapter(RadioStationPlayer radioStationPlayer) {
        this.radioStationPlayer = radioStationPlayer;
    }

    @Override
    public void play() {
        radioStationPlayer.playRadioStation();
    }
}
