package SecondHw.ConcertHall.Band;

public class Instrument {
    private String name;

    public Instrument(String name) {
        this.name = name;
    }

    public String getInstrument() {
        return name;
    }

    public void setInstrument(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
