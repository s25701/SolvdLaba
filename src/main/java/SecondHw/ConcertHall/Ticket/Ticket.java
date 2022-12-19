package SecondHw.ConcertHall.Ticket;

final public class Ticket{
    private String ticketId;
    private boolean status;
    private TicketClass ticketClass;

    public Ticket(String ticketId, boolean status, TicketClass ticketClass) {
        this.ticketId = ticketId;
        this.status = status;
        this.ticketClass=ticketClass;
    }
    public void setTicketClass(TicketClass ticketClass) {
        this.ticketClass = ticketClass;
    }

    public TicketClass getTicketClass() {
        return ticketClass;
    }

    public void setTicketId(String ticketId) {
        if (ticketId.matches("[a-zA-Z0-9]+$") && ticketId.length() == 3) {
            this.ticketId = ticketId.toUpperCase();
        } else {
            System.out.println("Invalid Ticket ID");
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTicketId() {
        return ticketId;
    }

    public boolean isStatus() {
        return status;
    }

    public void ticketPrice(){
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

    @Override
    public String toString() {
        return this.getTicketId() + "\t" + this.isStatus();
    }
}
