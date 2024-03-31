package observer;

import java.util.Random;

public class Vacancy {
    String name;
    Professions profession;
    int salary;
    int experience;
    
    public Vacancy(String name, Professions profession, int salary, int experience) {
        this.name = name;
        this.profession = profession;
        this.salary = salary;
        this.experience = experience;
    }

    public static Vacancy generateRandomVacancy(String companyName) {
        Random random = new Random();
        Professions[] professions = Professions.values();
        Professions randomProfession = professions[random.nextInt(professions.length)];
        int salary = random.nextInt(100000);
        int experience = random.nextInt(10);
        return new Vacancy(companyName, randomProfession, salary, experience);
    }
}
