package demo;

public class Carv1 {
    String color, brand_name, fuel_type;
    int numberOfGears, maxSpeed, price;

    // Method to reverse
    public void reverse() {
        System.out.println("The car moved in reverse direction for 10 meters");
    }

    // Method to start
    public void start() {
        System.out.println("The car started");
    }

    // Method to accelerate
    public void accelerate() {
        System.out.println("The car accelerated");
    }

    // Method to display car details
    public void display() {
        System.out.println("Color: " + this.color +"\nFuel Type: " + this.fuel_type + "\nBrand Name: " + this.brand_name);
    }
}
