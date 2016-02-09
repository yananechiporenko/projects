package ua.com.goit.task4.TemperatureAreaDistance.temperature;

public class Celsius extends Temperature {
    private final double rateC = 5.0/9.0;
    private final double waterFroze = 32.0;
    private double grad;
    public Celsius (double grad){
        this.grad = grad;
    }
    public double toFahrenheit() {
        return (this.waterFroze + this.rateC * this.grad);
    }
}
