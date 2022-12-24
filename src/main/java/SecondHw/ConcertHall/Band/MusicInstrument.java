package SecondHw.ConcertHall.Band;

public class MusicInstrument {
    private final Instrument instrument;
    private String type;

    public MusicInstrument(Instrument instrument, String type) {
        this.instrument = instrument;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return instrument + " " + type;
    }
}
