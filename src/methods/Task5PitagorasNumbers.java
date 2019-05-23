package methods;

import java.util.Scanner;

public class Task5PitagorasNumbers {
    //a*a+b*b=c*c
    static boolean pitagoras(int a, int b, int c) {
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj 3 liczby do sprawdzenia czy są pitagoorejskie: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (pitagoras(a,b,c))
            System.out.println("podane liczby są pitagorejskie");
        else System.out.println("podane liczby nie są pitagorejskie");

    }


}

