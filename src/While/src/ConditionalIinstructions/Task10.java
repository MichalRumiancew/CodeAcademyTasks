package ConditionalIinstructions;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String addressUrl = scanner.next();

        if (addressUrl.startsWith("www.")|| addressUrl.startsWith("https://")|| addressUrl.startsWith("http."))
            System.out.println("adres url jest poprawny");
        else System.out.println("adres url niepoprawny");
    }
}
