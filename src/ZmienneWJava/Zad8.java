package ZmienneWJava;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj pierwszą liczbę: ");
        double a = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double b = scanner.nextDouble();

        double score = a / b;
        System.out.println("wynik dzielenia to: " + score);
    }
}
