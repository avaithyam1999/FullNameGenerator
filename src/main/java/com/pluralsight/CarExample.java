package com.pluralsight;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMake("BMW");
        car1.setModel("M3CS");
        car1.display();

        Car car2 = new Car();
        car2.setMake("Porsche");
        car2.setModel("911 GT3");
        car2.display();
    }
}
