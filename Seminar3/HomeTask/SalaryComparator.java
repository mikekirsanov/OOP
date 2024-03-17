package HomeTask;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        if (o1.calculateSalary() > o2.calculateSalary()){
            return 1;
        }
        else if (o1.calculateSalary() == o2.calculateSalary()){
            return 0;
        }
        else {
            return -1;
        }
    }
}
