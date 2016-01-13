package ua.com.goit.task6Extra;

public class UnderAgeException extends Exception {
    private int underAge;

    public UnderAgeException(int underAge) {
        this.underAge = underAge;
    }

    public int getUnderAge() {
        return underAge;
    }
}
