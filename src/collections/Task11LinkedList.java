package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task11LinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        int first = list.get(0);
        list.set(0, list.get(2));
        list.set(2, first);
        System.out.println(list);

        List<Integer> array = new ArrayList<>(list);//konwersja na arraylist
        System.out.println(array);


    }

}
