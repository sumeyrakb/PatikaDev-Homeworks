package Homework;
/*
Patika.dev / Ödev
Java101 > Pratik - Sınıfı Geçme Durumu
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55
Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */
import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mat = 0, fızık = 0, turkce = 0, kımya = 0, muzik = 0 ;

        System.out.print("Matematik notunuz : ");
        mat = scan.nextInt();

        System.out.print("Fizik notunuz : ");
        fızık = scan.nextInt();

        System.out.print("Turkce notunuz : ");
        turkce = scan.nextInt();

        System.out.print("Kimya notunuz : ");
        kımya = scan.nextInt();

        System.out.print("Muzik notunuz : ");
        muzik = scan.nextInt();

        if (mat < 0 || mat > 100) {
            mat = 0;
        }
        if (fızık < 0 || fızık > 100) {
            fızık = 0;
        }
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
        }
        if (kımya < 0 || kımya > 100) {
            kımya = 0;
        }
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
        }

        double avarage = ((mat + fızık + turkce + kımya + muzik) / 5);

        if (avarage <= 55){
            System.out.println("Ortalamaniz :"+avarage);
            System.out.println("Sinifta kaldiniz, seneye tekrar gorusmek uzere..");
        }else {
            System.out.println("Tebrikler, sınıfı geçtiniz ! \nOrtalamaniz :"+avarage);
        }
    }
}
