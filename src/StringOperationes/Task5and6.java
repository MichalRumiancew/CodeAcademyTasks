package StringOperationes;

import java.util.Scanner;

public class Task5and6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo: ");
        String word = scanner.next();
        int lenght = word.length();
        System.out.println(word.charAt(lenght-2));
        System.out.println(word.charAt(0));

    }
}
