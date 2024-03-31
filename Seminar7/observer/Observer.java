package observer;

public interface Observer {

    void receiveOffer(String companyName, Vacancy vacancy);
    String getProfession();
    int getExpectedSalary();
    String getName();
}
