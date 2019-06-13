package arrays;

public class Task5 {
    static int middleElement (int[]array){
        int lenght = array.length;
        return array[(array.length - 1) /2];

    }

    public static void main(String[] args) {
        System.out.println(middleElement(new int[]{1,2,3,4,5,6,7,8,9}));
    }
}
