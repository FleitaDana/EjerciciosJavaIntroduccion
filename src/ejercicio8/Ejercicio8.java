
package ejercicio8;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio8 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese una frase");
        String frase = entrada.next();
        
                
        if (frase.equals("eureka")){
             System.out.println("CORRECTO");
        } else{
            System.out.println("INCORRECTO");
        }
            
    }
    
}
