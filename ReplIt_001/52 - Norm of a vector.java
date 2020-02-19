// package com.madejski;
import java.util.*;

class Main {

   public static double norm(double[] v ){
       double sum = 0;
        for(int i = 0; i<v.length; i++){
        sum+= Math.pow(v[i],2);
        }
       return Math.sqrt(sum);
   }

    public static void main(String[] args) {
        // Let's see if it works with an example
        double[] v = {5.2, 1.2, 4.5, 6, 3.5};

        System.out.println(norm(v));

    }
}