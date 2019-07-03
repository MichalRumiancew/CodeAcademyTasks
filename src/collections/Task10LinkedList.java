package collections;

import java.util.LinkedList;
import java.util.List;

public class Task10LinkedList {
    public static void main(String[] args) {
        List<Integer> elements = new LinkedList<>();
        elements.add(5);
        elements.add(-3);
        elements.add(8);
        elements.add(77);
        elements.add(3);
        elements.add(12);
        elements.add(0);
        elements.add(2,17);
        System.out.println(elements);
    }
}
