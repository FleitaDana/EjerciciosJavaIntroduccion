
package ejercicio10;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio10 {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese una palabra o frase que empiece con a");
        String palabra = entrada.next();
        
       if (palabra.substring(0,1).equals("a")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}
