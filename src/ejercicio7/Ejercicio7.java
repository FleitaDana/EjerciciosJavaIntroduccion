

package ejercicio7;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio7 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese un valor");
        int num1 = entrada.nextInt();
        
        if (num1 % 2 == 0){
            System.out.println("El valor es par");
        } else {
            System.out.println("El valor es impar");
        }
    }
}
