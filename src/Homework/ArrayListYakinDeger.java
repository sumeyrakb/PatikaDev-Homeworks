package Homework;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayListYakinDeger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] MyArrayList = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println(Arrays.toString(MyArrayList));

        for (int k : MyArrayList){
            System.out.print(k);
            System.out.print(" , ");
        }
        Arrays.sort(MyArrayList);

        System.out.println();
        System.out.print("Lutfen Deger Giriniz :  ");
        int near_number = scan.nextInt();

        int minvalue = MyArrayList[0];
        int maxvalue = MyArrayList[0];

        for (int i : MyArrayList){
            if (i < near_number){
                minvalue = i;
            }
            if (i > near_number){
                maxvalue = i;
                break;
            }
        }
        System.out.println("Yakin Min Deger :  " + minvalue);
        System.out.println("Yakin Max Deger :  " + maxvalue);
    }
}
