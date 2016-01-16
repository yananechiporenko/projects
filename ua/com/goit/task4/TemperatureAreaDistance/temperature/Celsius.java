package ua.com.goit.task4.TemperatureAreaDistance.temperature;

public class Celsius extends Temperature {
    private double rateC = 5.0/9.0;
    Celsius (double grad){
        this.grad = grad;
    }

    public double getRate() {
        return rateC;
    }
    private double odessaF = 32.0 + rateC * grad;

    public double getOdessaF() {
        return odessaF;
    }
}
