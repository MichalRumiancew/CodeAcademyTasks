package methods;

public class Task13IsPrime {
    static boolean isPrime(int n) {
        return Task11.calculateNumberOfDividers(n) == 1 ? true : false;
    }

    public static void main(String[] args) {
        int n = Task7.getNumberFromInput();
        if (isPrime(n)) {

            System.out.println(" Liczba jest liczbą pierwszą");
        } else {
            System.out.println("Liczba jest złożona");

        }
    }


}
