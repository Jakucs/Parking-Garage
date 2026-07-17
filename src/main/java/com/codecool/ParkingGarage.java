package com.codecool;

import java.io.InvalidClassException;
import java.lang.reflect.Type;
import java.util.List;

public class ParkingGarage {
    private String name;
    List<ParkingRecord> parkingRecords;

    public ParkingGarage(String name){
        this.name = name;
    }

    public void addRecords(ParkingRecord parkingRecord){
        parkingRecords.add(parkingRecord);
    }

    public double getTotalIncomeByType(ParkingRecord parkingRecord) throws InvalidClassException {
        if(!(parkingRecord instanceof Car || parkingRecord instanceof Truck)){
            throw new InvalidClassException("Class is not valid.");
        }
        Car car = new Car("ASD-123", 4);
        Truck truck = new Truck("ASD-234", 2);
        if(parkingRecord instanceof Car){
            return car.getPrice();
        }else {
            return truck.getPrice();
        }
    }

    public void getVehiclesParkedLongerThan(int hours){
        
    }
}
