 package com.madejski;
import java.util.Scanner;
import java.io.*;

class Main {

    // Generate matrix with values by keyboard
    public static float[][] generateMatrix(int rows, int columns) {
        float[][] m = new float[rows][columns];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++) {
                int iPlus= i+1;
                int jPlus= j+1;
                System.out.println("Give me row " + iPlus + " and column " + jPlus);
                m[i][j] = input.nextFloat();
            }
        return m;
    }
    public static void printMatrix(float[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.println("");
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");
        }
    }

    public static float[][] sumMatrix(float[][] m1, float[][] m2) {
        int rows = m1.length;
        int cols = m1[0].length;
        float[][] m = new float[rows][cols];
        for (int i = 0; i < m1.length; i++)
            for (int j = 0; j < m1[i].length; j++) {
                m[i][j] = m1[i][j] + m2[i][j];
            }
        return m;
    }

    public static void main(String[] args) {
        int rows, columns;
        Scanner input = new Scanner(System.in);
        float[][] m1, m2, sum;

        System.out.println("How many rows have the matrices?");
        rows = input.nextInt();
        System.out.println("How many columns have the matrices?");
        columns = input.nextInt();

        System.out.println("Introduce the values of the first matrix:");
        m1 = generateMatrix(rows, columns);
        System.out.println("Introduce the values of the second matrix:");
        m2 = generateMatrix(rows, columns);

        printMatrix(sumMatrix(m1, m2));
    }
}