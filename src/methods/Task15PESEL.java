package methods;

public class Task15PESEL {
    static boolean isPesel(String pessel) {
        if (pessel.length() != 11)
            return false;
        for (int i = 0; i <pessel.length() ; i++) {
            if (!Character.isDigit(pessel.charAt(i)))
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPesel("82123100012"));
    }
}
