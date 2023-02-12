package SecondHw.ConcertHall.Band;

public enum InstrumentType {

    ACOUSTIC("Acoustic"),
    ELECTRICAL("Electrical"),
    CLASSICAL("Classical");

    private final String instrumentType;

    InstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getInstrumentType() {
        return instrumentType;
    }
}
