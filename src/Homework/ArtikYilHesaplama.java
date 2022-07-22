package Homework;
/*
Java101 > Ödev - Artık YIl Hesaplama
 */

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {

        int year;
        Scanner scan = new Scanner(System.in);

        System.out.print("  Lutfen Yil Giriniz :  ");
        year = scan.nextInt();

        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println( year + "  Bir artik yildir..");
        }else {
            System.out.println(year + "  Bir artik yil degildir.");
        }
    }
}
