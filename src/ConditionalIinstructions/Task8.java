package ConditionalIinstructions;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char lastLetter = word.charAt(word.length() - 1);
        char firstLetter = word.charAt(0);
        if
            (lastLetter == firstLetter)
            System.out.println(" Pierwsza i ostatnia litera są takie same");
        else
            System.out.println(" pierwsza i ostatnia litera nie sa takie sme");
    }
}
