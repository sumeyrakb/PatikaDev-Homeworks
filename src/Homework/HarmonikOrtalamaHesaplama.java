package Homework;

public class HarmonikOrtalamaHesaplama {

        public static void main(String[] args) {
            double[] arr = {1, 2, 3, 4, 5};
            double har = 0;
            for (double v : arr) {
                har += (1 / v);
            }
            System.out.println(arr.length / har);
        }
}
