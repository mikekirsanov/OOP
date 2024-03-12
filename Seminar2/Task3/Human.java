package Seminar2.Task3;

public class Human extends BaseHuman implements Runner{
    private String name;
    private int maxRun;
    private int maxJump;
    public Human(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    
    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }
}
