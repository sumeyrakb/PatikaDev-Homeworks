package Homework;

import java.util.Scanner;

public class RecursiveAsalSayiBulanProgram {

    static void f(int n){
        int sayi = 0;
        for (int j = 1; j<=n; j++){
            if (n % j == 0){
                sayi++;
            }
        }
        if (sayi == 2){
            System.out.println(n+ " : Bu Sayisi asaldir ");
        }else {
            System.out.println(n+ " : Bu Sayi Asal Degildir ");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Sayi giriniz : ");
        int n = scan.nextInt();
        f(n);

    }

}
