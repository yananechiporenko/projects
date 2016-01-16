package ua.com.goit.task4.TemperatureAreaDistance.coordinates;

public class Point {
    /*
    По-моему, данный класс относится к антипаттерну The Blob. Предлагаю разнести его на 3 отдельных класса:
    1-ый - сам класс Point с описанием полей, геттерами и конструктором;
    2-ой - класс Distance, который будет рассчитывать растояние между точками;
    3-ий - класс DistanceRunner, который будет запускать программу и выводить на консоль растояние между точками.
     */
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
