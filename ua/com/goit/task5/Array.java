package ua.com.goit.task5;

/**
 * Created by y.nechiporenko on 29.12.2015.
 */
public class Array {

    public static void main (String[] args){
        int [] myArray = {3, 4, 6, 2, 1, 8};
        int biggerElement = 0;
        int smallerElement = 0;

        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i]> myArray[i+1]) {
               biggerElement = myArray[i];
            }
            else {
                biggerElement = myArray[i+1];
            }
        }

        System.out.println("The biggest element is " + biggerElement);


        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] < myArray[i + 1]) {
                smallerElement = myArray[i];
            } else {
                smallerElement = myArray[i + 1];

            }
        }

        System.out.println("The smallest element is " + smallerElement);

        boolean changeExist = true;

        while (changeExist) {
            changeExist = false;
            for (int i = myArray.length - 1; i > 0; i--) {
                if (myArray[i] > myArray[i - 1]) {
                    int tempVariable = myArray[i];
                    myArray[i] = myArray[i - 1];
                    myArray[i - 1] = tempVariable;

                    changeExist = true;
                }
            }
        }

        System.out.printf("Range from biggest to smallest: ");
        for (int element : myArray) {
            System.out.printf(element + " ");
        }

    }
}
