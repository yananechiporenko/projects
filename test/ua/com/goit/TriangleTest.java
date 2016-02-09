package test.ua.com.goit;

import org.junit.Assert;
import org.junit.Test;
import ua.com.goit.task4.TemperatureAreaDistance.geometricShapesArea.Triangle;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test(timeout = 2000)
    public void testTriangleArea() throws Exception {
        final double side = 3.0;
        final double hide = 2.0;

        final Triangle triangle = new Triangle(side, hide);
        final double result = triangle.triangleArea();

        final double expected = 0.5d * side * hide;

        Assert.assertEquals(expected, result, 0.00000000001); 

    }
}