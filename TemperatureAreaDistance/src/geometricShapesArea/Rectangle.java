package geometricShapesArea;

/**
 * Created by y.nechiporenko on 21.12.2015.
 */
public class Rectangle extends GeometricFigure {
    private double side1;
    private double side2;
    private double rectangleArea = side1*side2;

    Rectangle (double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }



    public double getRectangleArea() {
        return rectangleArea;
    }
}
