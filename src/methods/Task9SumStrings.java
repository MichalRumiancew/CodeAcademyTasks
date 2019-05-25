package methods;

import java.util.Scanner;

public class Task9SumStrings {
    static String sum(String a, String b){
        return a+b;

    }

       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(a+b);
    }

}
