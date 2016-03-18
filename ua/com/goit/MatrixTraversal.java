package ua.com.goit;

import java.util.*;

public class MatrixTraversal {
    public static void main(String[] args) {
        MatrixTraversal matrixTraversal = new MatrixTraversal();

        System.out.println(matrixTraversal.count(new int[]{900, 901, 902}));
    }


    public int count(int[] gdp) {
        List<Integer> countersList = new ArrayList<>();
        List<Integer> valuesList = new ArrayList<>();
        countersList.add(1);
        int counter = 0;

        for (int i = 0; i < gdp.length - 1; i++) {

            if (Math.abs(gdp[i] - gdp[i + 1]) < 2) {
                if (valuesList.isEmpty())valuesList.add(gdp[i]);
                if (!valuesList.contains(gdp[i + 1]) && Math.abs(valuesList.get(0) - gdp[i + 1]) < 2 && valuesList.size() < 2) {
                    valuesList.add(gdp[i + 1]);
                }
                if (valuesList.contains(gdp[i])) {
                    counter++;
                } else {
                    valuesList = new ArrayList<>();
                    countersList.add(counter);
                    counter = 0;
                }
            }
            else {
                valuesList = new ArrayList<>();
                countersList.add(counter);
                counter = 1;
            }
        }
        countersList.add(counter);
        Integer LongestStabilityPeriod = Collections.max(countersList);


        return LongestStabilityPeriod;
    }
}
