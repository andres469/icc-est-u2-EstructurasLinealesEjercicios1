package utils1;

import java.util.Stack;

public class Sing_Validator1 {

    public boolean isValid(String signos) {
        Stack<Character> stack = new Stack<>();

        for (char c : signos.toCharArray()) {
            if (isApertura(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if (!esPar(top, c)) return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isApertura(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private boolean esPar(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '{' && cierre == '}') ||
               (apertura == '[' && cierre == ']');
    }
}
