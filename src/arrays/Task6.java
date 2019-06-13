package arrays;

public class Task6 {
//    static int[] plusTwoArrays(int[] a, int[] a1) {
//
//        int[] sum = new int[4];
//        sum[0] = a[0];
//        sum[1] = a[1];
//        sum[2] = a1[0];
//        sum[3] = a1[1];
//        return sum;

    static int[] plusTwoArrays1(int[] a, int[] a1) {
        int[] newArray = new int[a.length + a1.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];

        }

        for (int i = a.length; i < a.length + a1.length; i++) {
            newArray[i] = a1[j++];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{1, 2, 3, 4};
        int[] score = plusTwoArrays1(a, b);
        for (int value : score) {
            System.out.print(value);
        }
    }
}
