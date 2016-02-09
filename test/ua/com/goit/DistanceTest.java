package test.ua.com.goit;

import org.junit.Assert;
import org.junit.Test;
import ua.com.goit.task4.TemperatureAreaDistance.coordinates.Distance;
import ua.com.goit.task4.TemperatureAreaDistance.coordinates.Point;


public class DistanceTest {

    @Test(timeout = 2000)
    public void testDictanceCalculator() throws Exception {

        final double x1 = 1.0;
        final double y1 = 1.0;
        final double x2 = 2.0;
        final double y2 = 2.0;
        final Distance distance = new Distance(new Point(x1, y1),new Point(x2, y2));
        final double distanceResult = distance.dictanceCalculator();
        final double distanceExpected = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        Assert.assertEquals(distanceExpected,distanceResult,0.00000000001);



    }
}