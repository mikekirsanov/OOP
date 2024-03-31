package observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class JobAgency implements Publisher{


    private Collection<Observer> observers = new ArrayList<>();
    
    public void sendOffer(String companyName, Vacancy vacancy) {
        List<Observer> toRemove = new ArrayList<>();
        synchronized (observers) {
            Iterator<Observer> iterator = observers.iterator();
            while (iterator.hasNext()) {
                Observer observer = iterator.next();
                if (observer.getProfession().equals(vacancy.profession.name())) {
                    if (observer.getExpectedSalary() <= vacancy.salary) {
                        observer.receiveOffer(companyName, vacancy);
                        toRemove.add(observer);
                    } else {
                        System.out.printf("Соискатель %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                                observer.getName(), companyName, vacancy.salary);
                    }
                }
            }
    
            iterator = toRemove.iterator();
            while (iterator.hasNext()) {
                Observer observer = iterator.next();
                iterator.remove();
                observers.remove(observer);
                System.out.println("Соискатель " + observer.getName() + " нашел работу мечты в компании " + companyName + " и выбывает из базы данных.");

            }
        }
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /*@Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }*/
}
