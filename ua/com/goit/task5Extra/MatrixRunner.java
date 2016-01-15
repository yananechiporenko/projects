package ua.com.goit.task5Extra;

public class MatrixRunner {
    public static void main(String[] args) {

        Matrix matrixA = new Matrix(new double[][]{{2.0, 1.0, 3.0}, {3.0, 1.0, 2.0}});
        Matrix matrixB = new Matrix(new double[][]{{1.0, 2.0, 1.0}, {1.0, 2.0, 1.0}});
        MatrixCalculator calculator1 = new MatrixCalculator(matrixA, matrixB);
        calculator1.matrixMultiplied();
        calculator1.matrixDivided();
        calculator1.matrixAdded();
        calculator1.matrixSubtracted();

    }
}
