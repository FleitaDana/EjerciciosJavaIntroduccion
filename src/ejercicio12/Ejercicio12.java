
package ejercicio12;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio12 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese un nota entre el 0 y 10");
        int nota = entrada.nextInt();
        
        while (nota<1 || nota>10){
            System.out.println("Ingrese un nota entre el 0 y 10");
            nota = entrada.nextInt();
        }
        
        System.out.println("La nota ingresada es: " + nota);
            
    }
}
