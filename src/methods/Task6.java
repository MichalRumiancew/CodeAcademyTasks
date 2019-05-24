package methods;

import java.util.Scanner;

public class Task6 {
    //czy pażysta
    static boolean ieEven(int a) {

        if (a % 2 == 0)
            return true;
        else return false;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę do sprawdzenia czy jes pażysta: ");
        int a = scanner.nextInt();
        if (ieEven(a))
            System.out.println("Liczba pażysta");
        else System.out.println("Liczba niepażysta");
    }


}
