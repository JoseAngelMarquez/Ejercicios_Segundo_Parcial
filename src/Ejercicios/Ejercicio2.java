/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:04/04/23	      *
 * Descripción: Operaciònaritmètica   *
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		
		//Datos introducidos por el usuario
		System.out.print("Ingrese el valor de x: ");
        float x = leer.nextFloat();
        
        System.out.print("Ingrese el valor de y: ");
        float y = leer.nextFloat();
        
        System.out.print("Ingrese el valor de a: ");
        float a = leer.nextFloat();
        
        System.out.print("Ingrese el valor de b: ");
        float b = leer.nextFloat();
        //Funciòn de la operaciòn
        float resultado = (x + y) / (a * b);
        System.out.println("El resultado de la operación es: " + resultado);
    }
	

}
