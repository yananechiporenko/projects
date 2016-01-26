package ua.com.goit.task4.TemperatureAreaDistance.coordinates;

public class Distance {
    Point point1;
    Point point2;


    public double dictanceCalculator (Point point1,Point point2){
        double xDifference = point1.getX()-point2.getX();
        double yDifference = point1.getY()-point2.getY();
        double a2 = xDifference*xDifference;
        double b2 = yDifference*yDifference;
        double c2 = a2+b2;
        double c = Math.sqrt(c2);
        System.out.println("Distance between points is " + c);
        return c;
    }
}
