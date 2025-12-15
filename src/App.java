
import utils1.Sing_Validator1;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Sing_Validator1 signValidator = new Sing_Validator1();
        String cadena1 = "{[()]}"; // VALIDO
        String cadena2 = "{[(])}"; // NO VALIDO

        System.out.println("Cadena: " + cadena1 + " es valida? " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " es valida? " + signValidator.isValid(cadena2));  
        
    }
}
