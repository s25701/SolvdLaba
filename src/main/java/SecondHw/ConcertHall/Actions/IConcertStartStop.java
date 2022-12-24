package SecondHw.ConcertHall.Actions;

import SecondHw.ConcertHall.Exception.TheConcertIsPostponedException;

public interface IConcertStartStop {
    void concertStart() throws Exception;

    void concertStop() throws TheConcertIsPostponedException;
}
