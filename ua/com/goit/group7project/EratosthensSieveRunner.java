package ua.com.goit.group7project;

import java.util.Scanner;

public class EratosthensSieveRunner {
    public static void main(String[] args) {
        EratosthensSieve sieve = new EratosthensSieve();
        System.out.println("Please, enter a number");
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        sieve.arrayCreate(n);
        sieve.findPrimeNumbers();
        sieve.showPrimeNumbers();

    }
}
