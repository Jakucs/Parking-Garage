package com.codecool;

public class Truck extends ParkingRecord{

    private int weight;
    private double price;

    public Truck(String licensePlate, int hour){
        super(licensePlate, hour);
        this.weight = weight;
        this.price = (4 * hour) + (0.01*weight);
    }
}
