package Homework;

import java.util.Scanner;

public class Fibonacci {

    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bulmak Istediginiz Elemanin Sirasini Giriniz : ");
        int n = scan.nextInt();
        System.out.println(fib(n));
    }

}
