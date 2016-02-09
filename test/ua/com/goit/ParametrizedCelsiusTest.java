package test.ua.com.goit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ua.com.goit.task4.TemperatureAreaDistance.temperature.Celsius;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class ParametrizedCelsiusTest {
    private double grad;
    private double expected;

    public ParametrizedCelsiusTest(double grad, double expected) {
        this.grad = grad;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: {0} C = {1} F")
    public static Iterable<Object> getParametrizedData(){
        return Arrays.asList(new Object[][]{
                {24, 45.33},
                {30, 48.66},
                {11, 38.11}
        });
    }

    @Test(timeout = 3000)
    public void testGetToFahrenheit() throws Exception {
        assertEquals(expected, new Celsius(grad).toFahrenheit(), 0.01);

    }
}