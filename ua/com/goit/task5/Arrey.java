package ua.com.goit.task5;

/**
 * Created by y.nechiporenko on 29.12.2015.
 */
public class Arrey {

    public static void main (String[] args){
        int [] myArrey = {3, 4, 6, 2, 1, 8};
        int biggerElement = 0;
        int smallerElement = 0;

        for (int i = 0; i < myArrey.length - 1; i++) {
            if (myArrey[i]>myArrey[i+1]) {
               biggerElement = myArrey[i];
            }
            else {
                biggerElement = myArrey[i+1];
            }
        }

        System.out.println("The biggest element is " + biggerElement);


        for (int i = 0; i < myArrey.length - 1; i++) {
            if (myArrey[i] < myArrey[i + 1]) {
                smallerElement = myArrey[i];
            } else {
                smallerElement = myArrey[i + 1];

            }
        }

        System.out.println("The smallest element is " + smallerElement);

        boolean changeExist = true;

        while (changeExist) {
            changeExist = false;
            for (int i = myArrey.length - 1; i > 0; i--) {
                if (myArrey[i] > myArrey[i - 1]) {
                    int tempVariable = myArrey[i];
                    myArrey[i] = myArrey[i - 1];
                    myArrey[i - 1] = tempVariable;

                    changeExist = true;
                }
            }
        }

        System.out.printf("Range from biggest to smallest: ");
        for (int element : myArrey) {
            System.out.printf(element + " ");
        }

    }
}
