package ua.com.goit.task5Extra;

import java.util.Scanner;

public class MatrixCalculator {
    private Matrix firstMatrix;
    private Matrix secondMatrix;

    public MatrixCalculator(Matrix firstMatrix, Matrix secondMatrix) {
        this.firstMatrix = firstMatrix;
        this.secondMatrix = secondMatrix;
    }

    public double [][] matrixCalculator (){
        if ((firstMatrix.getMatrixElemens().length == secondMatrix.getMatrixElemens().length) &
                (firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length) ==
        secondMatrix.getMatrixElemens()[secondMatrix.getMatrixElemens().length - 1].length){

            System.out.println("Please enter a name for new multiplied matrix");
            Scanner scanner = new Scanner(System.in);
            final String multipliedMatrixName = scanner.next();
            Matrix d = new Matrix(new double [firstMatrix.getMatrixElemens().length]
                    [firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length]);
        for (int i = 0; i < firstMatrix.getMatrixElemens().length; i++  ){
            for (int j = 0; j < firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length; j++ ){
               d.getMatrixElemens() [i][j] = firstMatrix.getMatrixElemens() [i][j] * secondMatrix.getMatrixElemens() [i][j];
            }

        }
            System.out.println(d.getMatrixElemens());
            return d.getMatrixElemens();
    }else {
        System.out.println("Your matrix should have the same size");}
        Matrix falseMatrix = new Matrix(new double [firstMatrix.getMatrixElemens().length]
                [firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length]);
        return falseMatrix.getMatrixElemens();

    }
}
