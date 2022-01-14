
package ejercicio17;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio17 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese un valor para lados del cuadrado a dibujar");
        int valor = entrada.nextInt();
        
        for(int i = 0; i<valor; i++){
             System.out.print("*");
        }
        System.out.println(" ");
      
        for(int i = 0; i < valor-2 ; i++){
             System.out.print("*");
             for(int j = 0; j < valor-2 ; j++){
             System.out.print(" ");
        }
             System.out.println("*");
        }
        
        
        for(int i = 0; i<valor; i++){
             System.out.print("*");
        }
        System.out.println(" ");        
    }
    
}
