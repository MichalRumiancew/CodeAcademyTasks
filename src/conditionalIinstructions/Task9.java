package conditionalIinstructions;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("podaj pierwsze słowo: ");
        String word = scanner.next().toLowerCase();
        //toLowerCase żeby zmienił wszystko na małe litery wtedy Mam = mam
        System.out.println("podaj drugi słowo: ");
        String word2 = scanner.next().toLowerCase();

        if (word.equals(word2))
            System.out.println("oba słowa są takie same");
        else System.out.println("oba słowa są różne");
    }
}
