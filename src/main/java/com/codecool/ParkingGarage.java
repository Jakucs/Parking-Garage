package com.codecool;

import java.io.InvalidClassException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ParkingGarage {
    private String name;
    List<ParkingRecord> parkingRecords = new ArrayList<>();

    public ParkingGarage(String name){
        this.name = name;
    }

    public void addRecord(ParkingRecord parkingRecord){
        parkingRecords.add(parkingRecord);
    }

    public double getTotalIncomeByType(ParkingRecord parkingRecord) throws InvalidClassException {
        if(!(parkingRecord instanceof Car || parkingRecord instanceof Truck)){
            throw new InvalidClassException("Class is not valid.");
        }
        double amount = 0;
        for(ParkingRecord record : parkingRecords){
            if(record.getClass() == parkingRecord.getClass()){
                amount += record.getPrice();
            }
        }
            return amount;
    }

    public void getVehiclesParkedLongerThan(int hours){

    }
}
