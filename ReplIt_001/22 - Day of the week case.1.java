package com.madejski;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int d;

        System.out.println("introduïu el número: ");
            Scanner scan=new Scanner(System.in);
            d = scan.nextInt();

            switch (d){

                case 1:
                    System.out.println("ES: lunes\r\nEN: monday\r\nPL: poniedziałek\r\nDE: montag\r\nRU: poniedielnik ");
                    break;

                case 2:
                    System.out.println("ES: martes\r\nEN: tuesday\r\nPL: wtorek\r\nDE: dienstag\r\nRU: wtornik ");
                    break;

                case 3:
                    System.out.println("ES: miércoles\r\nEN: wednesday\r\nPL: środa\r\nDE: mittwoch\r\nRU: srieda ");
                    break;

                case 4:
                    System.out.println("ES: jueves\r\nEN: thursday\r\nPL: czwartek\r\nDE: donnerstag\r\nRU: czetwierg ");
                    break;

                case 5:
                    System.out.println("ES: viernes\r\nEN: friday\r\nPL: piątek\r\nDE: freitag\r\nRU: piatnica ");
                    break;

                case 6:
                    System.out.println("ES: sábado\r\nEN: saturday\r\nPL: sobota\r\nDE: samstag\r\nRU: subbota ");
                    break;

                case 7:
                    System.out.println("ES: domingo\r\nEN: sunday\r\nPL: niedziela\r\nDE: sonntag\r\nRU: woskriesienje ");
                    break;
                default:
                    System.out.println("heu introduït el número equivocat\n" +
                            "per consol, dies de la setmana en català:\n" +
                            "diumenge\ndilluns\ndimarts\ndimecres\ndijous\ndivendres\ndissabte");
                    break;

            }

        }
}

