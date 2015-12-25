package coordinates;

/**
 * Created by 222 on 21.12.2015.
 */
import static java.lang.Math.*;
public class Point {
    private double x;
    private double y;
    Point (double x, double y){
        this.x = x;
        this.y = y;
    }
    public static void main (String [] args){
        Point point1 = new Point(3.0, 8.0);
        Point point2 = new Point(9.0, 4.0);

        double xDifference = point1.x-point2.x;
        double yDifference = point1.y-point2.y;
        double a2 = xDifference*xDifference;
        double b2 = yDifference*yDifference;
        double c2 = a2+b2;
        double c = Math.sqrt(c2);
        System.out.println(c);
    }
}
