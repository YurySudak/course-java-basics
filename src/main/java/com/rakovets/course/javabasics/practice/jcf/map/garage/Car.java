package com.rakovets.course.javabasics.practice.jcf.map.garage;

public abstract class Car {

    protected String brand;
    protected String model;
    protected String color;
    protected int yearManufacture;
    protected String registrationNumber;

    public Car(String brand, String model, String color, int yearManufacture, String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearManufacture = yearManufacture;
        this.registrationNumber = registrationNumber;
    }

    public boolean equals(Car car) {
        return  (car.getBrand().equals(brand)
            && car.getModel().equals(model));
    }

    @Override
    public int hashCode() {
        return yearManufacture;
    }

    @Override
    public String toString() {
        return "brand: "+  brand + ", model: "+ model + ", color: " + color + ", yearManufacture: " + yearManufacture + ", registrationNumber: " + registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
