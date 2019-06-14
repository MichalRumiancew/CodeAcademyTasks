package arrays;

public class Task7 {
    static int sum(int[] array) {

        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}