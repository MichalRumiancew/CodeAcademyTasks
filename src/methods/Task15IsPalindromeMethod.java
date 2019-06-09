package methods;

import java.util.Scanner;

public class Task15IsPalindromeMethod {
    static boolean isPalindrome(String word) {
        String wordWithoutSpaces = word.replace(" ", "");
        StringBuilder stringBuilder = new StringBuilder(wordWithoutSpaces);
        return stringBuilder.reverse().toString().equals(wordWithoutSpaces) ? true : false;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj śłowo");
        String word = scanner.next();
        if (isPalindrome(word)) {
            System.out.println("Słowo jest palindromem");
        } else System.out.println(" Słowo nie jest palindromem");
    }

}
