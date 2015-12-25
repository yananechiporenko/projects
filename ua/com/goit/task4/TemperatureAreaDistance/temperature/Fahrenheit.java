package ua.com.goit.task4.TemperatureAreaDistance.temperature;

/**
 * Created by y.nechiporenko on 21.12.2015.
 */
public class Fahrenheit extends Temperature {
    private double woterFroze = 32.0;
    private double rateF = 9.0/5.0;

    Fahrenheit (double grad){
        this.grad = grad;
    }

    private double kievC = (grad-woterFroze)*rateF;

    public double getKievC() {
        return kievC;
    }
}
