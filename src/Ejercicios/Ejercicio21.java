/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:	06/04/23      *
 * Descripción:Operaciones de         * 
 * 			   fracciones    		  *
 **************************************/

package Ejercicios;
import java.util.Scanner;
public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		//Se introduce el valor hasta el denominador maximo
        System.out.println("Introduce el máximo denominador:");
        int n = leer.nextInt();
        
        float suma = 4;
        int signo = -1;
        
        //en este caso 4 es el numerador y lo que cambia sera el denominador
        for (int i = 3; i <= n; i += 2) {
            suma += signo * (4.0 / i);
            //Alternarà las operaciones entre sumas y restas
            signo *= -1;
        }
        System.out.println("El resultado de la serie es: " + suma);
	}

}
