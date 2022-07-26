package Homework;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Sayi Giriniz : ");
        int n = scan.nextInt();
        double sonuc = 0.0;

        for (double i = 1; i <= n; i++) {
            sonuc += (1 / i);
        }
        System.out.print("Sonuc " + sonuc);

    }
}
