package ua.com.goit.task4.TemperatureAreaDistance.geometricShapesArea;

/**
 * Created by y.nechiporenko on 21.12.2015.
 */
public class Circle extends GeometricFigure {
    private double rad;
    private double circleArea = PI * rad * rad;
    Circle(double rad){
        this.rad = rad;
    }

    public double getCircleArea() {
        return circleArea;
    }
}
