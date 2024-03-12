package Seminar2.Task1;

public class Dog extends Animal{
    private double weight;
    
    public Dog(String name){
        super(name);
    }

    public Dog(String name, double weight){
        super(name);
        this.weight = weight;
    }

    public void voice(){
        System.out.printf("%s лает\n", name);
    }

    public void jump(){
        System.out.printf("%s прыгает\n", name);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
