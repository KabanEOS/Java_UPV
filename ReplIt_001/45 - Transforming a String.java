// package com.madejski;
import java.util.Scanner;
import java.io.*;

class Main {

    public static String changingString(String s) {

        String t = "";
        for (int x = 0; x < s.length(); x++)
        {
            char c = s.charAt(x);
            boolean check = Character.isUpperCase(c);
            if (check == true)
                t = t + Character.toLowerCase(c);
            else
                t = t + Character.toUpperCase(c);
        }
        return t;
    }

    public static void main(String[] args) {
        System.out.println(changingString("MaDrIs IS ugly, CrAcOw IS beautiful"));
    }
}