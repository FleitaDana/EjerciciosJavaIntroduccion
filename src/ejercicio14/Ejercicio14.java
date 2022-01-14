
package ejercicio14;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio14 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese 1er numero");
        int num1 = entrada.nextInt();
        
        System.out.println("Ingrese 2do numero");
        int num2 = entrada.nextInt();
        
        String salir;
        
        salir = "N";
        
        do{
         
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        
        System.out.println("Elija una opcion");
        int opcion = entrada.nextInt();
        
       
        switch (opcion){
            case 1:
                System.out.println("La suma es: " + (num1+num2));
                break;
            case 2:
                System.out.println("La resta es: " + (num1-num2));
                break;
            case 3:
                System.out.println("La multiplicacion es: " + (num1*num2));
                break;
            case 4:
                if (num2 == 0){
                    System.out.println("No se puede dividir por cero");
                } else {
                System.out.println("La division es: " + (num1/num2));
                break;
                }
            case 5:
                System.out.println("Esta seguro que desea salir del programa(S/N)?");
                salir = entrada.next();
                break;
            default:
                System.out.println("Ingrese un valor valido");
                break;
        }
        
    }while ((!salir.equals("S")));
        
    }
}