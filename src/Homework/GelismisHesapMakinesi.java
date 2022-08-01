package Homework;

import java.util.Scanner;

public class GelismisHesapMakinesi {

    static int toplama (int a, int b) {
        int result = a+b ;
                System.out.println("Toplam : " + result);
        return result ;

    }
    static int cıkarma (int a, int b) {
        int result = a-b ;
        System.out.println("Çıkarma : " + result);
        return result ;

    }

    static int carpma (int a, int b) {
        int result = a*b ;
        System.out.println("Çarpma : " + result);
        return result ;

    }

    static int bolme (int a, int b) {

        int result = a/b ;

        System.out.println("Bolme : " + result);
        return result ;

    }
    static int mod (int a, int b) {
        return a % b ;
    }

    static int usalma (int a, int b) {
        int result = 1;
        for (int i =1; i <=b ; i++) {
            result*=a ;
        }

        return result ;
    }

    static void alanCevre( int a, int b ) {
        System.out.println("Dairenin Cevresi " + (2 * (a + b )) );
        System.out.println("Dairenin Alani " + (a * b) );
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "\n1- Toplama Islemi\n"
                + "2- Cikarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme Islemi\n"
                + "5- Mod Alma\n"
                + "6- Uslu Sayi Hesaplama\n"
                + "7- Dikdortgen Alan ve Cevre Hesabi\n"
                + "0- Cikis Yap";


        while (true ) {
            System.out.println( menu);
            System.out.print(" \nBir Islem Seciniz : ");
            select = scan.nextInt();

            if (select == 0 || select > 7) {
                break;
            }
            System.out.println(" Birinci sayiyi  giriniz : ");
            int a = scan.nextInt();
            System.out.println(" Ikinci sayiyi  giriniz : ");
            int b = scan.nextInt();


            switch (select ) {
                case 1 :
                    toplama (a,b);
                    break ;

                case 2 :
                    cıkarma (a,b);
                    break ;

                case 3 :
                    carpma (a,b);
                    break ;

                case 4 :
                    if (bolme (a,b) == 0)
                        System.out.println("ikinci sayi 0 olamaz ");
                    bolme (a,b);
                    break ;

                case 5 :
                    System.out.println("Mod alma hesabi : "  + mod (a,b) );

                case 6 :

                    System.out.println(" Us hesabi : "  + usalma (a,b) );

                case 7 :
                    alanCevre (a,b);

            }
        }

        System.out.println("Gorusmek Uzere... ");

    }

}
