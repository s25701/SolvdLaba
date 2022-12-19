package SecondHw.ConcertHall.Main;

import  SecondHw.ConcertHall.Exception.CouldntCreateException;
import SecondHw.ConcertHall.Concert.Person;

import static java.lang.String.valueOf;

public class PersonMain {
    public static void main(String[] args) throws CouldntCreateException {
        try{
            Person person1 = new Person("Arzu Kilic", "903847574894", 21);
        } catch (Throwable e) {
            throw new CouldntCreateException("couldnt create person or name",e);
        }

        Person person1 = new Person("Arzu Kilic", "903847574894", 21);
        System.out.println(person1.yearsOfExperience(9, 2));

        System.out.println(person1.yearsOfExperience("Amateur:Three", "Professional:Two"));

        person1.personInfo();
    }
}
