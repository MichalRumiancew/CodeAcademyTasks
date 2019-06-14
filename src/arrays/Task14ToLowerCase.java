package arrays;

public class Task14ToLowerCase {
    String[] toLowerCases(String[] array) {
        String[] newArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i].toLowerCase();
        }
        return newArray;
    }
}

