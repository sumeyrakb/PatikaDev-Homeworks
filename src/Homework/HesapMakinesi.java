package Homework;
/*
Java101 > Pratik - Hesap Makinesi
Patika.dev - Ödev
Videodaki hesap makinesini switch-case kullanarak yapınız.
 */

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1, n2, select;

        System.out.print("Lutfen birinci sayiyi giriniz : ");
        n1 = scan.nextInt();
        System.out.print("Lutfen Ikinci sayiyi giriniz : ");
        n2 = scan.nextInt();

        System.out.println(" 1 - Toplama\n 2 - Cikarma\n 3 - Carpma\n 4  -Bolme");
        System.out.print("\nLutfen yapmak istediginiz islem numarasini seciniz : ");
        select = scan.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sonuc : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuc : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuc : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Sonuc : " + (n1 / n2));
                } else {
                    System.out.println("Sayi 0'a Bolunemez");
                }
                break;
            default:
                System.out.println("Hatali Secim Yaptiniz, Lutfen Tekrar Deneyin");

        }
    }
}