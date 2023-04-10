/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:04/04/23	      *
 * Descripción:Calcular la velocidad  *
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		 Scanner leer = new Scanner(System.in);
	        
	        // Leemos la distancia y el tiempo del objeto
	        System.out.print("Ingrese la distancia en metros: ");
	        float distancia = leer.nextFloat();
	        System.out.print("Ingrese el tiempo en segundos: ");
	        float tiempo = leer.nextFloat();
	        
	        // Calculamos la velocidad
	        float velocidad = distancia / tiempo;
	        
	        // Mostramos el resultado
	        System.out.println("La velocidad es: " + velocidad + " m/s");
	}

}
