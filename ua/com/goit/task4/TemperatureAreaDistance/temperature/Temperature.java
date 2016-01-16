package ua.com.goit.task4.TemperatureAreaDistance.temperature;

public class Temperature {
    public double grad;

    public static void main (String[] args){
        Celsius celsiusOdessa = new Celsius(24.0);
        Fahrenheit fahrenheitKiev = new Fahrenheit(48.0);
        System.out.println(celsiusOdessa.getOdessaF());
        System.out.println(fahrenheitKiev.getKievC());

    }

}
