package ConditionalIinstructions;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        if (liczba % 3 ==0 || liczba % 5 == 0)
            System.out.println(" liczba podzielna przez 3 lub przez 5");
        else System.out.println("liczba nie podzielna przez 3 ani 5");
    }
}
