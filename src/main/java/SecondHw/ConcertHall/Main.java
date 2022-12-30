package SecondHw.ConcertHall;

import SecondHw.ConcertHall.Band.Band;
import SecondHw.ConcertHall.Band.Instrument;
import SecondHw.ConcertHall.Band.MusicInstrument;
import SecondHw.ConcertHall.Band.Person;
import SecondHw.ConcertHall.Concert.*;
import SecondHw.ConcertHall.Exception.ConcertDateException;
import SecondHw.ConcertHall.Exception.TheConcertIsPostponedException;
import SecondHw.ConcertHall.Ticket.Ticket;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static SecondHw.ConcertHall.Ticket.TicketClass.*;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) throws Exception {
        Concert.welcomeLog();
        List<Person> band1Person = new ArrayList<>();
        List<Person> band2Person = new ArrayList<>();
        List<Person> band3Person = new ArrayList<>();
        List<MusicInstrument> musicInstruments1 = new ArrayList<>();
        List<MusicInstrument> musicInstruments2 = new ArrayList<>();
        List<MusicInstrument> musicInstruments3 = new ArrayList<>();
        List<Band> bands1 = new ArrayList<>();
        List<Band> bands2 = new ArrayList<>();
        List<Company> companies1 = new ArrayList<>();
        List<Company> companies2 = new ArrayList<>();
        List<ConcertSection> concertSections1 = new ArrayList<>();
        List<Ticket> tickets = new ArrayList<>();

        Person person1 = new Person("Arzu Kilic", "903847574894", 21);
        Person person2 = new Person("Beyza Sonmez", "90384757489", 20);
        Person person3 = new Person("Hanks Kor", "903847574891", 35);
        Person person4 = new Person("Alex Egg", "903847574895", 36);
        Person person5 = new Person("Lara Fabian", "903847574896", 50);
        Person person6 = new Person("Maslo Laz", "903847574897", 39);
        Instrument instrument1 = new Instrument("guitar");
        MusicInstrument musicInstrument1 = new MusicInstrument(instrument1, "classical");
        Instrument instrument2 = new Instrument("piano");
        MusicInstrument musicInstrument2 = new MusicInstrument(instrument2, "classical");
        Instrument instrument3 = new Instrument("violin");
        MusicInstrument musicInstrument3 = new MusicInstrument(instrument1, "classical");
        Instrument instrument4 = new Instrument("guitar");
        MusicInstrument musicInstrument4 = new MusicInstrument(instrument1, "electrical");
        Instrument instrument5 = new Instrument("guitar");
        MusicInstrument musicInstrument5 = new MusicInstrument(instrument1, "acoustic");
        Company company1 = new Company("Japonska LTD");
        Company company2 = new Company("PKO Bank");
        Company company3 = new Company("Ziaja LTD");
        Company company4 = new Company("Bank Milennium");
        Company company5 = new Company("Carrefour");
        Ticket ticket1 = new Ticket(false, FIRST);
        Ticket ticket2 = new Ticket(true, BUSINESS);
        Ticket ticket3 = new Ticket(true, ECONOMY);
        Address address1 = new Address("wojciecha gersona", "Warsaw", "Poland");
        ConcertSection concertSection1 = new ConcertSection(BUSINESS);
        ConcertSection concertSection2 = new ConcertSection(FIRST);
        ConcertSection concertSection3 = new ConcertSection(ECONOMY);

        band1Person.add(person1);
        band1Person.add(person2);
        band1Person.add(person3);
        band1Person.add(person5);
        band2Person.add(person3);
        band2Person.add(person2);
        band2Person.add(person4);
        band2Person.add(person6);
        band3Person.add(person2);
        band3Person.add(person3);
        companies1.add(company1);
        companies1.add(company2);
        companies1.add(company3);
        companies2.add(company4);
        companies2.add(company5);
        musicInstruments1.add(musicInstrument1);
        musicInstruments1.add(musicInstrument2);
        musicInstruments2.add(musicInstrument3);
        musicInstruments2.add(musicInstrument4);
        musicInstruments2.add(musicInstrument5);
        musicInstruments3.add(musicInstrument3);
        musicInstruments3.add(musicInstrument1);
        concertSections1.add(concertSection1);
        concertSections1.add(concertSection2);
        concertSections1.add(concertSection3);
        tickets.add(ticket1);
        tickets.add(ticket2);

        ConcertHall concertHall1 = new ConcertHall(address1, concertSections1);
        Band band1 = new Band("Turkai", band1Person, "Turkey", musicInstruments1);
        Band band2 = new Band("Ezhel", band2Person, "Turkey", musicInstruments2);
        Band band3 = new Band("Ufo53", band3Person, "Turkey", musicInstruments3);

        bands1.add(band1);
        bands1.add(band2);
        bands2.add(band2);
        bands2.add(band3);

        Concert concert1 = new Concert(LocalDate.of(2002, 8, 1), bands1, companies1, concertHall1);
        Concert concert2 = new Concert(LocalDate.of(2032, 8, 1), bands2, companies2, concertHall1);


        System.out.printf("SELECT WHAT YOU ARE\n" + "1 for customer\n" + "2 for organizator\n" + "3 for company\n");
        Scanner sSelect = new Scanner(System.in);
        int select = sSelect.nextInt();
        if (select == 1) {
            System.out.printf("CHOOSE YOUR ACTION\n" + "1 for concert list\n" + "2 for buying tickets\n");
            Scanner sAction = new Scanner(System.in);
            int action = sAction.nextInt();
            if (action == 1) {
                Person person = new Person();
                System.out.println("The first concert is:\n" + concert1 + "\nThe second concert is"
                        + concert2);
                System.out.printf("People information:\n");

                person1.personInfo();
                person2.personInfo();
                person3.personInfo();
                person4.personInfo();
                person5.personInfo();
                person6.personInfo();

                System.out.println(person.manyThanks());
                Company.thereIsCompany();
            } else if (action == 2) {
                System.out.println("CHOOSE TICKET TYPE\n1 for Business\n2 for Economy\n3 for First");
                Scanner sTicketBuy = new Scanner(System.in);
                int ticketBuy = sTicketBuy.nextInt();
                if (ticketBuy == 1) {
                    List<Ticket> ttickets = tickets.stream().filter(x -> Ticket.getTicketClass() == BUSINESS).collect(toList());
                    if (ttickets.size() != 0) {
                        System.out.println("Your total expense is:\n" + BUSINESS.getPrice());
                    } else {
                        System.out.println("NOO AVAILABLE TICKETS TRY ANOTHER TYPE");
                    }
                } else if (ticketBuy == 2) {
                    List<Ticket> ttickets = tickets.stream().filter(x -> Ticket.getTicketClass() == ECONOMY).collect(toList());
                    if (ttickets.size() != 0) {
                        System.out.println("Your total expense is:\n" + ECONOMY.getPrice());
                    } else {
                        System.out.println("NOO AVAILABLE TICKETS TRY ANOTHER TYPE");
                    }

                } else if (ticketBuy == 3) {
                    List<Ticket> ttickets = tickets.stream().filter(x -> Ticket.getTicketClass() == FIRST).collect(toList());
                    if (ttickets.size() != 0) {
                        System.out.println("Your total expense is:\n" + FIRST.getPrice());
                    } else {
                        System.out.println("NOO AVAILABLE TICKETS TRY ANOTHER TYPE");
                    }
                }
            } else {
                System.out.println("Invalid input number!!!! start again");
            }
        } else if (select == 2) {
            System.out.printf("SELECT YOUR ACTION\n" + "1 to start concert\n" + "2 to stop concert\n" + "3 to create new concert\n");
            Scanner sOAction = new Scanner(System.in);
            int oAction = sOAction.nextInt();
            if (oAction == 1) {
                try {
                    concert1.concertStart();
                } catch (ConcertDateException e) {
                    System.out.println("Couldnt start the concert.");
                }
            } else if (oAction == 2) {
                try {
                    concert2.concertStop();
                } catch (TheConcertIsPostponedException e) {
                    System.out.println("Couldnt stop the concert.");
                    TheConcertIsPostponedException.DatePostponed();
                }
            } else if (oAction == 3) {
                try {
                    Concert concert3 = new Concert();
                    concert3.setConcertDate(LocalDate.of(2022, 12, 25));
                    concert3.setBands(bands2);
                    concert3.setCompanies(companies1);
                    concert3.setConcertHall(concertHall1);
                    if (concert3.equals(concert1) == false || concert3.hashCode() != concert2.hashCode()) {
                        System.out.println(concert3);
                        System.out.println("New concert is created, have fun :)");
                    }
                } catch (Throwable e) {
                    throw new ConcertDateException("The concert couldn't be created", e);
                }
            } else {
                System.out.println("SELECT VALID NUMBER!!!! TRY AGAIN!!");
            }

        } else if (select == 3) {
            System.out.printf("SELECT YOUR ACTION\n" + "1 for sponsorship \n" + "2 for creating a new company\n");
            Scanner sCAction = new Scanner(System.in);
            int cAction = sCAction.nextInt();
            if (cAction == 1) {
                System.out.printf("SELECT YOUR ACTION\n" + "1 for sponsorship concert1 \n" + "2 for sponsorship concert2\n");
                Scanner sSponsorship = new Scanner(System.in);
                int sponsorship = sSponsorship.nextInt();
                if (sponsorship == 1) {
                    Company company = new Company("Ato");
                    companies1.add(company);
                    System.out.println(company + " " + "Started to sponsor concert 1");
                } else if (sponsorship == 2) {
                    Company company = new Company();
                    companies2.add(company);
                    System.out.println(company + " " + "Started to sponsor concert 2");
                } else {
                    System.out.println("SELECT A VALID NUMBER!! TRY AGAIN!");
                }


            } else if (cAction == 2) {
                Company company = new Company();
                company.setCompanyName("InPol");
                System.out.println("New company created:\n" + company);
                System.out.println(company.manyThanks());
                Company.companyIsSponsoring(company);
                System.out.println("Company information:\n");
                System.out.println(company);
            } else {
                System.out.println("INVALID NUMBER!! SELECT A VALID NUMBER!!!");
            }

        } else {
            System.out.println("INVALID NUMBER!!!! SELECT A VALID NUMBER");
        }
    }
}
