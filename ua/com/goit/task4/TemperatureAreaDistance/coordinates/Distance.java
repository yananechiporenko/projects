package ua.com.goit.task4.TemperatureAreaDistance.coordinates;

public class Distance {
    Point point1;
    Point point2;

    public Distance(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double dictanceCalculator (){
        double xDifference = this.point1.getX()-this.point2.getX();
        double yDifference = this.point1.getY()-this.point2.getY();
        double a2 = xDifference*xDifference;
        double b2 = yDifference*yDifference;
        double c2 = a2+b2;
        double c = Math.sqrt(c2);
        System.out.println("Distance between points is " + c);
        return c;
    }
}
