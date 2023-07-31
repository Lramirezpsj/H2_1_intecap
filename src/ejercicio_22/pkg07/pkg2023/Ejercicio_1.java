
package ejercicio_22.pkg07.pkg2023;

import java.util.Scanner;

/**
 *
 * @author ramir
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        String nombre = "";
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("**********************************");
        System.out.println("****Bienvenido a la clase 3*******");
        System.out.println("**********************************");
        
        System.out.print("¿Hola, cual es tu nombre?: ");
        nombre = entrada.nextLine();
        
        System.out.print("Por favor digita el primer valor: ");
        num1 = entrada.nextInt();
        
        System.out.print("POr favor digita el segundo valor: ");
        num2 = entrada.nextInt();
        
        System.out.println("");
        System.out.println(nombre + ", "+"Los numeros digitados son: " + num1 +", " +num2);
    }
    
}
