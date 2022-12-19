package SecondHw.ConcertHall.Main;

import SecondHw.ConcertHall.Concert.Band;
import SecondHw.ConcertHall.Concert.Instrument;
import SecondHw.ConcertHall.Concert.MusicInstrument;
import SecondHw.ConcertHall.Concert.Person;

import java.util.ArrayList;
import java.util.List;

public class BandMain {
    public static void main(String[] args) {
        List<Person> band1Person = new ArrayList<>();
        List<MusicInstrument> musicInstruments1= new ArrayList<>();
        Person person1 = new Person("Arzu Kilic", "903847574894", 21);
        Person person2 = new Person("Beyza Sonmez", "9038574894", 20);
        Instrument instrument1=new Instrument("guitar");
        MusicInstrument musicInstrument1=new MusicInstrument(instrument1, "classical");
        Instrument instrument2=new Instrument("piano");
        MusicInstrument musicInstrument2=new MusicInstrument(instrument2, "classical");
        band1Person.add(person1);
        band1Person.add(person2);
        musicInstruments1.add(musicInstrument1);
        musicInstruments1.add(musicInstrument2);
        Band band1 = new Band("Turkai", band1Person, "Turkey", musicInstruments1);
        System.out.println("Band 1:" + " " + band1);
        band1.printAllPerson(band1Person);
    }
}
