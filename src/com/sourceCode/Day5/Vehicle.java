package com.sourceCode.Day5;

public class Vehicle {
    String make;
    String model;
    int price;
    boolean fourWheel;

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", fourWheel=" + fourWheel +
                '}';
    }

    public Vehicle(String make, String model, int price, boolean fourWheel) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.fourWheel = fourWheel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFourWheel() {
        return fourWheel;
    }

    public void setFourWheel(boolean fourWheel) {
        this.fourWheel = fourWheel;
    }
}
