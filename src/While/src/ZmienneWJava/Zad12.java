package ZmienneWJava;

import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj a");
        int a = scanner.nextInt();
        System.out.println("podaj b");
        int b = scanner.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("a na b " + a + " b na a " + b);

    }
}
