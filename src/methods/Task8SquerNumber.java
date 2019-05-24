package methods;

public class Task8SquerNumber {
    static boolean isSquereIsIntegerNumber (int number){
        double squer = Math.sqrt(number);
        return number % squer ==0;
    }

    public static void main(String[] args) {
        int number = Task7.getNumberFromInput();
        System.out.println(isSquereIsIntegerNumber(number));
    }
}
