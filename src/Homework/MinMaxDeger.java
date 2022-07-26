package Homework;

import java.util.Scanner;

public class MinMaxDeger {
    public static void main(String[] args) {

        int counter, number, minValue = 1, maxValue = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Kac tane sayi gireceksiniz : ");
        counter = input.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i +". Sayiyi giriniz : " );
            number = input.nextInt();

            if (i == 1){
                minValue = number;
                maxValue = number;
            }

            if(number < minValue){
                minValue = number;
            }

            if(number > maxValue){
                maxValue = number;
            }
        }

        System.out.println("Min value : " + minValue);
        System.out.println("Max value : " + maxValue);
        input.close();
   }
}



