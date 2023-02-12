package SecondHw.ConcertHall.Band;

import SecondHw.ConcertHall.Ticket.Ticket;
import SecondHw.ConcertHall.Ticket.TicketClass;

public class MusicInstrument {
    private final Instrument instrument;
    private static InstrumentType instrumentType;

    public MusicInstrument(Instrument instrument, InstrumentType instrumentType) {
        this.instrument = instrument;
        this.instrumentType = instrumentType;
    }

    public static InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public static void printInstrumentType() {
        switch (instrumentType) {
            case ACOUSTIC:
                System.out.println("Acoustic");
                break;
            case ELECTRICAL:
                System.out.println("Electrical");
                break;
            case CLASSICAL:
                System.out.println("Classical");
                break;
            default:
                System.out.println("This instrumentType is not defined");
                break;
        }
    }

    @Override
    public String toString() {
        return instrument + " " + instrumentType;
    }
}
