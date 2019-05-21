package conditionalIinstructions;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String secretWord = "kajak";

        if (word.contains(secretWord))
            System.out.println("słowo zawiera" + secretWord);
        else System.out.println("słowo nie zawiera " + secretWord);


    }
}
