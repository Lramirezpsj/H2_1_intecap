
package ejercicio_22.pkg07.pkg2023;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author ramir
 */
public class ejercicio5 {
    
    public static void main(String []args){
    
        double radio = 0;
        double longitud = 0;
        double area = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el numero: ");
        radio = entrada.nextInt();
        
        longitud = 2*(Math.PI*radio);
        area = Math.PI*(radio*radio);
        
        System.out.println("Longitud " + longitud);
        System.out.println("Area " + area);
        
                
    }
    
}
