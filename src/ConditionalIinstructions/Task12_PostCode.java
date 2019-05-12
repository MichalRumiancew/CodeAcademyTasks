package ConditionalIinstructions;

import java.util.Scanner;

public class Task12_PostCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();

        if (code.length() == 6 && Character.isDigit(code.charAt(0)) &&
                Character.isDigit(code.charAt(1))
                && Character.isDigit(code.charAt(3))
                && Character.isDigit(code.charAt(4))
                && Character.isDigit(code.charAt(5))
                && code.charAt(2) == '-')

            System.out.println(" kod poprawny");

        else System.out.println("kod niepoprawny");


    }
}

