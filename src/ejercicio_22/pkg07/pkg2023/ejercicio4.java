
package ejercicio_22.pkg07.pkg2023;

import java.util.Scanner;

/**
 *
 * @author ramir
 */
public class ejercicio4 {
    public static void main (String []args){
    
        int grados = 0;
        int fahrenheit = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Hola, digita un numero a convertir a fahrenheit: ");
        grados = entrada.nextInt();
        
        fahrenheit = 32+(9*grados/5);
        
        System.out.println("Los grados fahrenheit de " + grados + " son" + " " + fahrenheit);
    }
}
