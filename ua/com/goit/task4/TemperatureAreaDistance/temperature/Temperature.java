package ua.com.goit.task4.TemperatureAreaDistance.temperature;

public class Temperature {

    public static void main (String[] args){
        final Celsius celsius = new Celsius(11.0);
        final Fahrenheit fahrenheit = new Fahrenheit(48.0);
        System.out.println(celsius.toFahrenheit());
        System.out.println(fahrenheit.toCelsius());

    }

}
