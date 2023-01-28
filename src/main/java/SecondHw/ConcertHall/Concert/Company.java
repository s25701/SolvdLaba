package SecondHw.ConcertHall.Concert;

import SecondHw.ConcertHall.Exception.InvalidCompanyException;

public class Company extends ManyThanks {
    private static int nextCompanyId = 0;
    private final int companyId;
    private String companyName;

    public Company() {
        companyId = nextCompanyId++;
    }

    public Company(String companyName) {
        companyId = nextCompanyId++;
        this.setCompanyName(companyName);
    }

    public static String companyIsSponsoring(Company company) {
        if (company != null) {
            System.out.println("The company is sponsoring>" + " " + company);
        }
        return "There is a sponsor";
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyId() {
        return "C" + companyId;
    }

    @Override
    public String toString() {
        return this.getCompanyId() + "," + companyName;
    }

    @Override
    public String manyThanks() {
        return "Many thanks to companies sponsored";
    }
}
