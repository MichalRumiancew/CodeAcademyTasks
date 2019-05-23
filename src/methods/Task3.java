package methods;

import java.util.Scanner;

public class Task3 {
    static int mulitiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("iloczyn to: " + mulitiply(a, b));
    }
}
