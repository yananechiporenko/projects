package ua.com.goit.task3.FileFlowerTool.tool;

public class Tool implements Comparable {
    private String shape;

    @Override
    public int compareTo(Object o) {
        Tool next = (Tool) o;
        return this.getClass().getSimpleName().compareTo(next.shape);
    }

    public boolean sound(){
        return true;
    }

    public Tool(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +" {" +
                "shape='" + shape + '\'' +
                '}';
    }
}

