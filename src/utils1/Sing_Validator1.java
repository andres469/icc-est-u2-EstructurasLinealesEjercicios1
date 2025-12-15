package utils1;

import java.util.Stack;

public class Sing_Validator1 {
    public boolean isValid(String signos) {
       Stack<Character> stack =new Stack<Character>();
for (Character character : signos.toCharArray()) {
    if (getIsApertura(character)) {
        stack.push(character);
    } else {
        if (stack.isEmpty()) {
            return false;
        }
        Character top = stack.pop();
        if ((character == ')' && top != '(') ||
            (character == '}' && top != '{') ||
            (character == ']' && top != '[')) {
            return false;
        }
    }
    
}

         return stack.isEmpty();
    }

    private boolean getIsApertura(char c) {
        if (c == '(' || c == '{' || c == '[') {
            return true;
        }
        return false;
    }
    private boolean isTipoIgual(char apertura, char cierre) {
        if ((apertura == '(' && cierre == ')') ||
            (apertura == '{' && cierre == '}') ||
            (apertura == '[' && cierre == ']')) {
            return true;
        }
        return false;
    }

    
    
}
