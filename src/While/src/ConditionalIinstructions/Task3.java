package ConditionalIinstructions;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Podaj Hasło: ");
        String password = "Akademia";
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();


        if (word.equals(password)) {
            System.out.println("Hasło poprawne");
        } else System.out.println("Hasło niepoprawne");
    }
}
