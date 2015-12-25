package geometricShapesArea;

/**
 * Created by y.nechiporenko on 21.12.2015.
 */
public class Circle extends GeometricFigure {
    private double rad;
    private double circleArea = getPi()*rad*rad;
    Circle(double rad){
        this.rad = rad;
    }

    public double getCircleArea() {
        return circleArea;
    }
}
