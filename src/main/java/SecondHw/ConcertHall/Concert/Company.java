package SecondHw.ConcertHall.Concert;

import SecondHw.ConcertHall.Exception.InvalidCompanyException;

public class Company extends ManyThanks {
    private static String companyId;
    private static String companyName;

    public Company() {
    }

    public Company(String companyId, String companyName) {
        this.setCompanyId(companyId);
        this.setCompanyName(companyName);
    }

    public static String companyIsSponsoring(Company company) {
        if (company != null) {
            System.out.println("The company is sponsoring>" + " " + company);
        }
        return "There is a sponsor";
    }

    public static void thereIsCompany() throws InvalidCompanyException {
        try {
            if (companyId != null)
                System.out.println("There are sponsor companies");
        } catch (Throwable e) {
            throw new InvalidCompanyException("There are no sponsor companies the concert can't take place", e);
        }
    }

    public static void staticDisplayCompanyInformation() {
        System.out.println(companyId + " " + companyName);
    }

    public String getCompanyId() {
        return companyId; //returns companyID in capitals
    }

    public void setCompanyId(String companyId) {

        if (companyId.matches("[a-zA-Z]+$") && companyId.length() == 2) {
            Company.companyId = companyId.toUpperCase();
        } else {
            System.out.println("Invalid Company ID");
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {

        if (companyName.matches("[a-zA-Z ]+$")) {
            Company.companyName = companyName;
        } else {
            System.out.println("Invalid Company Name");
        }
    }

    @Override
    public String toString() {
        return this.getCompanyId() + "," + this.getCompanyName();
    }

    @Override
    public String manyThanks() {
        return "Many thanks to companies sponsored";
    }
}
