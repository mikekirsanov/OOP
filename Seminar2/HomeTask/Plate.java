public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    
    public int getFood() {
        return food;
    }

    public void setFood(int amount) {
        if (food >= amount) {
            food -= amount;
        } else {
            System.out.println("В тарелке мало корма.");
        }
    }

    public void platter(int volume) {
        this.food += volume;
    }

    public void info() {
        System.out.println("В тарелке: " + food + " корма.");
    }
}