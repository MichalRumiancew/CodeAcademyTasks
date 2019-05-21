package ConditionalIinstructions;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        // dodanie zmiennej pomocniczej
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if
        (c < min) {
            min = c;
        }
        System.out.println(" najmniejsza liczba to: "+ min);


        //  zapis warunkiem skruconym:

        int min2;

        min2= a<b ? a:b;
        min2 = c < min2 ? c : min2;
        System.out.println(" minimalna liczba to " + min2);
    }
}

