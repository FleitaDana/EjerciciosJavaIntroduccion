
package ejercicio13;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio13 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        int suma,numeros;
        
        System.out.println("Ingrese un valor limite positivo");
        int limite = entrada.nextInt();
        
        suma= 0;
        
        while (suma < limite){
            System.out.println("Ingrese un numero");
            numeros = entrada.nextInt();
            suma += numeros; 
        }
        
        System.out.println("Los numeros ingresados superan el limite positivo");
    }
    
    
}
