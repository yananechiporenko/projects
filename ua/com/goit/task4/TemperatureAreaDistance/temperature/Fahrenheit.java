package ua.com.goit.task4.TemperatureAreaDistance.temperature;

public class Fahrenheit extends Temperature {
    private double waterFroze = 32.0;
    private double rateF = 9.0/5.0;
    private double grad;

    public Fahrenheit (double grad){
        this.grad = grad;
    }
    public double toCelsius() {
        return (this.rateF * (this.grad - this.waterFroze));
    }
}
