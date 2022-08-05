package Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {

        Random num = new Random();
        int number = num.nextInt(100);
        //int number = (int)(Math.random()*100);
        Scanner scan = new Scanner(System.in);

        int selected;
        int right = 0;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        System.out.println(number);

        while (right < 5){
            System.out.println("* * * * Sayi Tahmin Oyununa Hos Geldiniz !! * * * *");
            System.out.print("\nLutfen Tahmininizi Giriniz : ");
            selected = scan.nextInt();

            if (selected <0 || selected > 99 ){
                System.out.println("Girdiginiz Sayi 0 ile 100 Arasinda Olmalidir..");
                if (isWrong) {
                    right++;
                    System.out.println("Cok fazla hatali giris yaptiniz. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatali girisinizde hakkinizdan dusulecektir.");
                }
                continue;
            }

            if (selected == number){
                System.out.println("Tebrikler Tahmininiz Dogru ! Tahmin Ettiginiz Sayi : "+number);
                isWin = true;
                break;
            }else {
                System.out.println("Tahmininiz Yanlis !!");
                if (selected > number) {
                    System.out.println("Girdiginiz Sayi : " + selected + "\nIp Ucu : Tahmininiz Gizli Sayidan Buyuktur..");
                } else {
                    System.out.println("Girdiginiz Sayi : " + selected + "\nIp Ucu : Tahmininiz Gizli Sayidan Kucuktur..");
                }

                wrong[right++] = selected;
                System.out.println("Kalan Hakkiniz : " + (5 - right));
                System.out.println("---------------------------------------------\n");
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
    }
}
