
package ejercicio2;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio2 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese su nombre");
        String nombre = entrada.next();
        
        System.out.println("Su nombre es: " + nombre);
         
    }
    
}
