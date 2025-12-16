package utils1;

import java.util.Stack;

public class StackSorter {

    public void sort(Stack<Integer> stack) {
        Stack<Integer> aux = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!aux.isEmpty() && aux.peek() > temp) {
                stack.push(aux.pop());
            }
            aux.push(temp);
        }

        // regresar elementos al stack original
        while (!aux.isEmpty()) {
            stack.push(aux.pop());
        }
    }
}
