package conditionalIinstructions;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >=18) System.out.println("osoba pełnoletnia");
        else System.out.println("osoba niepełnoletnia");
    }
}
