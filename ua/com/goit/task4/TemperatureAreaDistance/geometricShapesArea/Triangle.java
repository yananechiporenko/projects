package ua.com.goit.task4.TemperatureAreaDistance.geometricShapesArea;

public class Triangle extends GeometricFigure {
    private double side;
    private double high;

        Triangle (double side, double high){
        this.side = side;
        this.high = high;

    }
    public double triangleArea() {
        final double tA = (1.0/2.0) * side * high;
        return tA;
    }
}
