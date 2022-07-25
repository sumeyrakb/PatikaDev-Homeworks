package Homework;

import java.util.Scanner;
/*
Patika.dev / Java101 / Ödev
Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü"
 kullanarak yazınız.
 */

public class EbobEkok {
    public static void main(String[] args) {

        int sayi1, sayi2, kucukSayi;
        int ebob = 1, ekok = 1;

        Scanner girdi1 = new Scanner(System.in);
        System.out.print("Lutfen Birinci Sayiyi Giriniz : ");
        sayi1 = girdi1.nextInt();

        Scanner girdi2 = new Scanner(System.in);
        System.out.print("Lutfen Ikinci Sayiyi Giriniz : ");
        sayi2 = girdi2.nextInt();

        if (sayi1 > sayi2) {
            kucukSayi = sayi2;
        } else {
            kucukSayi = sayi1;
        }
        int x = kucukSayi;
        while (x >= 1) {
            if ((sayi1 % x == 0) && (sayi2 % x == 0)) {
                ebob = x;
                System.out.println("Ebob : " + x);
                break;
            }
            x--;
        }
        System.out.print("Ekok : " + (sayi1 * sayi2) / ebob);
    }
}
