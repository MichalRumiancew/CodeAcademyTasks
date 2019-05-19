package While;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
//        String name = "Michał";
//        StringBuilder stringBuilder = new StringBuilder("Michał");
//        stringBuilder.append("Rumiancew");
//        stringBuilder.reverse();
//        System.out.println(stringBuilder.charAt(0));
        System.out.println(" Podaj zdanie w którym system znajdzie liczby");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i)))
            System.out.println(word.charAt(i));

        }
    }
}
