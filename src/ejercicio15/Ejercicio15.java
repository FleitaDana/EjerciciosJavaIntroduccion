
package ejercicio15;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio15 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        int contador;
        int suma;
        
        suma = 0;
        contador = 0;
        
        
        
        while (contador < 20){
            System.out.println("Ingrese un numero");
            int numero = entrada.nextInt();
    
            if (numero == 0){
                 System.out.println("Se capto el numero 0");
                 break;
            } 
            
            contador++;
            
            if (numero >= 1){
                suma = suma + numero;
            
            }
          
        }
        
        System.out.println("La suma de los " + contador + " numeros ingresados es: "+ suma);
        
    }  
}

