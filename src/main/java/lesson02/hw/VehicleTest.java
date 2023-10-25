package lesson02.hw;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    public void testCarInstanceIsAlsoVehicle() {
        Car car = new Car("Company", "Model", 2021);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Company", "Model", 2021);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2021);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarAcceleratesTo60DuringTestDrive() {
        Car car = new Car("Company", "Model", 2021);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleAcceleratesTo75DuringTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2021);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarStopsWhenParkedAfterTestDrive() {
        Car car = new Car("Company", "Model", 2021);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleStopsWhenParkedAfterTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2021);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}