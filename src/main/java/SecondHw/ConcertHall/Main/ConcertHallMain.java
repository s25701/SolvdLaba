package SecondHw.ConcertHall.Main;

import SecondHw.ConcertHall.Concert.ConcertHall;
import SecondHw.ConcertHall.Concert.Address;

public class ConcertHallMain {
    public static void main(String[] args) {

        Address address1= new Address("wojciecha gersona", "Warsaw", "Poland");

        ConcertHall concertHall1 = new ConcertHall("LLL", address1);

        System.out.println(concertHall1);
        concertHall1.setAddress(address1);
        System.out.println(concertHall1);
        System.out.println(" \n");
        System.out.println(concertHall1.getConcertHallId());
        System.out.println(concertHall1.getAddress());
    }
}
