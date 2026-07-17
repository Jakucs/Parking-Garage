import com.codecool.Car;
import com.codecool.ParkingGarage;
import com.codecool.ParkingRecord;
import com.codecool.Truck;
import org.junit.jupiter.api.Test;

import java.io.InvalidClassException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingGarageTest {
    @Test
    void getTotalIncomeByTypeTest() throws InvalidClassException {
        ParkingGarage parkingGarage = new ParkingGarage("Aréna parking");
        Car car = new Car("ASD-123", 4);
        Car car2 = new Car("ASD-124", 2);
        parkingGarage.addRecord(car);
        parkingGarage.addRecord(car2);
        parkingGarage.getTotalIncomeByType(car);
        assertEquals(12, parkingGarage.getTotalIncomeByType(car));
    }

    @Test
    void getTotalIncomeByTypeWithMoreParkingTest() throws InvalidClassException {
        ParkingGarage parkingGarage = new ParkingGarage("Aréna parking");
        Car car = new Car("ASD-123", 4);
        Car car2 = new Car("ASD-124", 2);
        Truck truck = new Truck("AQUA-1", 5, 16000);
        Truck truck2 = new Truck("AQUA-2", 4, 17000);
        Truck truck3 = new Truck("AQUA-3", 9, 20000);
        parkingGarage.addRecord(car);
        parkingGarage.addRecord(car2);
        parkingGarage.addRecord(truck);
/*        parkingGarage.addRecord(truck2);
        parkingGarage.addRecord(truck3);*/
        parkingGarage.getTotalIncomeByType(car);
        assertEquals(180, parkingGarage.getTotalIncomeByType(truck));
    }

    @Test
    void getTotalIncomeByTypeWithMoreTrucksTest() throws InvalidClassException {
        ParkingGarage parkingGarage = new ParkingGarage("Aréna parking");
        Car car = new Car("ASD-123", 4);
        Car car2 = new Car("ASD-124", 2);
        Truck truck = new Truck("AQUA-1", 5, 16000);
        Truck truck2 = new Truck("AQUA-2", 4, 17000);
        Truck truck3 = new Truck("AQUA-3", 9, 20000);
        parkingGarage.addRecord(car);
        parkingGarage.addRecord(car2);
        parkingGarage.addRecord(truck);
        parkingGarage.addRecord(truck2);
        parkingGarage.addRecord(truck3);
        parkingGarage.getTotalIncomeByType(car);
        assertEquals(602, parkingGarage.getTotalIncomeByType(truck));
    }

    @Test
    void getVehiclesParkedLongerThanTest(){
        ParkingGarage parkingGarage = new ParkingGarage("Aréna parking");
        Car car = new Car("ASD-123", 4);
        Car car2 = new Car("ASD-124", 2);
        Truck truck = new Truck("AQUA-1", 5, 16000);
        Truck truck2 = new Truck("AQUA-2", 4, 17000);
        Truck truck3 = new Truck("AQUA-3", 9, 20000);
        parkingGarage.addRecord(car);
        parkingGarage.addRecord(car2);
        parkingGarage.addRecord(truck);
        parkingGarage.addRecord(truck2);
        parkingGarage.addRecord(truck3);

        assertEquals(List.of("AQUA-3"), parkingGarage.getVehiclesParkedLongerThan(5));
    }
}
