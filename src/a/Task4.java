package a;

public class Task4 {
    static int sum (int[]array){
        int lenght = array.length;
        return array[0]+ array[lenght-1];
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,3,4,5,6,7,8,9}));
    }

}
