package collections;

import java.util.*;

public class Task3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System. in );
            int n = scanner.nextInt();
// klucz to liczba 1, wartość ile razy występuje
            Map<Integer, Integer> numbers = new TreeMap<>();
            List<Integer> list = new ArrayList<>();
            int number;
            for ( int i = 1 ; i <= n; i++) {
                number = scanner.nextInt();
                list.add(number);
                if (numbers.containsKey(number)) {
                    numbers.put(number, numbers.get(number) + 1 ); // numbers[number]++;
                } else {
                    numbers.put(number, 1 );
                }
            }
            for (Map.Entry<Integer, Integer> pair : numbers.entrySet()) {
                if (pair.getValue() == 1 ) {
                    System. out .println(pair.getKey() + " występuje 1 raz" );
                } else {
                    System. out .println(pair.getKey() + " występuje " + pair.getValue() + " razy" );
                }
            }
// Sposób 2
            Collections. sort (list);
            int lastValue = list.get( 0 ) + 1 ;
            int frequency;
            for (Integer value : list) {
                if (value != lastValue) {
                    frequency = Collections. frequency (list, value);
                    if (frequency == 1 ) {
                        System. out .println(value + " występuje 1 raz" );
                    } else {
                        System. out .println(value + " występuje " + frequency + " razy" );
                    }
                }
                lastValue = value;
            }
        }
    }

