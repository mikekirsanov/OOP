package HomeTask;

import java.util.Random;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee{
    Random random = new Random();
    
    public Freelancer(String surName, String name, double salary, int age) {
        super(surName, name, salary, age);
    }

    /*public static Freelancer create(String surName, String name, double salary, int age){
        return new Freelancer(surName, name, salary, age);
    }*/

    double hRate = random.nextDouble(150, 751);

    @Override
    public double calculateSalary() {
        salary = 20.8 * 8 * hRate;
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s - фрилансер;\t\t ставка: %.2f руб.;\t заработная плата: %.2f руб.;\t возраст: %d",
                surName, name, hRate, calculateSalary(), age);
    }
}
