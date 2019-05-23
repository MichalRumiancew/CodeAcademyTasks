package methods;

import java.util.Scanner;

public class Task2 {
    static int substract (int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("różnica to: "+ substract(a,b));
    }
}
