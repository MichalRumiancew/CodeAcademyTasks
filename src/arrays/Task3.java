package arrays;

public class Task3 {
    static int sum (int[] array){
        return array[0]+array[1];
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,3,4}));
    }
}
