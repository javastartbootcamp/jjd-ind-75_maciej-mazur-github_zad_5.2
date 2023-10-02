package pl.javastart.task;

public class Room {
    private final double area;
    private double currentTemperature;
    private final boolean hasAirConditioner;
    private final double temperatureLowerLimit;

    public Room(double area, double currentTemperature, boolean hasAirConditioner, double temperatureLowerLimit) {
        this.area = area;
        this.currentTemperature = currentTemperature;
        this.hasAirConditioner = hasAirConditioner;
        this.temperatureLowerLimit = temperatureLowerLimit;
    }

    public boolean decreaseTemperature() {
        if (!hasAirConditioner || currentTemperature == temperatureLowerLimit) {
            return false;
        }

        currentTemperature -= 1;

        if (currentTemperature < temperatureLowerLimit) {
            currentTemperature = temperatureLowerLimit;
        }

        return true;
    }

    public double getArea() {
        return area;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public boolean hasAirConditioner() {
        return hasAirConditioner;
    }

    public double getTemperatureLowerLimit() {
        return temperatureLowerLimit;
    }
}
