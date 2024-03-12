package Seminar2.Task1;

public class Cat extends Animal{
    private String color;
    
    public Cat(String name){
        super(name);
    }
     
    public Cat(String name, String color){
        super(name);
        this.color = color;
    }

    public void voice(){
        System.out.printf("%s мяукает\n", name);
    }

    public void jump(){
        System.out.printf("%s прыгает\n", name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
