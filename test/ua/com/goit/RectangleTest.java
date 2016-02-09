package test.ua.com.goit;

import org.junit.Assert;
import org.junit.Test;
import ua.com.goit.task4.TemperatureAreaDistance.geometricShapesArea.Rectangle;


public class RectangleTest {

    @Test(timeout = 2000)
    public void testRectangleArea() throws Exception {
        final double side1 = 2.0;
        final double side2 = 2.0;

        final Rectangle rectangle1 = new Rectangle(side1, side2);
        final double result = rectangle1.rectangleArea();

        final double expected = side1*side2;

        Assert.assertEquals(expected,result,0.0000000001);

    }
}