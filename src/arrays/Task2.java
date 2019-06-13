package arrays;

public class Task2 {
    static int last(int[] number) {
        int lenght = number.length;
        if (lenght == 0) {
            return Integer.MIN_VALUE;

        }
        return number[lenght - 1];
    }

    public static void main(String[] args) {


        System.out.println(

                last(new int[]{1, 3, 4, 5, 334, 4, 5, 2
                }));
        System.out.println(

                last(new int[]{}));
    }
}
