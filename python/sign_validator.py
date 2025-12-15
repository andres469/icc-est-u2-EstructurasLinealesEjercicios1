class SignValidator:
    
    def is_valid(self, text: str) -> bool:
        """Valida si los signos de apertura y cierre están balanceados."""
        stack = []
        for char in text:
            if self._is_apertura(char):
                stack.append(char)
            elif char == ')' or char == '}' or char == ']':
                if not stack:
                    return False
                top = stack.pop()
                if not self._is_tipo_igual(top, char):
                    return False
        
        return len(stack) == 0
    
    def _is_apertura(self, c: str) -> bool:
        """Verifica si el carácter es un signo de apertura."""
        return c == '(' or c == '{' or c == '['
    
    def _is_tipo_igual(self, apertura: str, cierre: str) -> bool:
        """Verifica si la apertura y cierre corresponden."""
        return (apertura == '(' and cierre == ')') or \
               (apertura == '{' and cierre == '}') or \
               (apertura == '[' and cierre == ']')