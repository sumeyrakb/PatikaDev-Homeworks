package Homework;
/*
Patika.dev - Java101 > Ödev - Uçak Bileti Fiyatı Hesaplama

 */

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        int mesafe,yas,tür;
        double yasi1 = 0.50,yasi2 =0.10,yasi3=0.30,gdindirim = 0.20,normalt,yasindirim1;
        double toplam,yasindirim2,yasindirim3,gdtoplm;

        Scanner scan = new Scanner(System.in);

        System.out.print("Mesafeyi KM Turunden Giriniz : ");
        mesafe = scan.nextInt();

        System.out.print("Lutfen Yasinizi Giriniz : ");
        yas = scan.nextInt();

        System.out.print("Lutfen Yolculuk Turunu Seciniz:" +
                "\n1-) Tek Yon" +
                "\n2-) Gidis-Donus");
        tür = scan.nextInt();

        switch (tür){
            case(1):
                if(mesafe < 0 || yas < 0){
                    System.out.print("Hatalı Veri Girdiniz !");
                }
                if(yas < 12){
                    normalt = mesafe*0.10;
                    System.out.println("Normal Tutar"+normalt+" TL");

                    yasindirim1 =normalt*yasi1;
                    System.out.println("Çocuk Yaş İndirimi "+yasindirim1+" TL");

                    toplam = normalt-yasindirim1;
                    System.out.print("Topla Ödemeniz Gereken : "+toplam+" TL");
                    break;

                }else if(yas>=12 && yas<24){
                    normalt = mesafe*0.10;
                    System.out.println("Normal Tutar"+normalt+" TL");

                    yasindirim2 =normalt*yasi2;
                    System.out.println("Genc Yas Indirimi : "+yasindirim2+" TL");

                    toplam = normalt-yasindirim2;
                    System.out.print("ToplaM Odemeniz Gereken : "+toplam+" TL");
                    break;



                }
                if(yas > 65){
                    normalt = mesafe*0.10;
                    System.out.println("Normal Tutar"+normalt+" TL");

                    yasindirim3 =normalt*yasi3;
                    System.out.println("Yaşlı Yaş İndirimi : "+yasindirim3+" TL");

                    toplam = normalt-yasindirim3;
                    System.out.print("Topla Ödemeniz Gereken: "+toplam+" TL");

                    break;
                }
            case 2:
                if(mesafe < 0 || yas<0){
                    System.out.print("Hatalı Veri Girdiniz !");
                }
                if(yas < 12){
                    normalt = mesafe*0.10;
                    System.out.println("Normal Tutar"+normalt+" TL");

                    yasindirim1 =normalt*yasi1;
                    System.out.println("Çocuk Yaş İndirimi "+yasindirim1+" TL");

                    toplam = normalt-yasindirim1;
                    System.out.println("Toplam Tek Yön Tutar: "+toplam+" TL");

                    gdtoplm= (toplam-(toplam*gdindirim))*2;
                    System.out.println("Gidiş Dönüş Toplam Tutar: "+gdtoplm+" TL");
                    break;

                }else if(yas >= 12 && yas<24){
                    normalt = mesafe*0.10;
                    System.out.println("Normal Tutar"+normalt+" TL");

                    yasindirim2 =normalt*yasi2;
                    System.out.println("Genç Yaş İndirimi "+yasindirim2+" TL");

                    toplam = normalt-yasindirim2;
                    System.out.println("Toplam Tek Yön Tutar: "+toplam+" TL");

                    gdtoplm= (toplam-(toplam*gdindirim))*2;
                    System.out.println("Gidiş Dönüş Toplam Tutar: "+gdtoplm+" TL");
                    break;
                }
                if(yas > 65){
                    normalt = mesafe*0.10;
                    System.out.println("Normal Tutar"+normalt+" TL");

                    yasindirim3 =normalt*yasi3;
                    System.out.println("Yaşlı Yaş İndirimi "+yasindirim3+" TL");

                    toplam = normalt-yasindirim3;
                    System.out.print("Toplam Tek Yön Tutar: "+toplam+" TL");

                    gdtoplm= (toplam-(toplam*gdindirim))*2;
                    System.out.println("Gidiş Dönüş Toplam Tutar: "+gdtoplm+" TL");

                    break;
                }
        }
    }
}

