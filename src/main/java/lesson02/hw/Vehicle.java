package lesson02.hw;

public abstract class Vehicle {
    @SuppressWarnings("unused")
    private String company;
    @SuppressWarnings("unused")
    private String model;
    @SuppressWarnings("unused")
    private int yearRelease;
    @SuppressWarnings("unused")
    private int numWheels;
    @SuppressWarnings("unused")
    private int speed;

    public abstract void testDrive();

    public abstract void park();
}