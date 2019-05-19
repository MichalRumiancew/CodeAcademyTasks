package ConditionalIinstructions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number > 5){
            System.out.println("liczka większe od pięciu");}
        else {
            System.out.println("Liczba nie jest większa od pięciu");
        }



    }
}

