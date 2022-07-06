package Ontap.Question151;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static double sumByRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 1.0 / n + sumByRecursion(n - 1);
        }
    }

    public static double sumByRecursionByFrac(int n) {
        if (n == 1) {
            return 1.0 / 2;
        } else {
            return 1.0 / (2 * n) + sumByRecursionByFrac(n - 1);
        }
    }

    public static int enterNumber() {
        int n;
        do {
            System.out.println("Enter a number:  ");
            n = in.nextInt();
        } while (n <= 0);
        return n;
    }

    public static void main(String[] args) {
        int number = enterNumber();
        System.out.println("" + sumByRecursion(number));
        System.out.println("" + sumByRecursionByFrac(number));
    }
}
