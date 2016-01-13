package ua.com.goit.task6Extra;

public class NegativeAgeException extends Exception {
    private int ageValue;

    public int getAgeValue() {
        return ageValue;
    }

    public NegativeAgeException(int ageValue) {
        this.ageValue = ageValue;
    }
}
