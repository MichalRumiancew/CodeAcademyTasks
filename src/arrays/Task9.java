package arrays;

import java.util.Scanner;

public class Task9 {

    static int[] swap(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[array.length - 1 - i];

        }
        return newArray;
    }

    static int[] readArrayFrominput() {
        System.out.println("Podaj ile elementów ma zawierać tablica");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = readArrayFrominput();
        int[] swapArray = swap(array);
        System.out.println("Tablica po odwróceniu to: ");

        for (int value : swapArray) {
            System.out.println(value + " ");
        }
        System.out.println();
    }
}
