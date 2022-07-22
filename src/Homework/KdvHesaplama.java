package Homework;

/*
Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı
hesaplayan programı yazınız.
 */

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tutar=0, kdv=0;
        System.out.println("Tutari giriniz:");
        tutar=scan.nextDouble();
        kdv=tutar;

        if (tutar<=1000 && tutar>0)
        {
            kdv += (tutar*0.18);
            System.out.println("KDV %18");
            System.out.println("KDV'siz Tutar :" +tutar);
            System.out.println("KDV'li tutar :"+kdv);

        }
        else{
            kdv += (tutar*0.8);
            System.out.println("KDV %0.8");
            System.out.println("KDV'siz Tutar :" +tutar);
            System.out.println("KDV'li tutar :"+kdv);
        }
    }
}
