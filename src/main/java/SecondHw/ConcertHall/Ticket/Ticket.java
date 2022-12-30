package SecondHw.ConcertHall.Ticket;

final public class Ticket {
    private static int nextTicketId = 0;
    private static boolean status;
    private static TicketClass ticketClass;
    private final int ticketId;

    public Ticket() {
        ticketId = nextTicketId++;
    }

    public Ticket(boolean status, TicketClass ticketClass) {
        ticketId = nextTicketId++;
        Ticket.status = status;
        Ticket.ticketClass = ticketClass;
    }

    public static TicketClass getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(TicketClass ticketClass) {
        Ticket.ticketClass = ticketClass;
    }

    public static boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        Ticket.status = status;
    }

    public static void printTicketPrice() {
        switch (ticketClass) {
            case FIRST:
                System.out.println(700);
                break;
            case BUSINESS:
                System.out.println(500);
                break;
            case ECONOMY:
                System.out.println(30);
                break;
            default:
                System.out.println("This ticket type is not defined");
                break;
        }
    }

    public String getTicketId() {
        return "T" + ticketId;
    }

    @Override
    public String toString() {
        return this.getTicketId() + "\t" + isStatus();
    }
}
