package SecondHw.ConcertHall.Concert;

import SecondHw.ConcertHall.Actions.IConcertStartStop;
import SecondHw.ConcertHall.Band.Band;
import SecondHw.ConcertHall.Exception.ConcertDateException;
import SecondHw.ConcertHall.Exception.TheConcertIsPostponedException;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.String.valueOf;

public class Concert implements IConcertStartStop {
    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private static int nextConcertNumber = 1;
    private final int concertNumber;
    private ConcertHall concertHall;
    private LocalDate concertDate;
    private List<Company> company;
    private List<Band> band;

    public Concert() {
        concertNumber = nextConcertNumber++;
    }

    public Concert(LocalDate concertDate, List<Band> band, List<Company> company, ConcertHall concertHall) {
        this.concertHall = concertHall;
        concertNumber = nextConcertNumber++;
        this.concertDate = concertDate;
        this.band = band;
        this.company = company;
    }

    public static void welcomeLog() {
        LOGGER.log(Level.INFO, "Welcome to Concert organization console!");
    }

    public List<Band> getBands() {
        return band;
    }

    public void setBands(List<Band> band) {
        this.band = band;
    }

    public List<Company> getCompanies() {
        return company;
    }

    public void setCompanies(List<Company> company) {
        this.company = company;
    }

    public void setConcertHall(ConcertHall concertHall) {
        this.concertHall = concertHall;
    }

    public String getConcertNumber() {
        return "Concert" + concertNumber;
    }

    public LocalDate getConcertDate() throws ConcertDateException {
        return concertDate;
    }

    public void setConcertDate(LocalDate concertDate) {
        this.concertDate = concertDate;
    }

    @Override
    public String toString() {
        return "Concert number:" + concertNumber + "\n" + "Concert date:" + concertDate + "\n" + "ConcertHallId:" + concertHall.getConcertHallId() + "\n " + "Bands name:" + " " + band + "\n " + "Companies sponsored:" + company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this != o) return false;
        return o != null;
    }

    @Override
    public int hashCode() {
        int result = concertNumber != 0 ? valueOf(concertNumber).hashCode() : 0;

        return result;
    }

    @Override
    public void concertStart() throws ConcertDateException {
        try {
            Concert concert = new Concert();
            int b = (LocalDate.now().compareTo(concert.getConcertDate()));
            if (b == 0 && concert != null)
                System.out.println(concert.getConcertNumber() + " " + "The concert is today have fun:)");
            else if (b < 0) {
                LocalDate date1 = concert.getConcertDate().minusDays(b);
                System.out.println("The concert date has changed to todays date have fun:) Today's date:" + " " + date1 + " " + concert.getConcertNumber());
            } else
                System.out.println("The concert is already finished changes can't be made");
        } catch (Throwable e) {
            throw new ConcertDateException("The concert couldnt be started", e);
        }
    }

    @Override
    public void concertStop() throws TheConcertIsPostponedException {

        try {
            Concert concert = new Concert();
            int b = (LocalDate.now().compareTo(concert.getConcertDate()));
            if (b == 0 || b > 0 && concert != null) {
                System.out.println("The concert is postponed for future date");
            }
        } catch (Throwable e) {
            throw new TheConcertIsPostponedException("The concert couldn't be stopped", e);
        } finally {
            System.out.println("The concert isn't going to happen today");
        }
    }
}
