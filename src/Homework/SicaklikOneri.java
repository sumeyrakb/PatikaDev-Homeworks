package Homework;
/*
Java101 > Pratik - Hava Sıcaklığına Göre Etkinlik Önerme
Patika.dev - Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde
oluşturulabilirdi farklı çözüm yolları bulunuz.
 */

import java.util.Scanner;

public class SicaklikOneri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int heat;

        System.out.println("Hava Sicakligi Hangi Aralikta ?" +
                "\n1-) 5 Dereceden Dusuk" +
                "\n2-) 5 Derece ile 15 Derece Arasinda" +
                "\n3-) 15 Derece ile 25 Derece Arasinda" +
                "\n4-) 25 Dereceden Yuksek ");

        System.out.print("Lutfen hava sicakligininiz hangi degerler arasindaysa o secenegi seciniz : ");
        heat = scan.nextInt();

        switch (heat){
            case 1:
                System.out.print("Hava sıcaklıgı 5 Dereceden düsük ; Kayak yapabilirsiniz.");
                break;

            case 2:
                System.out.print("Hava sicakligi 5 Derece ile 15 Derece Arasinda ; Sinemaya Gidebilirsiniz.");
                break;

            case 3:
                System.out.print("Hava sicakligi 15 Derece ile 25 Derece Arasinda ; Piknik Yapabilirsiniz.");
                break;

            case 4:
                System.out.print("Hava sicakligi 25 Dereceden Yüksek ; Yüzmeye gidebilirsiniz.");
                break;

            default:
                System.out.print("Lutfen Gecerli Aralikta Bir Sayi Giriniz...");
        }

    }
}

