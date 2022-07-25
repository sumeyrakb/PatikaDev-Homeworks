package Homework;
/*
Patika.dev / Java101 / Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan
programı "For Döngüsü" kullanarak yapınız.
 */

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {

        int a, b, total = 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Ussu Alinacak Sayiyi Giriniz : ");
        a = scan.nextInt();

        System.out.print("Us Olacak Sayiyi Giriniz : ");
        b = scan.nextInt();

        for (int i = 1; i <= b; i++) {
            total *= a;

        }
        System.out.println("Sonuc : " + total);

    }
}
