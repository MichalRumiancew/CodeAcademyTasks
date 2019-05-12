package ConditionalIinstructions;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        if (word.endsWith("a")&& !word.equals("Kuba"))
            System.out.println("imie żeńskie");
        else
            System.out.println("imie męskie");

    }
}
