package com.madejski;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int m;
            Scanner scan=new Scanner(System.in);
        System.out.println("How many points do you have? : ");
            m = scan.nextInt();

        System.out.println("Your mark: ");
                        if(m==10){
                System.out.println("A+");}
                        else if(m<10 && m>= 8){
                System.out.println("A");}
                        else if(m<8 && m>= 6){
                System.out.println("B");}
                        else if(m<6 && m>= 5){
                System.out.println("C");}
                        else if(m<5 && m>= 3){
                System.out.println("D");}
                        else if(m<3 && m>= 0){
                System.out.println("F");}
                        else{
                System.out.println("wrong value");}
        }
}

// Write a program that asks for your mark between 0 and 10 (real number), and prints:

// F if the mark is less than 3
// D if the mark is between 3 and less than 5
// C if the mark is between 5 and less than 6
// B if the mark is between 6 and less than 8
// A if the mark is between 8 and less than 10
// A+ if the mark is 10