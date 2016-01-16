package ua.com.goit.task4.TemperatureAreaDistance.temperature;

public class Fahrenheit extends Temperature {
    private double waterFroze = 32.0;
    private double rateF = 9.0/5.0;

    Fahrenheit (double grad){
        this.grad = grad;
    }

    private double kievC = (grad-waterFroze)*rateF;

    public double getKievC() {
        return kievC;
    }
}
