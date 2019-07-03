package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6AddColorsArraylist {

    public static void main(String[] args) {


        List<String> colors = new ArrayList<>();
        List<String> colors2 = Arrays.asList("blue", "yellow", "red");

        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        for (String color : colors) {
            System.out.println(color);
        }
        for (String color : colors2) {
            System.out.println(color);
        }

    }
}