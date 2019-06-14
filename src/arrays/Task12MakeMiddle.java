package arrays;

public class Task12MakeMiddle {
    static int[] makeMiddle(int[] array) {
        int[] returnedArray;
        if (array.length == 0) {
            returnedArray = array;
        } else {
            returnedArray = new int[2];
            returnedArray[0] = array[array.length / 2 - 1];
            returnedArray[1] = array[array.length/2];

        }
        return returnedArray;
    }

    public static void main(String[] args) {
        int [] array = Task9SwapArray.readArrayFrominput();

        for (int element : makeMiddle(array)){
            System.out.println(element);
        }
    }

}
