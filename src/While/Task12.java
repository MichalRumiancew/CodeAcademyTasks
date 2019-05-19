package While;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("podaj słowo do sprawdzenie czy to palindrom: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder secondWord = new StringBuilder(word);
        secondWord.reverse();

        if (secondWord.toString().equals(word)) {
            System.out.println("to palindrom");

        }
        else System.out.println(" to nie palindrom");
    }
}
