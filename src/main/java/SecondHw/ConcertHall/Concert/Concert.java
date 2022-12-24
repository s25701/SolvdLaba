package SecondHw.ConcertHall.Concert;

import SecondHw.ConcertHall.Actions.IConcertStartStop;
import SecondHw.ConcertHall.Band.Band;
import SecondHw.ConcertHall.Exception.ConcertDateException;
import SecondHw.ConcertHall.Exception.TheConcertIsPostponedException;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Concert implements IConcertStartStop {
    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private static String concertHallId;
    private String concertNumber;
    private LocalDate concertDate;
    private List<Company> company;
    private List<Band> band;

    public Concert() {

    }

    public Concert(String concertNumber, LocalDate concertDate, String concertHallId, List<Band> band, List<Company> company) {
        String companyID = concertNumber.substring(0, 2);
        String number = concertNumber.substring(2);
        this.setConcertNumber(companyID, number);
        this.concertDate = concertDate;
        Concert.concertHallId = concertHallId.toUpperCase();
        this.band = band;
        this.company = company;
    }

    public static void welcomeLog() {
        LOGGER.log(Level.INFO, "Welcome to Concert organization console!");
    }

    public void setConcertNumber(String str, String number) {

        if (str.matches("[a-zA-Z]+$") && str.length() == 2 && number.matches("[0-9 ]+$")) {
            this.concertNumber = str + number;
        } else {
            System.out.println("Invalid Concert Number");
        }
    }

    public List<Band> getBands() {
        return band;
    }

    public void setBands(List<Band> person) {
        this.band = band;
    }

    public List<Company> getCompanies() {
        return company;
    }

    public void setCompanies(List<Company> person) {
        this.company = company;
    }

    public String getConcertNumber() {
        return concertNumber;
    }

    public LocalDate getConcertDate() throws ConcertDateException {
        return concertDate;
    }

    public void setConcertDate(LocalDate concertDate) {
        this.concertDate = concertDate;
    }

    public String getConcertHallId() {
        return concertHallId;
    }

    public void setConcertHallId(String concertHallId) {

        if (concertHallId.matches("[a-zA-Z]+$") && concertHallId.length() == 3) {
            Concert.concertHallId = concertHallId.toUpperCase();
        } else {
            System.out.println("Invalid SecondHw.ConcertHall ID");
        }
    }

    @Override
    public String toString() {
        return "Concert number:" + concertNumber + "\n" + "Concert date:" + concertDate + "\n" + "ConcertHallId:" + concertHallId + "\n " + "Band name:" + " " + band + "\n " + "Company sponsored:" + company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this != o) return false;
        return o != null;
    }

    @Override
    public int hashCode() {
        int result = concertNumber != null ? concertNumber.hashCode() : 0;

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
