package ua.com.goit.task4.TemperatureAreaDistance.coordinates;

import java.util.Scanner;

public class DistanceRunner {
    public static void main (String [] args){
        Distance distance1 = new Distance();

        System.out.println("Please, enter 'x' for point1");
        final Scanner scannerX1 = new Scanner(System.in);
        final double x1 = scannerX1.nextDouble();
        System.out.println("Please, enter 'y' for point1");
        final Scanner scannerY1 = new Scanner(System.in);
        final double y1 = scannerY1.nextDouble();
        Point point1 = new Point(x1, y1);
        System.out.println("Please, enter 'x' for point2");
        final Scanner scannerX2 = new Scanner(System.in);
        final double x2 = scannerX2.nextDouble();
        System.out.println("Please, enter 'y' for point2");
        final Scanner scannerY2 = new Scanner(System.in);
        final double y2 = scannerY2.nextDouble();
        Point point2 = new Point(x2, y2);

        distance1.dictanceCalculator(point1,point2);

    }
}
