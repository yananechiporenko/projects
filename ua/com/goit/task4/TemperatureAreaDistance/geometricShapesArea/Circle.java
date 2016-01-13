package ua.com.goit.task4.TemperatureAreaDistance.geometricShapesArea;


public class Circle extends GeometricFigure {
    private double rad;

    Circle(double rad){
        this.rad = rad;
    }

    public double circleArea() {
        final double cA = PI * rad * rad;
        return cA;
    }
}
