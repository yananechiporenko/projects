package ua.com.goit.group7project;

import java.util.Scanner;

public class EratosthensSieve {
    public static void main(String[] args) {
        System.out.println("Please, enter a number");
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        int [] arrayOfNumber = new int[n-1];
        final int p = 2;

        for (int i  = 0; i<arrayOfNumber.length; i++){
            arrayOfNumber[i] = i + p;
        }

        for (int i = p; i < arrayOfNumber.length + p; i++){
            for (int j = i+i; j < arrayOfNumber.length + p; j += i){
                arrayOfNumber[j-p] = 0;
            }
        }

        for (int i = 0; i < arrayOfNumber.length; i++){
            if (arrayOfNumber[i] != 0){
                System.out.print(arrayOfNumber[i] + " ");
            }
        }
    }
}
