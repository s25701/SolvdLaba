package SecondHw.ConcertHall.Concert;

import SecondHw.ConcertHall.Ticket.TicketClass;

public class ConcertSection {
    private TicketClass ticketClass;

    public ConcertSection(TicketClass ticketClass) {
        this.ticketClass = ticketClass;
    }

    public void setTicketClass(TicketClass ticketClass) {
        this.ticketClass = ticketClass;
    }

    public TicketClass getTicketClass() {
        return ticketClass;
    }

    @Override
    public String toString() {
        return "Ticket Class: " + ticketClass;
    }
}
