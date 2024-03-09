package Seminar1;

public class Chocolate extends Product{
    private int weight;
    private int cocoa;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setCocoa(int cocoa) {
        this.cocoa = cocoa;
    }
    
    public int getCocoa() {
        return cocoa;
    }

    public Chocolate(String brand, String name, double price, int weight, int cocoa) {
        super(brand, name, price);
        this.weight = weight;
        this.cocoa = cocoa;
    }

    @Override
    public String displayInfo() {
        return String.format("Шоколад:\n\t%s\n\t%s\n\tЦена: %.2f\n\tВес: %d\n\tМассовая доля какао: %d", brand, name, price, weight, cocoa);
    }
}
