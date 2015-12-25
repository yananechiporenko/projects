package ua.com.goit.task4.TemperatureAreaDistance.geometricShapesArea;

/**
 * Created by y.nechiporenko on 21.12.2015.
 */
public class Triangle extends GeometricFigure {
    private double side;
    private double high;
    private double triangleArea = (1/2)*side*high;
        Triangle (double side, double high){
        this.side = side;
        this.high = high;

    }
    public double getTriangleArea() {
        return triangleArea;
    }
}
