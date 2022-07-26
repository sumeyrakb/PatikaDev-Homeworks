package Homework;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {

        String username, password;
        Scanner scan = new Scanner(System.in);
        int right = 3, select, price ;
        int balance = 1500;

        while (right > 0){
            System.out.print("Kullanici Adiniz : ");
            username = scan.nextLine();
            System.out.print("Parolanizi Giriniz : ");
            password = scan.nextLine();
            if (username.equals("patika") && password.equals("dev123")){
               do {
                   System.out.println("\nMerhaba X Bankasina Hos Geldiniz..\n ");

                   System.out.println(" 1 - Para Yatirma\n " +
                           "2 - Para Cekme\n " +
                           "3 - Bakiye Sorgula\n " +
                           "4 - Cikis Yap");

                   System.out.print("Lutfen Yapmak Istediginiz Islemi Seciniz : \n ");
                   select = scan.nextInt();

                   switch (select){
                       case (1):
                           System.out.print("Yatirmak Istediginiz Para Miktari : ");
                           price = scan.nextInt();
                           balance += price;
                           System.out.println("Yatirma Isleminden Sonraki Bakiyeniz : "+balance);
                           break;
                       case (2):
                           System.out.print("Cekmek Istediginiz Para Miktari : ");
                           price = scan.nextInt();
                           if (price > balance) {
                               System.out.println("Bakiyeniz Yetersiz. İslem Gerceklesmedi !");
                           } else {
                               balance -= price;
                               System.out.println("Kalan Bakiyeniz : "+balance);
                           }
                           break;
                       case (3):
                           System.out.println("Mevcut Bakiyeniz : " + balance);
                   }
                   break;
               }while (select != 4);
                System.out.println("\nTekrar Gorusmek Uzere..");
                break;

            }else {
                right--;
                System.out.println("Hatali Kullanici Adi veya Sifre ! Tekrar Deneyin.");
                if (right == 0){
                    System.out.println("Hesabiniz Bloke Oldu, Lutfen Banka Ile Iletisime Gecin ! ");
                }else {
                    System.out.println("Kalan Hakkiniz : "+ right);
                }
            }
        }
    }
}
