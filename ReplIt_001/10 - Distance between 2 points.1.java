package com.madejski;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double x1 = 0;
    double y1 = 0;
    double x2 = 0;
    double y2 = 0;
    double distance = 0;

    //input
        System.out.println("Please enter x1 coordinates ");
        x1 = scan.nextDouble();
        System.out.println("Please enter x1 coordinates ");
        y1 = scan.nextDouble();
        System.out.println("Please enter x1 coordinates ");
        x2 = scan.nextDouble();
        System.out.println("Please enter x1 coordinates ");
        y2 = scan.nextDouble();
        scan. close();

        distance = Math.sqrt(Math.pow(x1-x2,2) + (Math.pow(y1-y2,2)));
        System.out.println("The distance is: "+distance);

  }
}