package StringOperationes;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie:");
        String name = scanner.next();
        System.out.println("Podaj nazwisko: ");
        String surname = scanner.next();

        String ns = name +" "+ surname;

        System.out.println(ns);

    }
}
