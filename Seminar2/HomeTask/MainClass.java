import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 5);
        Cat cat2 = new Cat("Мурзик", 10);
        Cat cat3 = new Cat("Васька", 15);
        Cat cat4 = new Cat("Пушок", 7);
        Cat cat5 = new Cat("Сима", 12);
        Cat cat6 = new Cat("Рыжик", 5);
        ArrayList<Cat> list = new ArrayList<>();
        list.add(cat1);
        list.add(cat2);
        list.add(cat3);
        list.add(cat4);
        list.add(cat5);
        list.add(cat6);
        Scanner scanner = new Scanner(System.in);
        Plate plate = new Plate(30);
        plate.info();
        for (Cat cat : list) {
            if (!cat.getSatiety()) {
                if (plate.getFood() < cat.getAppetite()) {
                    System.out.println("В тарелке мало корма. Насыпать в тарелку корм? (y/n)");
                    String userResponse = scanner.nextLine();
                    if (userResponse.equalsIgnoreCase("y")) {
                        plate.platter(30);
                        plate.info();
                    } else {
                        System.out.println("Котик " + cat.getName() + " остался голодным.");
                        continue;
                    }
                }
                cat.eat(plate);
                plate.info();
            }
        }
        scanner.close();
    }
}
