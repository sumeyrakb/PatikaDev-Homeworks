package Homework;
/*
Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */

import java.util.Scanner;

public class GirilenSayılarınOrtalamalari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0, bolen = 0;

        System.out.print("Lutfen Bir Sayi Giriniz: ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                bolen++;
                toplam = toplam + i;
            }
        }

        if (bolen != 0) {
            System.out.println("Toplam: " + toplam);
            System.out.println("Ortalama: " + (toplam / (double) bolen));
        } else {
            System.out.println("Girdiginiz Sayının 3 ve 4'e bölümü yoktur.");
        }
    }
}