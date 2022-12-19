package SecondHw.ConcertHall.Exception;

public class TicketIsTakenException extends Exception{
    public TicketIsTakenException(String message, Throwable cause) {
        super(message, cause);
    }
}
