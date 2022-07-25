package Homework;
/*
Patika.dev / Java101 / Ödev
Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
 */

import java.util.Scanner;

public class YildizlarlaElmasYapimi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n ;
        System.out.print("Lutfen Satir Sayisi Giriniz : ");
        n = scan.nextInt();

        n = n / 2 + 1;
        for(int i = 0; i < n - 1; i++) {

            for(int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int i = 0; i < n; i++) {

            for(int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * n - 1 - 2 * i); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
