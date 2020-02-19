package com.madejski;
import java.util.Scanner;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Num 1: ");
        int n1 = scan.nextInt();

        System.out.println("Num 2: ");
        int n2 = scan.nextInt();

        int ans = n1 > n2 ? n1 : n2;
        System.out.println(ans);
    }
}

