package collections;

import java.util.Arrays;
import java.util.List;

public class Task7FindIndexOfColor {

    public static int findIndexOfColor(String color, List<String> colors) {

        return color.indexOf(color);
    }

    public static void main(String[] args) {
        System.out.println(findIndexOfColor("blue", Arrays.asList("green", "white", "blue")));
    }
}
