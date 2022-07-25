package Homework;

import java.util.Scanner;

public class SayilarinKatlariniBulma {
    public static void main(String[] args) {

        int s;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Bir Sayi Giriniz : ");
        s = scan.nextInt();

        for( int i=1;i<=s; i*=4){
            System.out.println(i);
        }

        System.out.println("________");

        for(int i=1;i<=s; i*=5){
            System.out.println(i);

        }
    }
}
