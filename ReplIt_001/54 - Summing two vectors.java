package com.madejski;

class Main {

    static public double[] sum(double[] v1, double[] v2) {
        double[] v = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            v[i] = v1[i] + v2[i];
        }
        return v;
    }

    // Printing an array
    static public void printArray(double[] v) {
        System.out.println("The components of the array are:");
        for (int i = 0; i < v.length; i++)
            System.out.println(v[i]);
    }

    public static void main(String[] args) {
        // Testing the method
        double[] v1 = {1.0, 3.0, 2.0, 5.6}, v2 = {2.0, 1.0, 2.5, 1.4};

        printArray(sum(v1, v2));
    }
}