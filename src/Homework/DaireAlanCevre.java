package Homework;
import java.util.Scanner;

public class DaireAlanCevre {
    /*
    Ödev
    Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
    𝜋 sayısını = 3.14 alınız.
    Formül : (𝜋 * (r*r) * 𝛼) / 360
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int r ;
        int a ;
        double pi = 3.14;

        System.out.println("Lutfen dairenin yari capini giriniz  : ");
        r = scan.nextInt();

        System.out.println("Lutfen merkez acisinin olcusunu giriniz  : ");
        a = scan.nextInt();

        double alan = (pi * (r*r) * a) / 360 ;
        double cevre = 2 * pi *r ;

        System.out.println("Dairenin alani  : "+alan);

    }
}
