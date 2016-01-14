package ua.com.goit.task3.FileFlowerTool.tool;

import java.util.Arrays;

public class ToolRunner {
    public static void main (String [] args) {
        Store store1 = new Store("Kiev, 48 Artem st.");
        store1.setTools(new Object[]{new Guitar("roundish"), new Trumpet("linear"), new Piano("square")});

        if (store1.open1()) {
            System.out.println("Store by the address " + store1.getAddress() + "is open now. You can buy here " + Arrays.toString(store1.stringTools()));
        } else if (store1.close()){
            System.out.println("Sorry, but store by the address " + store1.getAddress() + "is close now.");
        }
    }
}
