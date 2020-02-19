package com.madejski;
import java.util.Random;

public class Main {
    public static void main (String[] args){
        System.out.println("You rolled a " +Math.floor((Math.random()*6)+1));
    }
}

/*
package com.madejski;
import java.util.Scanner;
import java.util.Random;
import java.io.*;


public class Main {
    public class RollADie {

    }
    public static void main (String[] args)
    {
        Random r = new Random ();

        int result = r.nextInt(6);
        result++;

        System.out.println("You rolled a "+ result);
    }
}
*/

// Write a program in order to throw a dice, i.e., to print a random number from 1 to 6.

// You must use Math.random() taking into account that generates a random number between 0 and 1, 1 not included. So, you have to develop an arithmetic expression in order to take Math.random() and be sure that the final value is an int between 1 and 6 (6 included).

// Run it several times in order to be sure that the 6 numbers are really generated.