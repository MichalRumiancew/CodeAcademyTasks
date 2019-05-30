package methods;

public class Task11 {

    static int calculateNumberOfDividers(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum++;

        }
        return sum;

    }

    public static void main(String[] args) {
        int number = Task7.getNumberFromInput();
        System.out.println("liczba dzielników liczby " + number + " to " + calculateNumberOfDividers(number));
    }
}
