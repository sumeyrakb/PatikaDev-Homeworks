package Homework;
import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Mat, fizik, kimya, turkce, tarih, muzik;
        System.out.print("Matematik notunuz :");
        Mat = scan.nextInt();

        System.out.print("Fizik notunuz :");
        fizik = scan.nextInt();

        System.out.print("Kimya notunuz :");
        kimya = scan.nextInt();

        System.out.print("Turkce notunuz :");
        turkce = scan.nextInt();

        System.out.print("Tarih notunuz :");
        tarih = scan.nextInt();

        System.out.print("Muzik notunuz :");
        muzik = scan.nextInt();

        int toplam = (Mat + fizik + kimya + turkce + tarih + muzik );
        double ortalama = toplam / 6.0;

        String sonuc = (ortalama > 60) ? "Sinifi Gectiniz :) " : "Sinifta Kaldiniz :( ";
        System.out.println("Sonuc :" +ortalama+ " : "+sonuc);
    }
}

