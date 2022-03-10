package com.company;

public class Main {
    public static <GetSet> void main(String[] args) {
        // 1.h In the main method, instantiate a new Driver, populating the fields with your own name and age.
        Driver c = new Driver("Pelle", 27);

        // 1.i In the main method, instantiate a new car, populating the field with whatever values you see fit.
        Car car = new Car("Huyndai", "I20", 2013, "Four Doors");


        // 1.j In the main method, assign the driver to the car created, using the setter method created in step 1.e
        car.setDriver("Aleks");
        System.out.println(car.getDriver());

        // 1.k print the toString method of the car you've created followed by the toString method of the driver.
        System.out.println(car);
        System.out.println(c);

        // 1.l In the main method, create yet another car and assign the same driver to this car.
        Car car2 = new Car("Toyota", "Aygo", 2005, "Four Doors");

        // 1.m repeat the step 1.k for the new car created in 1.l.
        System.out.println(car2);
        System.out.println(c);
    }
}