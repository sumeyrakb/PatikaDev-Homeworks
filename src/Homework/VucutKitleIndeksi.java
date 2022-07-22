package Homework;

/*
Patika.dev Ödev
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp
ekrana yazdırın.
Formül
Kilo (kg) / Boy(m) * Boy(m)

 */

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float boy, kilo, sonuc;

        System.out.print("Lutfen boyunuzu metre cinsinde giriniz : ");
        boy = scan.nextFloat();

        System.out.print("Lutfen kilonuzu kg giriniz : ");
        kilo = scan.nextFloat();

        float bmi = kilo/(boy*boy);

        System.out.println("Boy :" +boy+ "\nKilo : " +kilo);
        System.out.println("Vucut kitle endeksiniz (BMI) : " +bmi);

    }
}

