package SecondHw.ConcertHall.Concert;

import java.util.List;

public class ConcertHall {
    private static String concertHallId;
    private Address address;
    private List<ConcertSection> concertSection;

    public ConcertHall(String concertHallId, Address address, List<ConcertSection> concertSection) {
        this.setConcertHallId(concertHallId);
        this.setAddress(address);
        this.setConcertSection(concertSection);
    }

    public String getConcertHallId() {
        return concertHallId;
    }

    public void setConcertHallId(String concertHallId) {
        if (concertHallId.matches("[a-zA-Z]+$") && concertHallId.length() == 3) {
            ConcertHall.concertHallId = concertHallId.toUpperCase();
        } else {
            System.out.println("Invalid SecondHw.ConcertHall ID");
        }
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
