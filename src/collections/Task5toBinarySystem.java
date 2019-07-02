package collections;

import java.util.Stack;

public class Task5toBinarySystem {

    public static String toBinarySystemString(int n) {

        Stack<Integer> stack = new Stack<>();
        while (n != 0) {
            stack.add(n % 2);
            n /= 2;
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.empty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(toBinarySystemString(5));
    }
}

