import SecondHw.ConcertHall.Band.Person;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.String.valueOf;

public class PersonTest {

    public static void main(String[] args) throws IOException {

        Person person1 = new Person("Arzu Kilic", "903847574894", 21);
        Person person2 = new Person("Beyza Sonmez", "90384757489", 20);
        Person person3 = new Person("Hanks Kor", "903847574891", 35);
        Person person4 = new Person("Alex Egg", "903847574895", 36);
        Person person5 = new Person("Lara Fabian", "903847574896", 50);
        Person person6 = new Person("Maslo Laz", "903847574897", 39);
        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        List<Person> people = persons.stream().collect(Collectors.toList());
        String string = people.toString();
        File myfile = new File("src/main/java/SecondHw/ConcertHall/Files/Write.txt");

        FileUtils.writeStringToFile(myfile, string,
                StandardCharsets.UTF_8.name());

        List<String> lines = new ArrayList<>();
        lines.add(person1.toString());
        lines.add(person2.toString());
        lines.add(person3.toString());
        lines.add(person4.toString());
        lines.add(person5.toString());
        lines.add(person6.toString());

        File myfile2 = new File("src/main/java/SecondHw/ConcertHall/Files/Write2.txt");

        FileUtils.writeLines(myfile2,
                StandardCharsets.UTF_8.name(), lines);

        //read from file
        int peopleAge = persons.stream().mapToInt(x -> x.getAge()).sum();
        int avgAge = (peopleAge / lines.size());
        File myfile3 = new File("src/main/java/SecondHw/ConcertHall/Files/Read.txt");

        String contents = FileUtils.readFileToString(myfile2,
                StandardCharsets.UTF_8.name());

        System.out.println(contents);

        List<String> liness = FileUtils.readLines(myfile2,
                StandardCharsets.UTF_8.name());
        liness.add("The number of people that will take part:");
        liness.add(valueOf(lines.size()));
        liness.add("Average age is:");
        liness.add(valueOf(avgAge));

        FileUtils.writeLines(myfile3,
                StandardCharsets.UTF_8.name(), liness);
    }

    @Test
    public void testing() throws IOException {
        Person person1 = new Person("Arzu Kilic", "903847574894", 21);
        Person person2 = new Person("Beyza Sonmez", "90384757489", 20);
        Person person3 = new Person("Hanks Kor", "903847574891", 35);
        Person person4 = new Person("Alex Egg", "903847574895", 36);
        Person person5 = new Person("Lara Fabian", "903847574896", 50);
        Person person6 = new Person("Maslo Laz", "903847574897", 39);
        List<String> lines = new ArrayList<>();
        lines.add(person1.toString());
        lines.add(person2.toString());
        lines.add(person3.toString());
        lines.add(person4.toString());
        lines.add(person5.toString());
        lines.add(person6.toString());
        File myfile2 = new File("src/main/java/SecondHw/ConcertHall/Files/Write2.txt");

        FileUtils.writeLines(myfile2,
                StandardCharsets.UTF_8.name(), lines);

        Assert.assertEquals(lines.get(0), person1.toString());
        Assert.assertEquals(lines.get(1), person2.toString());
        Assert.assertEquals(lines.get(2), person3.toString());
        Assert.assertEquals(lines.get(3), person4.toString());
        Assert.assertEquals(lines.get(4), person5.toString());
        Assert.assertEquals(lines.get(5), person6.toString());
    }
}
