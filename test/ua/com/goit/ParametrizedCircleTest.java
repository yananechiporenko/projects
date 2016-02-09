package test.ua.com.goit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ua.com.goit.task4.TemperatureAreaDistance.geometricShapesArea.Circle;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParametrizedCircleTest {

    private double rad;
    private double expected;

    public ParametrizedCircleTest(double rad, double expected) {
        this.rad = rad;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: {0} rad = {1} area")
    public static Iterable<Object> getParametrizedData(){
        return Arrays.asList(new Object[][]{
                {2.4, 18.095},
                {3.0, 28.274},
                {1.1, 3.801}
        });
    }

    @Test(timeout = 2000)
    public void testCircleArea() throws Exception {

        Assert.assertEquals(expected, new Circle(rad).circleArea(), 0.001);

    }
}