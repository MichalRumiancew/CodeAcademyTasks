package While;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "Polska";
        String userPassword;
        do {
            System.out.println("podaj hasło: ");
            userPassword = scanner.next();
        } while (!userPassword.equals(password));
        System.out.println("gratulacje podałeś poprawne hasło");


    }

    public static class Task9 {
        public static void main(String[] args) {

            System.out.println("Podaj liczbe do obliczenia silni: ");

            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int nSilnia = 1;

            for (int i = 1; i <= n; i++) {
                nSilnia = (nSilnia * i);
                System.out.println(i + " " +nSilnia);
            }
            System.out.println("silnia " + n + " wynosi " + nSilnia);
        }
    }
}
