package Homework;
import java.util.Scanner;

public class UckenKenarUzunluklari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double dikKenar1, dikKenar2, hipotenüs ;


        System.out.print("Dik kenar 1'i giriniz :");
        dikKenar1 = scan.nextDouble();

        System.out.print("Dik kenar 2'yi giriniz :");
        dikKenar2 = scan.nextDouble();

        System.out.println("Dik Kenar 1 : " + dikKenar1);
        System.out.println("Dik kenar 2 : " + dikKenar2);

        hipotenüs = Math.sqrt (dikKenar1 * dikKenar1 + dikKenar2 * dikKenar2);
        System.out.println("Hipotenus : " + hipotenüs);

        /*
        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         */

        Scanner scan2 = new Scanner(System.in);

        double kenar1, kenar2, kenar3, cevre, yarıCevre, alan;

        System.out.println("1. kenari giriniz :");
        kenar1 = scan2.nextDouble();

        System.out.println("2. kenari giriniz :");
        kenar2 = scan2.nextDouble();

        System.out.println("3. kenari giriniz :");
        kenar3 = scan2.nextDouble();

        cevre = kenar1 + kenar2 + kenar3;
        System.out.println("Ucgenin cevre uzunlugu : "+ cevre);

        yarıCevre = cevre / 2;
        alan = Math.sqrt(yarıCevre * (yarıCevre - kenar1) * (yarıCevre - kenar2) * (yarıCevre - kenar3));
        System.out.println("Ucgenin alani :" +alan);

    }
}

