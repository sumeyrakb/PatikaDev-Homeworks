package Homework;
/*
Java101>Pratik - Kullanıcı Girişi
Pratik - Kullanıcı Girişi
Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip,
şifreler aynı ise ekrana "Şifre oluşturulamadı,lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String userName, passWord, sifirlandirma, newPassword ;

        System.out.print(" * Kullanci Adinizi yaziniz : ");
        userName = scan.nextLine( );
        System.out.print(" * Sifrenizi yaziniz : ");
        passWord = scan.nextLine();

        if (userName.equals("patika") && passWord.equals("java") ){
            System.out.println(" ***  Giris yaptiniz **** ");

        }
        else{
            System.out.println(" Hatali sifre girdiniz :( " +
                    "\n Yeni sifre belirlemek icin [ 1 ] " +
                    "\n Devam etmek istemiyorsaniz [ 2 ] " +
                    "\n giriniz... ");
            sifirlandirma = scan.nextLine();

            if (sifirlandirma.equals("1")) {
                System.out.print(" Yeni olusturmak istediginiz sifrenizi giriniz :  ");
                newPassword = scan.nextLine();

                if( newPassword.equals("java")|| newPassword.equals(passWord)){
                    System.out.println(" Daha once kullandiginiz bir sifre girdiniz, Tekrar deneyin ");
                } else{
                    System.out.println(" sifrenizi basariyla yenilendi "); }
            }
            else if( sifirlandirma.equals("2")){
                System.out.println(" Giris sonlandirildi ");
            }else {
                System.out.println("Giris bilgilerinizi kontrol edrek tekrar deneyiniz...");
            }


        }
    }
}
