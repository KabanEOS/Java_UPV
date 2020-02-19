package com.madejski;
import java.util.Scanner;

class Main {
  
  public static long factorial(long n) {
        long i, fact=1;
        for(i = 1;  i<=n; i++){
            fact=fact*i;
        }
        return fact;
  }
  
  
  public static void main(String[] args) {
    System.out.println("The factorial of 5 is " + factorial(5));
  }
}