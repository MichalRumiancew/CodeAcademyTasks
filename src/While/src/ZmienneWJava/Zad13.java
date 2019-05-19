package ZmienneWJava;

import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbę ");
        int a = scanner.nextInt();
        System.out.println("podaj drugą liczbę ");
        int b = scanner.nextInt();
        System.out.println("podaj trzecia liczbę ");
        int c = scanner.nextInt();

        double srednia = (a+b+c)/3.0;
        System.out.println(String.format("Value: %.2f", srednia));
    }
}
