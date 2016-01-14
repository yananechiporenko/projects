package ua.com.goit.task3.FileFlowerTool.flower;

public class Rosebush {
    private String name;
    private String color;

    public Rosebush(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean blossom (){
        return true;
    }

    public void whichRosebushBlossom (){
        if (blossom()){
            System.out.println(getName() + " blossom " + getColor());
        }
    }
}

