
package ejercicio4;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio4 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese grados");
        int grados = entrada.nextInt();
        
        int fahrenheit = 32 + (9*grados /5);
        
        System.out.println("Los " + grados + " grados ingresados son: " + fahrenheit + " grados fahrenheit");
                
    }
    
}
