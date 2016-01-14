package ua.com.goit.task3.FileFlowerTool.flower;

import java.util.Arrays;


public class FlowerRunner {
    public static void main (String [] args){
        Bouquet firstBouquet = new Bouquet(new Object[] {new Aster("red"), new Chamomile("white"), new Tulip("yellow"), new Rose("pink")});

        System.out.println("My first bouquet consist of:" + Arrays.toString(firstBouquet.stringBouquet()));
        Rosebush bigRosebush = new Rosebush("bigRosebush","pink");
        bigRosebush.whichRosebushBlossom();
    }
}
