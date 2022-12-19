package SecondHw.ConcertHall.Concert;

import SecondHw.ConcertHall.Concert.Concert;

public class Organization <T extends Concert>{
    private final T concert;

    public Organization(T concert){
        this.concert = concert;
    }

    @Override
    public String toString(){
        return "\n\n\nScheduled Concerts:\n\n " + concert;
    }
}
