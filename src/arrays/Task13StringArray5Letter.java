package arrays;

public class Task13StringArray5Letter {
    static boolean isFive (String word){
        if (word.length()!=5){
            return false;
        }
        else {
            for (int i = 0; i <word.length() ; i++) {
                if (!Character.isLetter(word.charAt(i)));
                return false;
            }
        }
        return true;
    }

}
