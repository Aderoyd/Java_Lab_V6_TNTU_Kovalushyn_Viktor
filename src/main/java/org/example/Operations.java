package org.example;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
resulta - result of add
results - result of subtract
 */
public class Operations {

    /*
    генерує матрицю 3х3
     */
    public static double[][] generateMatrix(int rows, int cols)
    {
        Random random = new Random();
        double[][] newMatrix = new double[rows][cols];
        for (int i = 0; i < newMatrix.length; i++)
        {
            for (int j = 0; j < newMatrix[0].length; j++)
            {
                newMatrix[i][j] = ThreadLocalRandom.current().nextDouble();
            }
        }
        return newMatrix;
    }
    /*
    Додавання матриць
     */
    public static double[][] add(double[][] A, double[][] B) {
        if (A == null || B == null  || A.length < 1 || A[0].length < 1)
        {  System.err.println("Error :D, Try again");
            System.exit(1);}
        double[][] resulta = new double[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++)
                resulta[i][j] = A[i][j] + B[i][j];
        }
        return resulta;
    }
    /*
    Віднімання матриць
     */
    public static double[][] subtract(double[][] A, double[][] B) {
        if (A == null || B == null  || A.length < 1 || A[0].length < 1)
        {  System.err.println("Error :D, Try again");
            System.exit(1);}
        double[][] results = new double[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++)
                results[i][j] = A[i][j] - B[i][j];
        }
        return results;
    }
    /*
    Вивід матриці
     */
    public static void printMatrix(double[][] matrix) {
        for (double[] innerArray : matrix) {
            for (double value : innerArray) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

