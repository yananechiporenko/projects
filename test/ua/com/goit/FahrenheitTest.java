package test.ua.com.goit;

import org.junit.Assert;
import org.junit.Test;
import ua.com.goit.task4.TemperatureAreaDistance.temperature.Fahrenheit;

import static org.junit.Assert.*;

public class FahrenheitTest {

    @Test(timeout = 2000)
    public void testToCelsius() throws Exception {
        final double rateF = 9.0/5.0;
        final double waterFroze = 32.0;
        final double grad = 48.0;

        final Fahrenheit fahrenheit = new Fahrenheit(grad);
        final double result = fahrenheit.toCelsius();

        final double expected = rateF * (grad - waterFroze);

        Assert.assertEquals(result, expected, 0.00000000001);


    }
}