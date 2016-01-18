package ua.com.goit.task4.TemperatureAreaDistance.coordinates;

public class DistanceRunner {
    public static void main (String [] args){
        Distance distance1 = new Distance();

        distance1.createPoint1(3.0, 8.0);
        distance1.createPoint2(9.0, 4.0);

        distance1.dictanceCalculator();

    }
}
