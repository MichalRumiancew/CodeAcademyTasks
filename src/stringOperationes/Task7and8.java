package stringOperationes;

import java.util.Scanner;

public class Task7and8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo ");
        String word = scanner.next();
        System.out.println("HELLO "+ word);
        int lenght = word.length();
        System.out.println("Dwie ostatnie litery wyrazu to: "+ word.charAt(lenght-1)+ " "+ word.charAt(lenght-2));

    }
}
