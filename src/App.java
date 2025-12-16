import utils1.*;

import java.util.Stack;

public class App {

    public static void main(String[] args) {
        runSignValidator();
        runStackSorter();
        runQueuePalindrome();
    }

    private static void runSignValidator() {
        System.out.println("=== EJERCICIO 01 ===");
        Sing_Validator1 validator = new Sing_Validator1();

        String c1 = "([]){}";
        String c2 = "({)}";

        System.out.println("Cadena: " + c1 + " válida? " + validator.isValid(c1));
        System.out.println("Cadena: " + c2 + " válida? " + validator.isValid(c2));
    }

    private static void runStackSorter() {
        System.out.println("\n=== EJERCICIO 02 ===");

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Stack original: " + stack);

        StackSorter sorter = new StackSorter();
        sorter.sort(stack);

        System.out.println("Stack ordenado: " + stack);
    }

    private static void runQueuePalindrome() {
        System.out.println("\n=== EJERCICIO 03 ===");

        QueueUtils queueUtils = new QueueUtils();

        System.out.println("ana -> " + queueUtils.isPalindrome("ana"));
        System.out.println("radar -> " + queueUtils.isPalindrome("radar"));
        System.out.println("java -> " + queueUtils.isPalindrome("java"));
    }
}
