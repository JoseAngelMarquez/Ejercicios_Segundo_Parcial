/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:07/04/23	      *
 * Descripción:Numero mayor	y menor   *
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio25 {

	public static void main(String[] args) {
		 Scanner leer = new Scanner(System.in);

	        int numero;
	        int mayor = 0;
	        int menor = Integer.MAX_VALUE;

	        do {
	        	//Pedimos al usuario ingresar n numeros hasta que ingrese 0 se detiene
	            System.out.print("Ingrese un número entero (0 para salir): ");
	            numero = leer.nextInt();
	            //Condiciòn para saber si el numero es mayor
	            
	            if (numero > mayor && numero != 0) {
	                mayor = numero;
	            }
	            //Condiciòn para saber si el numero es menor

	            if (numero < menor && numero != 0) {
	                menor = numero;
	            }

	        } while (numero != 0);
	        
	        //Se imprime el numero mayor y el menor entre todos los ingresados
	        System.out.println("El mayor número ingresado fue: " + mayor);
	        System.out.println("El menor número ingresado fue: " + menor);

	}

}
