package ua.com.goit.task3.FileFlowerTool.flower;

public class Flower implements Comparable {
    private String color;

    @Override
    public int compareTo(Object o) {
        Flower next = (Flower) o;
        return this.color.compareTo(next.color);
    }

    public Flower(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean smell (){
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +" {" +
                "color='" + color + '\'' +
                '}';
    }
}
