package Homework;
/*
Java101 > Ödev - Çin Zodyağı Hesaplama
 */

import java.util.Scanner;

public class CinZodyagıHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int yearOfBirth , zodiac ;

        System.out.print("Lutfen dogum yilinizi giriniz : ");
        yearOfBirth = scan.nextInt();
        zodiac = yearOfBirth % 12 ;

        switch (zodiac){
            case 0 :
                System.out.print("Çin Burcunuz : Maymun !");
                break;

            case 1 :
                System.out.print( "Çin Burcunuz : Horoz !");
                break;

            case 2 :
                System.out.print( "Çin Burcunuz : Kopek !");
                break;

            case 3 :
                System.out.print( "Çin Burcunuz : Domuz !");
                break;

            case 4 :
                System.out.print( "Çin Burcunuz : Fare !");
                break;

            case 5 :
                System.out.print( "Çin Burcunuz : Okuz !");
                break;

            case 6 :
                System.out.print( "Çin Burcunuz : Kaplan !");
                break;

            case 7 :
                System.out.print( "Çin Burcunuz : Tavsan !");
                break;

            case 8 :
                System.out.print( "Çin Burcunuz : Ejderha !");
                break;

            case 9 :
                System.out.print( "Çin Burcunuz : Yılan !");
                break;

            case 10 :
                System.out.print( "Çin Burcunuz : At !");
                break;

            case 11 :
                System.out.print( "Çin Burcunuz : Koyun !");
                break;
        }

    }
}
