package ua.com.goit.task3.FileFlowerTool.tool;

public class Store {
    private String address;
    public boolean open1(){
        return true;
    }
    public boolean close(){
        return false;
    }

    public Store(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    Store store1 = new Store("Kiev, 48 Artem st.");
    Trumpet trumpet1 = new Trumpet("linear");
    Guitar guitar1 = new Guitar("roundish");
    Piano piano1 = new Piano("square");

}
