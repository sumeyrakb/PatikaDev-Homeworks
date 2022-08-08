package Homework;

import java.util.Arrays;

public class DizidekiElemanlarınFrekansları {
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] count = new int[list.length];

        System.out.println("Dizi : " + Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            count[i] = 1;
        }


        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && list[i] == list[j]) {
                    count[i]++;
                }
            }
        }

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && list[i] == list[j]) {
                    list[j] = 0;
                }
            }
        }


        System.out.println("Tekrar Sayilari");
        for (int k = 0; k < list.length; k++) {
            if (list[k] != 0) {
                System.out.println(list[k] + " sayisi " + count[k] + " kere tekrar edildi.");
            }
        }
    }
}
