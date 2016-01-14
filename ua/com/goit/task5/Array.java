package ua.com.goit.task5;

public class Array {
    private int[] elements;

    public Array(int[] elements) {
        this.elements = elements;
    }

    public int[] getElements() {
        return elements;
    }

    public int biggerElement() {
        int bE = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            if (elements[i] > elements[i + 1]) {
                bE = elements[i];
            } else {
                bE = elements[i + 1];
            }
        }
        System.out.println("The biggest element is " + bE);
        return bE;
    }

    public int smallerElement() {
        int sE = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            if (elements[i] < elements[i + 1]) {
                sE = elements[i];
            } else {
                sE = elements[i + 1];

            }
        }

        System.out.println("The smallest element is " + sE);
        return sE;
    }

    public int[] rangeDecrease() {
        boolean changeExist = true;
        while (changeExist) {
            changeExist = false;
            for (int i = elements.length - 1; i > 0; i--) {
                if (elements[i] > elements[i - 1]) {
                    int tempVariable = elements[i];
                    elements[i] = elements[i - 1];
                    elements[i - 1] = tempVariable;

                    changeExist = true;
                }
            }
        }
        System.out.printf("Range from biggest to smallest: ");

        for (int element : elements) {
            System.out.printf(element + " ");
        }
        System.out.println();
        return elements;
    }

    public int[] rangeIncrease() {
        boolean changeExist = true;
        while (changeExist) {
            changeExist = false;
            for (int i =  0; i < elements.length-1; i++) {
                if (elements[i] > elements[i + 1]) {
                    int tempVariable = elements[i];
                    elements[i] = elements[i + 1];
                    elements[i + 1] = tempVariable;

                    changeExist = true;
                }
            }
        }
        System.out.printf("Range from smallest to biggest: ");

        for (int element : elements) {
            System.out.printf(element + " ");
        }
        System.out.println();
        return elements;
    }
}
