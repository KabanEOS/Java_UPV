
// package com.madejski;
import java.util.Scanner;

class Main {

    static public long factorial(long n) {
        long i, fact=1;
        for(i = 1;  i<=n; i++){
            fact=fact*i;
        }
        return fact;
    }

    static public long combinatorial(long n, long m) {
        long comb = (long)( (double)(factorial(n) / (double)( factorial(m) *( factorial(n-m)))));
    return comb;
    }

    public static void main(String[] args) {
        long n, m;
        boolean MathRule = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter combinatorial numbers [n, m]: ");
        n = scan.nextLong();
        m = scan.nextLong();
        while(!MathRule) {
            if (n > m) {
                MathRule = true;
            } else {
                System.out.println("M cannot be large than N. \nEnter combinatorial numbers [n, m]: ");
                n = scan.nextLong();
                m = scan.nextLong();
            }
        }

        long comb = combinatorial(n,m);
        System.out.println("The factorials: " + n+ "!=" + factorial(n) + ", " + m +"!=" + factorial(m));
        System.out.println("The combinatorial: "+combinatorial(n, m));
        System.out.println("The factorial of combinatorial: "+ factorial(comb));
        return;
    }
}
