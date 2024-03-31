package observer;

public class Junior implements Observer{

    
    private String name;
    private int salary;
    private String profession;
    
    public Junior(String name, String profession){
        this.name = name;
        salary = 20000;
        this.profession = profession;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (this.salary <= vacancy.salary){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.salary);
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.salary);
        }
    }

    @Override
    public String getProfession() {
        return profession;
    }

    @Override
    public int getExpectedSalary() {
        return salary;
    }

    @Override
    public String getName(){
        return name;
    };

}
