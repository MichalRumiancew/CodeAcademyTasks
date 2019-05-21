package ConditionalIinstructions;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char lastLetter = word.charAt(word.length()-1);
        if (lastLetter == 'M' || lastLetter == 'm' ){
            System.out.println("tak");
        }else System.out.println("no");

    }
}
