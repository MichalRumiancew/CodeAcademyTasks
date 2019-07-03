package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task9GetMax {
    static int getMax(List<Integer> array) {
        return Collections.max(array);
    }

    public static void main(String[] args) {
        System.out.println(getMax(Arrays.asList(5, 1, 3, -9, 33, 4, 54, 5)));
    }
}
