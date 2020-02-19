package com.madejski;
import java.util.Scanner;

class Main {

    public static float power(float x, float y) {
        float result = 1;
        if (x != 0 && y%1==0) {
            if (y > 0) {
                for (int i = 0; i < y; i++) {
                    result *= x;
                }
            }
            if (y < 0) {
                float denominator = 1;
                for (int i = 0; i < -y; i++) {
                    denominator *= x;
                }
                result = 1 /denominator;
            }
            if(y == 0){
                result = 1;
            }
        }
        else System.out.println("Error");
        return result;
    }
//x=!0 , y>0 norm, y<0 fraction, y=0 1

    public static void main (String[]args){
        float x, y;
        // base = x, exponent = y
        System.out.println(power(3, 2));
        System.out.println(power(-3, 2));
        System.out.println(power(3, -2));
        System.out.println(power(3, 0));
    }
}
