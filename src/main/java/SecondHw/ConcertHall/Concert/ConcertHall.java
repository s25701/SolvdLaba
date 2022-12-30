package SecondHw.ConcertHall.Concert;

import java.util.List;

public class ConcertHall {
    private static int nextConcertHallId = 0;
    private final int concertHallId;
    private Address address;
    private List<ConcertSection> concertSection;

    public ConcertHall() {
        concertHallId = nextConcertHallId++;
    }

    public ConcertHall(Address address, List<ConcertSection> concertSection) {
        concertHallId = nextConcertHallId++;
        this.setAddress(address);
        this.setConcertSection(concertSection);
    }

    public String getConcertHallId() {
        return "CH" + concertHallId;
    }

    public List<ConcertSection> getConcertSection() {
        return concertSection;
    }

    public void setConcertSection(List<ConcertSection> concertSection) {
        this.concertSection = concertSection;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.getConcertHallId() + "," + this.getAddress() + "," + this.getConcertSection();
    }
}
