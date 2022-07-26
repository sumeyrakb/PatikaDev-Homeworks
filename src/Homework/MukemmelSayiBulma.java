package Homework;

import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {

        int toplam = 0;
        Scanner oku = new Scanner(System.in);
        while(1==1)
        {

            System.out.print("Bir Sayi Griniz giriniz : ");
            int sayi = oku.nextInt();
            for(int i=1;i<sayi;i++) {
                if (sayi % i == 0)
                    toplam += i;
            }
            if(toplam == sayi)
                System.out.println("Girdiginiz sayi bir mukemmel sayidir :)");
            else
                System.out.println("Girdiginiz sayi mukemmel sayi degildir !!");
            toplam = 0;
        }
    }
}
