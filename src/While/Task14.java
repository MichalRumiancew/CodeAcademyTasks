package While;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        System.out.println("podaj liczbę do sprawdzenia czy jest liczba pierwszą: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numberDivisor = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                numberDivisor++;
            }
        }
        if (numberDivisor == 2) {
            System.out.println(" Liczba pierwsza");
        } else System.out.println("liczba złożona");

    }

}



