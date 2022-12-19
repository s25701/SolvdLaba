package SecondHw.ConcertHall.Concert;

public class Instrument {
    private String name;

    public Instrument(String name) {
        this.name=name;
    }

    public void setInstrument(String name){
        this.name=name;
    }
    public String getInstrument(){
        return name;
    }

    @Override
    public String toString(){
        return name;
    }

}
