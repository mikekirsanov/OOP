package Seminar1;

public class Product {

    protected String name;
    protected String brand;
    protected double price;

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        checkPrice(price);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        checkName(name);
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        checkBrand(brand);
    }

    private void checkPrice(double price){
        if (price < 200) {
            price = 200;
        } else {
            this.price = price;
        }
    }

    private void checkName(String name){
        if (name == null || name.length() < 3) {
            this.name = "<NAME>";
        } else {
            this.name = name;
        }
    }

    private void checkBrand(String brand){
        if (brand == null || brand.length() < 3) {
            this.brand = "<BRAND>";
        } else {
            this.brand = brand;
        }
    }

    public Product(String brand, String name, double price) {
        checkBrand(brand);
        checkName(name);
        checkPrice(price);
    }

    public Product(String name, double price) {
        this("BRAND>", name, price);
    }

    public Product(String name) {
        this(name, 200);
    }

    public Product() {
        this("<NAME>");
    }

    public String displayInfo() {
        return String.format("%s - %s - %.2f", brand, name, price);
    }
}