package While;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        System.out.println("Podaj słowo do wypisania w odwrotnej kolejności: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder reverseWord = new StringBuilder(word);
        System.out.println(reverseWord.reverse());

    }
}
