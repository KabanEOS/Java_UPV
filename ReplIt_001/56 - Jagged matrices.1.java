package com.madejski;
import java.util.Scanner;

class Main {

    // Generating a jagged matrix by asking the user
    public static float[][] generateJaggedMatrix() {
        float[][] matrix;
        int rows, columns;
        Scanner input = new Scanner(System.in);

        System.out.println("How many rows has the matrix?");
        rows = input.nextInt();

        matrix = new float[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.println("How many columns the " + i + " row?");
            columns = input.nextInt();
            matrix[i] = new float[columns];
        }

        // Let's read all the values of the jagged matrix
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Give me element of row " + i + " and column " + j + " :");
                matrix[i][j] = input.nextFloat();
            }

        // Matrix created and with all its values
        return matrix;
    }

    // Printing a jagged matrix
    public static void printJaggedMatrix(float[][] m) {
        for (int i = 0; i < m.length; i++) {   // rows
            for (int j = 0; j < m[i].length; j++) // columns (different number, so we need to consult its length)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

    // Look for a value matrix
    public static boolean search(float[][] m, float x) {
        boolean found = false;
        for (int i = 0; i < m.length && !found; i++) {   // rows
            for (int j = 0; j < m[i].length && !found; j++) {
                if (m[i][j] == x) found = true;
            }
        }
        return found;
    }


        public static void main ( String[]args){
        // Let's create and introduce the values of a jagged matrix
        float[][] matrix = generateJaggedMatrix();

        System.out.println("Your input matrix is then:");
        printJaggedMatrix(matrix);

        // Let's look for an element
        Scanner input = new Scanner(System.in);

        System.out.println("Give me a value you want to look for:");
        float x = input.nextFloat();

        if (search(matrix, x))
            System.out.println("I have found the element in the matrix");
        else
            System.out.println("I haven't found the element in the matrix");
    }
}