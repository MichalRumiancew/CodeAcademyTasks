package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4Dictionary {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("mama", "mother");
        dictionary.put("pies", "dog");
        dictionary.put("kot", "cat");
        dictionary.put("dom", "house");

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj słowo po polsku: ");
        String polishWord = scanner.nextLine();
        if (dictionary.containsKey(polishWord)) {
            System.out.println("słowo po angielsku to: " + dictionary.get(polishWord));
        } else System.out.println("Słowa nie ma w słowniku. ");
    }
}
