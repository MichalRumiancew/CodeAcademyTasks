package methods;

import java.util.Scanner;

public class Task1 {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwie liczby do zsumowania: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("suma to: "+add(a,b) );

    }
}
