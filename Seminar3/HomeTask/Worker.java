package HomeTask;


/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee {
    public Worker(String surName, String name, double salary, int age) {
        super(surName, name, salary, age);
    }

    /*public static Worker create(String surName, String name, double salary, int age){
        return new Worker(surName, name, salary, age);
    }*/

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s - штатный сотрудник;\t ставка: %.2f руб.;\t заработная плата: %.2f руб.;\t возраст: %d",
                surName, name, salary, calculateSalary(), age);
    }
}
