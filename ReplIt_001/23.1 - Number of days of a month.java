package com.madejski;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = 0, mth;
        boolean leap = false;

        //(year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))
        System.out.println("Write the number of the month: ");
        mth = scan.nextInt();

        if (mth == 2){
            System.out.println("Write the number of the year: ");
            year = scan.nextInt();
        }
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) leap = true;
        else leap = false;

            switch (mth) {
                case 1:
                    System.out.println("January has 31 days");
                    break;
                case 2:
                    if (leap == true) {System.out.println("February has 29 days (on this special -leap- year)");}
                    else {System.out.println("February has 28 days");}
                    break;
                case 3:
                    System.out.println("March has 31 days");
                    break;
                case 4:
                    System.out.println("April has 30 days");
                    break;
                case 5:
                    System.out.println("May has 31 days");
                    break;
                case 6:
                    System.out.println("June has 30 days");
                    break;
                case 7:
                    System.out.println("July has 31 days");
                    break;
                case 8:
                    System.out.println("August has 31 days");
                    break;
                case 9:
                    System.out.println("September has 30 days");
                    break;
                case 10:
                    System.out.println("October has 31 days");
                    break;
                case 11:
                    System.out.println("November has 30 days");
                    break;
                case 12:
                    System.out.println("December has 31 days");
                    break;
                default:
                    System.out.println("Wrong number entered");
                    break;
                }
            }
        }