package SecondHw.ConcertHall.Band;


import SecondHw.ConcertHall.Concert.ManyThanks;

public class Person extends ManyThanks {
    private String name;
    private String phoneNumber;
    private int age;

    public Person() {
    }

    public Person(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public int yearsOfExperience(int x, int y) {
        return x + y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void personInfo() {
        System.out.println("Person information:" + name + " " + age);
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override
    public String manyThanks() {
        return "Many thanks to people took part";
    }
}
