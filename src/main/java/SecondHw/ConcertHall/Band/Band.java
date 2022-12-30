package SecondHw.ConcertHall.Band;


import java.util.List;

public class Band<T extends MusicInstrument> {
    final String bandOrigin;
    private final String name;
    private List<Person> person;
    private List<MusicInstrument> musicInstrument;

    public Band(String name, List<Person> person, String bandOrigin, List<MusicInstrument> musicInstrument) {
        this.name = name;
        this.person = person;
        this.bandOrigin = bandOrigin;
        this.musicInstrument = musicInstrument;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }

    public List<MusicInstrument> getMusicInstrument() {
        return musicInstrument;
    }

    public void setMusicInstrument(List<MusicInstrument> musicInstrument) {
        this.musicInstrument = musicInstrument;
    }

    public void printAllPerson(List<Person> person) {
        for (Object persons : person)
            System.out.println(persons + " ");
    }

    @Override
    public String toString() {
        return name + " " + "," + person + " " + "," + bandOrigin + " " + "," + musicInstrument;
    }
}
