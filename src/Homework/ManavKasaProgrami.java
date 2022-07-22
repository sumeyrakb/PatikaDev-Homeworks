package Homework;
/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */
import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double armutKgFiyat = 2.14;
        final double elmaKgFiyat = 3.67;
        final double domatesKgFiyat = 1.11;
        final double muzKgFiyat = 0.95;
        final double patlicanKgFiyat = 5.0;

        double Armut = 0;
        double Elma = 0;
        double Domates = 0;
        double Muz = 0;
        double Patlican = 0;
        double toplamTutar = 0;

        System.out.print("Lutfen Armut kg giriniz : ");
        Armut = scan.nextDouble();
        System.out.print("Lutfen Elma kg giriniz : ");
        Elma = scan.nextDouble();
        System.out.print("Lutfen Domates kg giriniz : ");
        Domates = scan.nextDouble();
        System.out.print("Lutfen Muz kg giriniz : ");
        Muz = scan.nextDouble();
        System.out.print("Lutfen Patlican kg giriniz : ");
        Patlican = scan.nextDouble();

        double armutFiyat = Armut * armutKgFiyat;
        double elmaFiyat = Elma * elmaKgFiyat;
        double domatesFiyat = Domates * domatesKgFiyat;
        double muzFiyat = Muz * muzKgFiyat;
        double patlicanFiyat = Patlican * patlicanKgFiyat;

        toplamTutar = armutFiyat + elmaFiyat + domatesFiyat + muzFiyat + patlicanFiyat ;
        System.out.println("\nArmut Kg Fiyati : "+armutKgFiyat+
                "\nElma Kg Fiyati: " +elmaKgFiyat+
                "\nDomates Kg Fiyati: " +domatesKgFiyat+
                "\nMuz Kg Fiyati: " +muzKgFiyat+
                "\nPatlican Kg Fiyati : " +patlicanKgFiyat);
        System.out.println("\nToplam Odenecek Tutar :" +toplamTutar);
    }
}

