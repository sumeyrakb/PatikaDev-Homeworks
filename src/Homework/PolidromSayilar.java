package Homework;

import java.util.Scanner;

public class PolidromSayilar {

    static boolean isTest(int number) {
        int t = number, ters = 0, son;
        while (t != 0) {
            son = t % 10;
            ters = (ters * 10) + son;
            t /= 10;
        }
        if (number == ters) {
            System.out.println("Girdiginiz Sayi Palidrom Bir Sayidir");
            return true;
        } else {
            System.out.println("Girdiginiz Sayi Palidrom Bir Sayi Degildir");
            return false;
        }
    }

    public static void main(String[] args) {
        int number;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen Bir Sayi Giriniz : ");
        number = inp.nextInt();
        System.out.println(isTest(number));

    }
}
