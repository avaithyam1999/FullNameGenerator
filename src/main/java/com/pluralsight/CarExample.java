package com.pluralsight;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMake("BMW");
        car1.setModel("M3CS");

        System.out.println(car1.getMake() + " " + car1.getModel());
    }
}
