package While;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        System.out.println(" Podaj zdanie w którym system znajdzie małe litery");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i)))
                counter++;

        }
        System.out.println(counter);
    }
}
