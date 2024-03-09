package Seminar1;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        Product product1 = new Product("Brand #1", "Name #1", 200);
        Product product2 = new Product("Brand #2", "Name #2", 500);
        product1.setPrice(100);

        System.out.println(product1.displayInfo());
        System.out.println(product2.displayInfo());

        Product product3 = new BottleOfWater("Brand #3", "Name #3", 650, 0.33);
        System.out.println(product3.displayInfo());

        Product product4 = new BottleOfMilk("Brand #4", "Name #4", 340, 0.5, 3.2);
        System.out.println(product4.displayInfo());

        BottleOfWater bottleOfWater2 = new BottleOfWater("Brand #5", "Name #5", 220, 0.25);
        BottleOfMilk bottleOfMilk2 = new BottleOfMilk("Brand #6", "Name #6", 450, 1.0, 2.2);
        Chocolate chocolate1 = new Chocolate("Brand #5", "Name #5", 760, 95, 35);
        Product product7 = new Chocolate("Brand #7", "Name #7", 950, 100, 55);

        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfMilk2);
        list.add(bottleOfWater2);
        list.add(product3);
        list.add(product4);
        list.add(chocolate1);
        list.add(product7);

        VendingMachine vendingMachine = new VendingMachine(list);
        BottleOfWater bottleOfWaterRes = vendingMachine.getBottleOfWater("Name #3", 0.33);
        if (bottleOfWaterRes != null) {
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        } else {
            System.out.println("Такой бутылки в автомате нет");
        }

        Chocolate chocolateRes = vendingMachine.getChocolate(100, 55);
        if (chocolateRes != null) {
            System.out.println("Вы купили: ");
            System.out.println(chocolateRes.displayInfo());
        } else {
            System.out.println("Такого шоколада в автомате нет");
        }
    }
}