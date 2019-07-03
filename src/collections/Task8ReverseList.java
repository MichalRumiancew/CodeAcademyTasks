package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task8ReverseList {
    public static List<Integer> reverse(List<Integer> list) {
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(reverse(Arrays.asList(5, 1, 99)));
    }

}
