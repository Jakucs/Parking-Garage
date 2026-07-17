package com.codecool;

public class Car extends ParkingRecord{

    private double price;

    public Car(String licensePlate, int hour){
        super(licensePlate, hour);
        this.price = 2*hour;
    }

    public double getPrice(){
        return price;
    }
}
