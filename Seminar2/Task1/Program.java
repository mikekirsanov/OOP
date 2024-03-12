package Seminar2.Task1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Armando", "белый");
        System.out.println(cat1.getColor());
        Dog dog1 = new Dog("Sharik", 6.7);
        System.out.println(dog1.getWeight());
        cat1.voice();
        dog1.jump();
        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(dog1);
        processVoice(animals);
    }

    static void processVoice(List<Animal> animals){
        for(Animal animal : animals){
            if(animal instanceof Cat){
                Cat cat = (Cat) animal;
                System.out.println("Цвет кота " + cat.getColor());
            }
            
            animal.voice();
            animal.jump();
        }
    }
}
