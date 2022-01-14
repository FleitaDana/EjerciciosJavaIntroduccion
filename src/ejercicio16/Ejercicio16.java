
package ejercicio16;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio16 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
       String cadena;
       int correcto= 0;
       int incorrecto= 0;
        
        do{
            System.out.println("Ingrese una cadena de 5 caracteres que comience con X y termine con O");
            cadena = entrada.next();
            
            if (cadena.length()==5 && cadena.substring(0,1).equals("X") && cadena.substring(4,5).equals("O") ){
            correcto++;
        } else{
            incorrecto++;
            }
            
            
        } while ((!cadena.equals("&&&&&")));
        
        System.out.println("Informe de cadenas ingresadas:");
        System.out.println("correctas: " + correcto);
        System.out.println("incorrectas: " + (incorrecto-1));
    }
    
}
