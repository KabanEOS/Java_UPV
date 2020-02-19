package com.madejski;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h, A, p, c1, c2;
        System.out.println("Give me length of side C1:");
        c1 = scanner.nextDouble();
        System.out.println("Give me length of side C2:");
        c2 = scanner.nextDouble();
        h=  Math.sqrt(Math.pow(c1,2)+ Math.pow(c2,2));
        System.out.println("Hypotenuse length: "+ h);
        System.out.println("Area value: "+ ((c1 *c2)/2));
        System.out.println("Perimeter length: "+ (h+c1+c2));

  }
}
