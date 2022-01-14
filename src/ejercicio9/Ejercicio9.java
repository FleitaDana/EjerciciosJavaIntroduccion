
package ejercicio9;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio9 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
         System.out.println("Ingrese una palabra o frase de 8 de longitud");
        String palabra = entrada.next();
        
       if (palabra.length() == 8){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}
