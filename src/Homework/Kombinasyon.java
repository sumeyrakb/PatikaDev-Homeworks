package Homework;
/*
Patika.dev / Java101 / Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li
kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.
Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
 */

import java.util.Scanner;

public class Kombinasyon {

    public static void main(String[] args) {

        int a, b, kombinasyon, faka=1, fakb=1, fakc=1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Bir Sayi Giriniz : ");
        a= scan.nextInt();
        System.out.print("Kacli Kombinasyon Yapmak Istiyorsunuz : ");
        b = scan.nextInt();

        int c = a-b;

        for(int i=1;i<=a;i++){
            faka = faka*i;
        }
        for(int i=1;i<=b;i++){
            fakb =fakb*i;
        }
        for(int i=1;i<=c;i++){
            fakc =fakc*i;
        }

        kombinasyon = faka/(fakb * fakc);
        System.out.println(kombinasyon);
    }
}
