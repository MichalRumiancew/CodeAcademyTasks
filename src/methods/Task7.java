package methods;

import java.util.Scanner;

public class Task7 {
    static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number /= 10;

        }

        return sum;
    }


    public static void main(String[] args) {
        int number = getNumberFromInput();
        System.out.println(" suma cyfr to: " + sumOfDigits(number));
    }

    public static int getNumberFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj Liczbę ");
        return scanner.nextInt();
    }
}
