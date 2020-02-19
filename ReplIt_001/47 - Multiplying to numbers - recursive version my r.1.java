// package com.madejski;

class Main {

    public static int multiply(int a, int b) {
        if(a==0 || b==0)
            return 0;
        if(b>0)
            return (a + multiply(a, b-1));
        if(b<0)
            return -multiply(a, -b);

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(multiply(2, 4));
        System.out.println(multiply(8, 9));
    }
}