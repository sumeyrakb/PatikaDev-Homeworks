package Homework;
/*
Patika.dev / Java101 / Ödev
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
Örnek : 1643 = 1 + 6 + 4 + 3 = 14
 */

import java.util.Scanner;

public class BasamakSayilarininToplamiBulma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen Bir Sayi Giriniz : ");

        int sayi = scan.nextInt();

        int adet = 0,toplam=0;

        while(sayi != 0)
        {
            toplam +=  (sayi%10);
            sayi /= 10;
            ++adet;
        }
        System.out.println("Basamak Sayisi  : " + adet);
        System.out.println("Basamak Toplami : " + toplam);
    }
}
