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

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
