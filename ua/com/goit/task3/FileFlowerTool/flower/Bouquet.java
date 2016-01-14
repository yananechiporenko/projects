package ua.com.goit.task3.FileFlowerTool.flower;

/**
 * Created by y.nechiporenko on 25.12.2015.
 */
public class Bouquet {
    private Object [] flowers;

    public Object[] getFlowers() {
        return flowers;
    }

    public Bouquet(Object[] flowers) {
        this.flowers = flowers;
    }

    public Object[] stringBouquet () {
        for (int i = 0; i < flowers.length; i++){
            flowers[i]= flowers[i].getClass().getSimpleName();
        }
        return flowers;
    }

}
