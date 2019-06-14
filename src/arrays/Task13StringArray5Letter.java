package arrays;

public class Task13StringArray5Letter {
    static boolean isFive(String word) {
        if (word.length() != 5) {
            return false;
        } else {
            for (int i = 0; i < word.length(); i++) {
                if (!Character.isLetter(word.charAt(i)))
                    return false;
            }
        }
        return true;
    }

    // ["Alicja ma kota","Alicja","Wojciech","Zdzisław Python"]
    static String[] getFiveLetterWords(String[] array) {
        int length = 0;
        boolean[] indexes = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (isFive(array[i])) {
                    indexes[i] = true;
                    length++;
                } else {
                    indexes[i] = false;
                }
            }
        }
        String[] words = new String[length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (indexes[i])
                words[index++] = array[i];
        }
        return words;
    }

    public static void main(String[] args) {
        String[] words = new String[5];
        words[0] = "Adam";
        words[1] = "Wojciech";
        words[2] = "dsaaw";
        for (String word : getFiveLetterWords(words)) {
            System.out.println(word);
        }
    }
}
