package Laba6;

public class Car implements Printable {
    String brand;
    String model;
    String configuration;
    int price;
    int year;
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getConfiguration() {
        return configuration;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String brand, String model, String configuration, int price, int year) {
        this.brand = brand;
        this.model = model;
        this.configuration = configuration;
        this.price = price;
        this.year = year;
    }

    @Override
    public void println() {
        System.out.println("Марка машины: " + brand +
                ", Модель: " + model +
                ", Конфигурация: " + configuration +
                ", Цена: " + price +
                ", Год выпуска: " + year );
    }
}
