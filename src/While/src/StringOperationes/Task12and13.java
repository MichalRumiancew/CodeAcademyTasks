package StringOperationes;

import java.util.Scanner;

public class Task12and13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj słowo: ");
        String word = scanner.next();
        System.out.println(word.replace("*",""));
        System.out.println(word.endsWith("ał"));
    }
}
