
package ejercicio_22.pkg07.pkg2023;

import java.util.Scanner;

/**
 *
 * @author ramir
 */
public class ejercicio2 {
    
    public static void main(String[]args){
        
        String nombre = "";
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("¿Hola Cual es tu nombre?: ");
        nombre = entrada.nextLine();
        
        System.out.println("Buenos días " + nombre);
    }
    
}
