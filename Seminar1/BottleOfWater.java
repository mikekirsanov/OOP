package Seminar1;

public class BottleOfWater extends Product{
    private double volume;

    public double getVolume(){
        return volume;
    }

    public void setVolume(double volume){
        this.volume = volume;
    }

    public BottleOfWater(String brand, String name, double price, double volume){
        super(brand, name, price);
        this.volume = volume;
    }

    public String displayInfo(){
        return String.format("Бутылка с водой:\n\t%s\n\t%s\n\tЦена: %.2f\n\tОбъем: %.2f\n\t", brand, name, price, volume);
    }
}
