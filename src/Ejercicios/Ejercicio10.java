/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:	05/04/23	  *
 * Descripción:Operaciòn divisiòn     *
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		//Se piden los valores para hacer la divisiòn
        System.out.print("Ingrese el dividendo: ");
        float dividendo = leer.nextFloat();
        System.out.print("Ingrese el divisor: ");
        float divisor = leer.nextFloat();
        
        //Condiciòn para imprimir el resultado de la divisiòn
        if (divisor != 0) {
            float resultado = dividendo / divisor;
            System.out.println("El resultado de la division es: " + resultado);
        } else {
            System.out.println("No se puede dividir ya que el divisor es cero.");
        }
	}

}
