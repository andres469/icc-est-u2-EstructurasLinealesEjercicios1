package utils1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUtils {

    public boolean isPalindrome(String text) {
        Queue<Character> original = new LinkedList<>();
        Queue<Character> invertida = new LinkedList<>();
        Queue<Character> aux = new LinkedList<>();

        // llenar cola original
        for (char c : text.toCharArray()) {
            original.add(c);
            aux.add(c);
        }

        // invertir usando cola auxiliar
        while (!aux.isEmpty()) {
            char c = aux.remove();
            int size = aux.size();

            for (int i = 0; i < size; i++) {
                aux.add(aux.remove());
            }
            invertida.add(c);
        }

        // comparar
        while (!original.isEmpty()) {
            if (!original.remove().equals(invertida.remove())) {
                return false;
            }
        }
        return true;
    }
}
