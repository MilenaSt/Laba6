package Laba6;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "X6", "M series", 9000000, 2018);
        Car c2 = new Car("Porshe", "Cayenne", "G5", 5000000, 2019);
        Car c3 = new Car("Volkswagen", "Polo", "TrendLine", 780000, 2016);
        c1.println();
        c2.println();
        c3.println();
    }
}

