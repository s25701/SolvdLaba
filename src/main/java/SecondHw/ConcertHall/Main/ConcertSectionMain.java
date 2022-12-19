package SecondHw.ConcertHall.Main;

import SecondHw.ConcertHall.Ticket.TicketClass;
import SecondHw.ConcertHall.Concert.ConcertSection;

public class ConcertSectionMain{

    public static void main(String[] args) {

        ConcertSection concertSection1 = new ConcertSection(TicketClass.ECONOMY);
        System.out.println(concertSection1 );

        ConcertSection concertSection2 = new ConcertSection(TicketClass.BUSINESS);
        System.out.println(concertSection2 );

        System.out.println(concertSection2.getTicketClass());
    }
}
