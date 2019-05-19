package While;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 1; i <= 6 ; i++) {
            System.out.println(random.nextInt(49)+1);

        }
    }
}
