
package ejercicio5;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio5 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
     System.out.println("Ingrese un numero entero");
     int numero = entrada.nextInt();
     
     int doble = numero * 2;
     int triple = numero * 3;
     double raiz = Math.sqrt(numero);
     
     System.out.println("El doble del numero ingresado es: " + doble);
     System.out.println("El triple del numero ingresado es: " + triple);
     System.out.println("La raiz del numero ingresado es: " + raiz);
     
    }
    
}
