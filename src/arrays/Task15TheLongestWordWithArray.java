package arrays;

public class Task15TheLongestWordWithArray {
    static int getTheLongestWordWithArray(String[] array) {
        if (array.length == 0) {
            return -1;
        } else {
            int max = array[0].length();
            for (String value : array) {
                if (value.length() > max) {
                    max = value.length();
                }
            }
            return max;
        }
    }
}

