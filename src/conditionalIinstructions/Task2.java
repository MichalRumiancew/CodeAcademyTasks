package conditionalIinstructions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number % 3 == 0) {
            System.out.println("liczba podzielna przez 3");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3");


        }
    }
}