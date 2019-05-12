package ZmienneWJava;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
//        final double pi = 3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj promień koła: ");


        int radius = scanner.nextInt();

        double score = Math.PI * radius * radius;

        System.out.println("pole koła " + score);
    }
}
