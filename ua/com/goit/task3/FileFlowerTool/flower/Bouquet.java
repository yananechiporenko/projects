package ua.com.goit.task3.FileFlowerTool.flower;

/**
 * Created by y.nechiporenko on 25.12.2015.
 */
public class Bouquet {
    private int countOfFlower;

    public Bouquet(int countOfFlower) {
        this.countOfFlower = countOfFlower;
    }

    public int getCountOfFlower() {
        return countOfFlower;
    }

    public void setCountOfFlower(int countOfFlower) {
        this.countOfFlower = countOfFlower;
    }

    public boolean smell (){
        return true;
    }

    Bouquet firstBouqet = new Bouquet(4) {};

        Aster aster1 = new Aster("red");
        Chamomile chamomile1 = new Chamomile("white");
        Rose rose1 = new Rose("pink");
        Tulip tulip1 = new Tulip("yellow");

}
