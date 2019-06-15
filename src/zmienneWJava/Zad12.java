package zmienneWJava;

import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj arrays");
        int a = scanner.nextInt();
        System.out.println("podaj b");
        int b = scanner.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("arrays na b " + a + " b na arrays " + b);

    }
}
