/*
Виконав студент групи СІ-22
Ковалишин Віктор Петрович
Варіант завдання 6
*
6. Реалізувати додавання і віднімання матриць: MA = MB-MC+MD.
Значення матриць заповнені псевдовипадковими числами з рівномірним розподілом у діапазоні від [0;1)
Розмірність матриць задається як аргумент командного рядка.
*/

package org.example;
/*
E=D-C=D-A+B
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Lab2");
        Operations Operation = new Operations ();
        double [][] arrA = Operation.generateMatrix(3,3);
        double [][] arrB = Operation.generateMatrix(3,3);
        double [][] arrD = Operation.generateMatrix(3,3);
        double [][] arrC = Operations.add(arrA, arrB);
        double [][] arrE = Operations.subtract(arrD, arrC);
        System.out.println("Matrix A:");
        Operations.printMatrix(arrA);
        System.out.println();
        System.out.println("Matrix B:");
        Operations.printMatrix(arrB);
        System.out.println();
        System.out.println("Matrix D:");
        Operations.printMatrix(arrD);
        System.out.println();
        System.out.println();
        System.out.println("Matrix C(A+B):");
        Operations.printMatrix(arrC);
        System.out.println();
        System.out.println();
        System.out.println("Matrix E(D-C):");
        Operations.printMatrix(arrE);
    }
}
