package arrays;

import java.util.Arrays;

public class Task8MaxValueElementArray {
    static int max(int[] array) {

        return Arrays.stream(array).max().getAsInt();
    }

    static int max2(int[] array) {

        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 1,2,3,0,5,6,4,25,4,5,43,454535,5,34,5,34,5,345};
        System.out.println(max(array));
        System.out.println(max2(array));
    }
}
