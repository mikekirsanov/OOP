package HomeTask;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        // Сравниваем возрасты двух сотрудников
        if (e1.getAge() > e2.getAge()){
            return 1;
        }
        else if (e1.getAge() == e2.getAge()){
            return 0;
        }
        else {
            return -1;
        }
    }
}
