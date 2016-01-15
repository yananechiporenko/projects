package ua.com.goit.task5Extra;

import java.util.Scanner;

public class MatrixCalculator {
    private Matrix firstMatrix;
    private Matrix secondMatrix;

    public MatrixCalculator(Matrix firstMatrix, Matrix secondMatrix) {
        this.firstMatrix = firstMatrix;
        this.secondMatrix = secondMatrix;
    }

    public double [][] matrixMultiplied(){
        if ((firstMatrix.getMatrixElemens().length == secondMatrix.getMatrixElemens().length) &
                (firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length) ==
        secondMatrix.getMatrixElemens()[secondMatrix.getMatrixElemens().length - 1].length){

            Matrix multiplied = new Matrix(new double [firstMatrix.getMatrixElemens().length]
                    [firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length]);
        for (int i = 0; i < firstMatrix.getMatrixElemens().length; i++  ){
            for (int j = 0; j < firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length; j++ ){
               multiplied.getMatrixElemens() [i][j] = firstMatrix.getMatrixElemens() [i][j] * secondMatrix.getMatrixElemens() [i][j];
            }

        }   System.out.println("Your new multiplied matrix contains:");
            for (int i = 0; i < multiplied.getMatrixElemens().length; i++){
                for (int j = 0; j < multiplied.getMatrixElemens()[0].length; j++){
                    System.out.print(multiplied.getMatrixElemens()[i][j] + " ");
                }
                System.out.println();
            }
            return multiplied.getMatrixElemens();
    }else {
        System.out.println("Your matrix should have the same size");}
        Matrix falseMatrix = new Matrix(new double [firstMatrix.getMatrixElemens().length]
                [firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length]);
        return falseMatrix.getMatrixElemens();

    }

    public double [][] matrixDivided(){
        if ((firstMatrix.getMatrixElemens().length == secondMatrix.getMatrixElemens().length) &
                (firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length) ==
                        secondMatrix.getMatrixElemens()[secondMatrix.getMatrixElemens().length - 1].length){

            Matrix multiplied = new Matrix(new double [firstMatrix.getMatrixElemens().length]
                    [firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length]);
            for (int i = 0; i < firstMatrix.getMatrixElemens().length; i++  ){
                for (int j = 0; j < firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length; j++ ){
                    multiplied.getMatrixElemens() [i][j] = firstMatrix.getMatrixElemens() [i][j] / secondMatrix.getMatrixElemens() [i][j];
                }

            }   System.out.println("Your new divided matrix contains:");
            for (int i = 0; i < multiplied.getMatrixElemens().length; i++){
                for (int j = 0; j < multiplied.getMatrixElemens()[0].length; j++){
                    System.out.print(multiplied.getMatrixElemens()[i][j] + " ");
                }
                System.out.println();
            }
            return multiplied.getMatrixElemens();
        }else {
            System.out.println("Your matrix should have the same size");}
        Matrix falseMatrix = new Matrix(new double [firstMatrix.getMatrixElemens().length]
                [firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length]);
        return falseMatrix.getMatrixElemens();

    }

    public double [][] matrixAdded(){
        if ((firstMatrix.getMatrixElemens().length == secondMatrix.getMatrixElemens().length) &
                (firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length) ==
                        secondMatrix.getMatrixElemens()[secondMatrix.getMatrixElemens().length - 1].length){

            Matrix multiplied = new Matrix(new double [firstMatrix.getMatrixElemens().length]
                    [firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length]);
            for (int i = 0; i < firstMatrix.getMatrixElemens().length; i++  ){
                for (int j = 0; j < firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length; j++ ){
                    multiplied.getMatrixElemens() [i][j] = firstMatrix.getMatrixElemens() [i][j] + secondMatrix.getMatrixElemens() [i][j];
                }

            }   System.out.println("Your new added matrix contains:");
            for (int i = 0; i < multiplied.getMatrixElemens().length; i++){
                for (int j = 0; j < multiplied.getMatrixElemens()[0].length; j++){
                    System.out.print(multiplied.getMatrixElemens()[i][j] + " ");
                }
                System.out.println();
            }
            return multiplied.getMatrixElemens();
        }else {
            System.out.println("Your matrix should have the same size");}
        Matrix falseMatrix = new Matrix(new double [firstMatrix.getMatrixElemens().length]
                [firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length]);
        return falseMatrix.getMatrixElemens();

    }
    public double [][] matrixSubtracted(){
        if ((firstMatrix.getMatrixElemens().length == secondMatrix.getMatrixElemens().length) &
                (firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length) ==
                        secondMatrix.getMatrixElemens()[secondMatrix.getMatrixElemens().length - 1].length){

            Matrix multiplied = new Matrix(new double [firstMatrix.getMatrixElemens().length]
                    [firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length]);
            for (int i = 0; i < firstMatrix.getMatrixElemens().length; i++  ){
                for (int j = 0; j < firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length; j++ ){
                    multiplied.getMatrixElemens() [i][j] = firstMatrix.getMatrixElemens() [i][j] - secondMatrix.getMatrixElemens() [i][j];
                }

            }   System.out.println("Your new subtract matrix contains:");
            for (int i = 0; i < multiplied.getMatrixElemens().length; i++){
                for (int j = 0; j < multiplied.getMatrixElemens()[0].length; j++){
                    System.out.print(multiplied.getMatrixElemens()[i][j] + " ");
                }
                System.out.println();
            }
            return multiplied.getMatrixElemens();
        }else {
            System.out.println("Your matrix should have the same size");}
        Matrix falseMatrix = new Matrix(new double [firstMatrix.getMatrixElemens().length]
                [firstMatrix.getMatrixElemens()[firstMatrix.getMatrixElemens().length - 1].length]);
        return falseMatrix.getMatrixElemens();

    }
}
