package Seminar2.Task1;

public abstract class Animal {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void jump();

    public abstract void voice();
}
