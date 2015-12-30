/**
 * Created by y.nechiporenko on 21.12.2015.
 */
package ua.com.goit.task4.TemperatureAreaDistance.geometricShapesArea;
public class GeometricFigure {
        public static final double PI = 3.141592;

    public static void main (String[] args){
    Circle circle1 = new Circle(2.4);
    Triangle triangle1 = new Triangle(3.2, 2.5);
    Rectangle rectangle1 = new Rectangle(1.9, 3.1);

        System.out.println (rectangle1.getRectangleArea());
        System.out.println(triangle1.getTriangleArea());
        System.out.println(circle1.getCircleArea());
    }
    }



