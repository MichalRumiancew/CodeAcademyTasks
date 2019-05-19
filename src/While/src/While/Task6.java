package While;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int magicNumber = random.nextInt(600);
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("zgadnij liczbę od 0 do 600 liczbe: ");

        do {

            number = scanner.nextInt();

            if (number != magicNumber) {
                if (number < magicNumber) {
                    System.out.println("liczba jest za mała, podaj inną");
                } else System.out.println(" podana liczba jest za duża, podaj inną ");

            }
        }
        while (number != magicNumber);
        System.out.println("GRATULACJE zgadłeś prawidłowa liczba to: "+ magicNumber);
    }

}
