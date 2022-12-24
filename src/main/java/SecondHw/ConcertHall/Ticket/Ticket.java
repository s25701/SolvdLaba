package SecondHw.ConcertHall.Ticket;

final public class Ticket {
    private static boolean status;
    private static TicketClass ticketClass;
    private String ticketId;

    public Ticket() {
    }

    public Ticket(String ticketId, boolean status, TicketClass ticketClass) {
        this.ticketId = ticketId;
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
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        if (ticketId.matches("[a-zA-Z0-9]+$") && ticketId.length() == 3) {
            this.ticketId = ticketId.toUpperCase();
        } else {
            System.out.println("Invalid Ticket ID");
        }
    }

    @Override
    public String toString() {
        return this.getTicketId() + "\t" + isStatus();
    }
}
