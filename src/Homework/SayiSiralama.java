package Homework;
/*
Java101 > Pratik - Sayıları Büyükten Küçüğe Sıralama
Patika.dev - Ödev
Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
 */

import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;


        System.out.print("1. sayiyi giriniz: ");
        a = scan.nextInt();

        System.out.print("2. sayiyi giriniz: ");
        b = scan.nextInt();

        System.out.print("3. sayiyi giriniz: ");
        c = scan.nextInt();

        if ((a == b) || (b == c) || (a == c)) {
            System.out.println("Sayilar Birbirine Esit Olmamalidir");
        } else  {
            if ((a < b) && (a < c)) {
                if (b < c) {
                    System.out.println(a + "<" + b + "<" + c);

                } else
                    System.out.println(a + "<" + c + "<" + b);
            } else if ((b < a) && (b < c)) {
                if (a < c) {
                    System.out.println(b + "<" + a + "<" + c);

                } else
                    System.out.println(b + "<" + c + "<" + a);

            } else {
                if (b < a) {
                    System.out.println(c + "<" + b + "<" + a);

                } else
                    System.out.println(c + "<" + a + "<" + b);
            }
        }
    }
}
