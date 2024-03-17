package HomeTask;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман", "Владимир" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов", "Панкратов" };
    
        for (int i = 0; i < count; i++) {
            double salary = random.nextDouble(60000, 120001);
            int age = random.nextInt(18, 55);
            int employeeType = random.nextInt(2);
            if (employeeType == 0) {
                employees[i] = new Worker(
                    surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)],
                    salary,
                    age);
            } else {
                employees[i] = new Freelancer(
                    surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)],
                    salary,
                    age);
            }
        }
        return employees;
    }
}

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     * разных типов (Worker, Freelancer) в рамках домашней работы
     * 
     * @param count
     * @return
     */