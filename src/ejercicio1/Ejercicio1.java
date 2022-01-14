
package ejercicio1;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio1 { /*Clasee que tiene en su interior el metodo main*/

    
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
            
            System.out.println("Ingrese un valor");
            int num1 = entrada.nextInt();
            
            System.out.println("Ingrese un valor");
            int num2 = entrada.nextInt();
            
            int suma= num1 + num2;
            
            System.out.println("El valor de la suma es: " + suma);
            
            
    }
}
