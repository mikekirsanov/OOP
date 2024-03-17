package HomeTask;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Employee[] employees = EmployeeFabric.generateEmployees(15);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new SalaryComparator());

        System.out.println();
        System.out.println("***");
        System.out.println("Сортировка по заработной плате");
        System.out.println("***\n");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new AgeComparator());

        System.out.println();
        System.out.println("***");
        System.out.println("Сортировка по возрасту");
        System.out.println("***\n");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
