package Homework;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen Fibonacci Serisinin Eleman Sayisini Giriniz : ");
        int elemanSayi = scan.nextInt();
        int sayac = 2, a = 0, b = 1 ;

        System.out.print(a + " ");
        System.out.print(b + " ");

        while (elemanSayi != sayac) {
            int c = a + b;
            System.out.print(c + " ");
            sayac++;
            a = b;
            b = c;
        }
    }
}
