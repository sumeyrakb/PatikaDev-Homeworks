package Homework;
import java.util.Scanner;
/*
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
 */

public class Taksimetre {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double km, toplam=10;
        double perKm = 2.20;

        System.out.print("Lutfen mesafeyi KM cinsinden giriniz : ");
        km = scan.nextDouble();

        toplam += (km * perKm);
        System.out.println("Toplam odenecek tutar : "+ toplam+ " tl");

    }
}
