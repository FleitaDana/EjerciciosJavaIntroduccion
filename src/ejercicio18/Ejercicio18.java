
package ejercicio18;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio18 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        for (int i = 0; i <4; i++){
            System.out.println("Ingrese un valor para luego graficar");
            int valor = entrada.nextInt();
            
            while (valor < 1 || valor > 20) {
                System.out.println("ERROR! ingrese numero correcto");
                valor = entrada.nextInt();
            
            }
            
            
           
            switch (i){
                case 0:
                    System.out.print(valor);
                    for (int j = 0; j < valor; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                    break;
                case 1:
                    System.out.print(valor);
                    for (int j = 0; j < valor; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.print(valor);
                    for (int j = 0; j < valor; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.print(valor);
                    for (int j = 0; j < valor; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                    break;
                    }
}
}
} //Este quedo dudoso


