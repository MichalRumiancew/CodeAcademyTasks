package While;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        System.out.println("podaj n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

        int numberOfSpaces = n - 1;
        System.out.println("choinka:");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= numberOfSpaces; k++) {
                System.out.print(" ");

            }
            numberOfSpaces--;
            for (int j = 1; j <= 2 * (i - 1) + 1; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}