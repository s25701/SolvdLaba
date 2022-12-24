package SecondHw.ConcertHall.Ticket;

public enum TicketClass {

    FIRST(700),
    BUSINESS(500),
    ECONOMY(30);

    private final int price;

    TicketClass(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
