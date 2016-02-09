package ua.com.goit.task4.TemperatureAreaDistance.geometricShapesArea;

public class Rectangle extends GeometricFigure {
    private double side1;
    private double side2;

   public Rectangle (double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }



    public double rectangleArea() {
        final double rA = side1*side2;
        return rA;
    }
 }
