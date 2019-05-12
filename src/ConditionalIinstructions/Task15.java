package ConditionalIinstructions;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int age2 = scanner.nextInt();
        if (age <=18 && age >=13 && age2 <=18 && age2 >=13)
            System.out.println("obie osoby to nastolatki");
        else System.out.println("nie");
    }
}
