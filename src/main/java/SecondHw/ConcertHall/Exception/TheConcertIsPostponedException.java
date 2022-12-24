package SecondHw.ConcertHall.Exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TheConcertIsPostponedException extends Exception {
    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public TheConcertIsPostponedException(String message, Throwable cause) {
        super(message, cause);
    }

    public static void DatePostponed() {
        LOGGER.log(Level.WARNING, "COULDNT POSTPONE CONCERT DATE!");
    }

}
