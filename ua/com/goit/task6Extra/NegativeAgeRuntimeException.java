package ua.com.goit.task6Extra;


public class NegativeAgeRuntimeException extends RuntimeException {
    private int ageValueR;

    public NegativeAgeRuntimeException(int ageValueR) {
        this.ageValueR = ageValueR;
    }

    public int getAgeValueR() {
        return ageValueR;
    }
}
