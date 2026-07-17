import com.codecool.Car;
import com.codecool.ParkingGarage;
import com.codecool.ParkingRecord;
import org.junit.jupiter.api.Test;

import java.io.InvalidClassException;

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
}
