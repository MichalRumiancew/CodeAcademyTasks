package methods;

import java.util.Scanner;

public class Task10MaxStringLenght {

    static int maxStringLenght(String a, String b) {
        return a.length() > b.length()
                ? a.length() : b.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        System.out.println(maxStringLenght(a,b));
    }

}
