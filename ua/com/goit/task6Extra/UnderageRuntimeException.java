package ua.com.goit.task6Extra;

public class UnderageRuntimeException extends RuntimeException {
    private int underAgeR;

    public UnderageRuntimeException(int underAgeR) {
        this.underAgeR = underAgeR;
    }

    public int getUnderAgeR() {
        return underAgeR;
    }
}
