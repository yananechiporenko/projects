package ua.com.goit.task4.TemperatureAreaDistance.coordinates;

public class Distance {
    Point point1;
    Point point2;

    public Point createPoint1 (double x, double y){
         point1 = new Point(x, y);
        return point1;
    }

    public Point createPoint2 (double x, double y){
        point2 = new Point(x, y);
        return point2;
    }

    public double dictanceCalculator (){
        double xDifference = point1.getX()-point2.getX();
        double yDifference = point1.getY()-point2.getY();
        double a2 = xDifference*xDifference;
        double b2 = yDifference*yDifference;
        double c2 = a2+b2;
        double c = Math.sqrt(c2);
        System.out.println(c);
        return c;
    }
}
