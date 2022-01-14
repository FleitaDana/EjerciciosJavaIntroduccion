
package ejercicio6;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio6 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese un valor");
        int num1 = entrada.nextInt();
        
        System.out.println("Ingrese un segundo valor");
        int num2 = entrada.nextInt();
        
        if (num1 > num2){
            System.out.println("El primer valor es mayor que el segundo");
        } else {
            System.out.println("El segundo valor es mayor que el primero");
        }
        
    }
    
}
