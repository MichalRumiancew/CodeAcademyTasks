package ConditionalIinstructions;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a+b==c||a+c==b||b+c==a) System.out.println("jedna z liczb jest sumą dwóch pozostałych");
        else System.out.println(" żadna liczba nie jest sumą pozostałych ");
    }
}
