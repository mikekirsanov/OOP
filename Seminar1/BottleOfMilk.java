package Seminar1;

public class BottleOfMilk extends Product{
    private double volume;
    private double fat;

    public double getVolume(){
        return volume;
    }

    public void setVolume(double volume){
        this.volume = volume;
    }

    public double getFat(){
        return fat;
    }

    public void setFat(double fat){
        this.fat = fat;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, double fat){
        super(brand, name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    public String displayInfo() {
        return String.format("Бутылка с молоком:\n\t%s\n\t%s\n\tЦена: %.2f\n\tОбъем: %.2f\n\tЖирность: %.1f", brand, name, price, volume, fat);
    }
}
