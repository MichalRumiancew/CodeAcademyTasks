package While;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        System.out.println(" Podaj zdanie w którym system znajdzie co 2 litere");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i += 2) {
            if (Character.isLowerCase(word.charAt(i)))
                System.out.print(word.charAt(i));

        }
    }
}


