package Homework;
/*
Java101 > Pratik - Burç Bulan Program
Patika.dev - Ödev
Aynı örneği switch-case kullanmadan yapınız.

 */
import java.util.Scanner;

public class BurcHesaplama {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("*** BURC HESAPLAMA ***") ;
        System.out.println();

        int gun, ay ;
        Scanner scan =new Scanner(System.in);

        System.out.println("Dogdugunuz gunu giriniz...");
        gun = scan.nextInt();

        System.out.println("Dogdugunuz ayg giriniz...");
        ay = scan.nextInt();

        if ((ay==3 && gun<=21)||(ay==4 && gun>=20)) {
            System.out.println("Burcunuz  : Koc"); }

        else if((ay==4 && gun>=21)||(ay==5 && gun<=21)) {
            System.out.println("Burcunuz  : Boga"); }

        else if((ay==5 && gun>=22)||(ay==6 && gun<=22)) {
            System.out.println("Burcunuz  : İkizler"); }

        else if((ay==6 && gun>=23)||(ay==7 && gun<=22)) {
            System.out.println("Burcunuz  : Yengec"); }

        else if((ay==7 && gun>=23)||(ay==8 && gun<=22)) {
            System.out.println("Burcunuz  : Aslan"); }

        else if((ay==8 && gun>=23)||(ay==9 && gun<=22)) {
            System.out.println("Burcunuz  : Basak"); }

        else if((ay==9 && gun>=23)||(ay==10 && gun<=22)) {
            System.out.println("Burcunuz  : Terazi"); }

        else if((ay==10 && gun>=23)||(ay==11 && gun<=22)) {
            System.out.println("Burcunuz  : Akrep"); }

        else if((ay==11 && gun>=22)||(ay==12 && gun<=20)) {
            System.out.println("Burcunuz  : Yay"); }

        else if((ay==12 && gun>=22)||(ay==1 && gun<=21)) {
            System.out.println("Burcunuz  : Oglak"); }

        else if((ay==1 && gun>=22)||(ay==2 && gun<=19)) {
            System.out.println("Burcunuz  : Kova"); }

        else if((ay==2 && gun>=20)||(ay==3 && gun<=20)) {
            System.out.println("Burcunuz  : Balik"); }

        if ((ay>12 && gun>32)||(ay>12 && gun>32)) {
            System.out.println("Böyle bir değer yok !!!"); }

    }
}