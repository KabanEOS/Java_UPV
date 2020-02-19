package com.madejski;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hours: ");
        int h = scan.nextInt();
        System.out.println("Minutes: ");
        int m = scan.nextInt();
        System.out.println("Seconds: ");
        int s = scan.nextInt();

        s += 1;

        if(s==60){
            m += 1;
            s = 0;
            if(m==60){
                h += 1;
                m = 0;
                if(h==24){
                    h = 0;
                    m = 0;
                    s = 0;
                }
            }
        }
        System.out.printf("Result :"+"%02d:%02d:%02d",h,m,s);
      }
    }

