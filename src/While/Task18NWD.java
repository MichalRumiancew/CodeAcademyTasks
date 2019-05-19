package While;

import java.util.Scanner;

public class Task18NWD {
    public static void main(String[] args) {

        System.out.println(" podaj dwie liczby do wyliczenia największego wspólnego dzielnika: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;

        }
        System.out.println(" największy wspólny dzielnik wynosi : " + a);

    }
}
