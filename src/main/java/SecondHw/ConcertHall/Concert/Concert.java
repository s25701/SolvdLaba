package SecondHw.ConcertHall.Concert;

import SecondHw.ConcertHall.Exception.ConcertDateException;
import SecondHw.ConcertHall.Exception.TheConcertIsPostponedException;

import java.util.*;
import java.time.LocalDate;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Concert implements IConcertStartStop {
    private String concertNumber;
    private LocalDate concertDate;
    private static String concertHallId;
    private Company company;
    private Band band;
    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public Concert() {

    }

    public Concert(String concertNumber, LocalDate concertDate, String concertHallId, Band band, Company company) {
        String companyID = concertNumber.substring(0, 2);
        String number = concertNumber.substring(2);
        this.setConcertNumber(companyID, number);
        this.concertDate = concertDate;
        Concert.concertHallId = concertHallId.toUpperCase();
        this.band = band;
        this.company = company;
    }

    public void welcomeLog() {
        LOGGER.log(Level.INFO, "Welcome to Concert organization console!");
    }

    public void setConcertNumber(String companyID, String number) {

        if (companyID.matches("[a-zA-Z]+$") && companyID.length() == 2 && number.matches("[0-9 ]+$")) {
            this.concertNumber = companyID + number;
        } else {
            System.out.println("Invalid Concert Number");
        }
    }

    public void setConcertDate(LocalDate concertDate) {
        this.concertDate = concertDate;
    }

    public void setConcertHallId(String concertHallId) {

        if (concertHallId.matches("[a-zA-Z]+$") && concertHallId.length() == 3) {
            Concert.concertHallId = concertHallId.toUpperCase();
        } else {
            System.out.println("Invalid SecondHw.ConcertHall ID");
        }
    }

    public String getConcertNumber() {
        return concertNumber;
    }

    public LocalDate getConcertDate() throws ConcertDateException {
        return concertDate;
    }

    public String getConcertHallId() {
        return concertHallId;
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
    public void concertStart() throws Exception {
        List<Person> band1Person = new ArrayList<>();
        List<MusicInstrument> musicInstruments1= new ArrayList<>();
        Person person1 = new Person("Arzu Kilic", "903847574894", 21);
        Person person2 = new Person("Beyza Sonmez", "9038574894", 20);
        Instrument instrument1=new Instrument("guitar");
        MusicInstrument musicInstrument1=new MusicInstrument(instrument1, "classical");
        Instrument instrument2=new Instrument("piano");
        MusicInstrument musicInstrument2=new MusicInstrument(instrument2, "classical");
        band1Person.add(person1);
        band1Person.add(person2);
        musicInstruments1.add(musicInstrument1);
        musicInstruments1.add(musicInstrument2);
        Band band1 = new Band("Turkai", band1Person, "Turkai", musicInstruments1);
        Company company1 = new Company("FF", "Japonska LTD");
        Concert concert1 = new Concert("FF 12", LocalDate.of(2002, 8, 1), "FF", band1, company1);
        int b = (LocalDate.now().compareTo(concert1.getConcertDate()));
        if (b == 0)
            System.out.println(concert1.getConcertNumber() + " " + "The concert is today have fun:)");
        else if (b < 0) {
            LocalDate date1 = concert1.getConcertDate().minusDays(b);
            System.out.println("The concert date has changed to todays date have fun:) Today's date:" + " " + date1 + " " + concert1.getConcertNumber());
        } else
            System.out.println("The concert is already finished changes can't be made");
    }

    @Override
    public void concertStop() throws TheConcertIsPostponedException {

        try {
            List<Person> band1Person = new ArrayList<>();
            List<MusicInstrument> musicInstruments1= new ArrayList<>();
            Person person1 = new Person("Arzu Kilic", "903847574894", 21);
            Person person2 = new Person("Beyza Sonmez", "9038574894", 20);
            Instrument instrument1=new Instrument("guitar");
            MusicInstrument musicInstrument1=new MusicInstrument(instrument1, "classical");
            Instrument instrument2=new Instrument("piano");
            MusicInstrument musicInstrument2=new MusicInstrument(instrument2, "classical");
            band1Person.add(person1);
            band1Person.add(person2);
            musicInstruments1.add(musicInstrument1);
            musicInstruments1.add(musicInstrument2);
            Band band1 = new Band("Turkai", band1Person, "Turkai", musicInstruments1);
            Company company1 = new Company("FF", "Japonska LTD");
            Concert concert2 = new Concert("FF 23", LocalDate.of(2003, 7, 1), "Kb", band1, company1);
            int b = (LocalDate.now().compareTo(concert2.getConcertDate()));
            if (b == 0 || b > 0) {
                System.out.println("The concert is postponed for future date");
            }
        } catch (Throwable e) {
            throw new TheConcertIsPostponedException("The concert couldn't be stopped", e);
        } finally {
            System.out.println("The concert isn't going to happen today");
        }
    }
}
