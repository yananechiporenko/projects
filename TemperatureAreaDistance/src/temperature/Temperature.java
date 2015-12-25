package temperature;

/**
 * Created by y.nechiporenko on 21.12.2015.
 */
public class Temperature {
    public double grad;

    public static void main (String[] args){
        Celsius celsiusOdessa = new Celsius(24.0);
        Fahrenheit fahrenheitKiev = new Fahrenheit(48.0);
        System.out.println(celsiusOdessa.getOdessaF());
        System.out.println(fahrenheitKiev.getKievC());

    }

}
