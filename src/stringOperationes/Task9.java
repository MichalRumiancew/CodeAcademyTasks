package stringOperationes;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo");
        String word = scanner.next();
        System.out.println(word.contains("kot"));

    }
}
