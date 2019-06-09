package methods;

public class Task14 {

    public static void main (String[] args) {


        int max = 2;
        for (int i = 2; i < 10 * 1000; i++) {
            if (Task11.calculateNumberOfDividers(i) > Task11.calculateNumberOfDividers(max))

                max = i;



        }
        System.out.println("Liczba, która ma największą liczbę dzielników to  " + max + " liczba jej dzielników to: "
                + Task11.calculateNumberOfDividers(max));


    }
}
