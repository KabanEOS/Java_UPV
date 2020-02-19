package com.madejski;

class Main {

    public static int search(int[] v, int franek) {
        int zuzia = -1;
        for (int i= 0; i<v.length; i++){
        if (v[i]==franek) zuzia = i+1;
        else if(i==v.length && i!=franek) zuzia =-1;
        }
        return zuzia;
    }

    public static void main(String[] args) {
        // Let's see if the method works or not
        int[] v = {2, 4, 65, 43, 2, 0, -40, 50, 23, 4};

        int ex1 = search(v, 23);
        if (ex1 != -1) System.out.println("The element " + 23 + " is at position " + ex1);
        else System.out.println("The element is not in the array");

        ex1 = search(v, 30);
        if (ex1 != -1) System.out.println("The element " + 30 + " is at position " + ex1);
        else System.out.println("The element is not in the array");
    }
}