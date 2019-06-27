package collections;

import java.util.Collections;
import java.util.List;

public class Task2SortedList {
    List<Integer> getSortedList(List<Integer> numbers) {
        Collections.sort(numbers);
        return numbers;
    }
}

