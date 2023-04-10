/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:	05/04/23	  *
 * Descripción:Numeros felices e 	  *
 *     	   	   infelices			  *
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número de cuatro dígitos: ");
        int num = leer.nextInt();

        int dig1 = num / 1000; 
        int dig2 = (num / 100) % 10; 
        int dig3 = (num / 10) % 10; 
        int dig4 = num % 10; 

        // Verificar si el número es feliz
        boolean Feliz = (dig1 * 10 + dig2) > (dig3 * 10 + dig4);

        // Verificar si el número es creciente
        boolean Creciente = (dig1 < dig2) && (dig2 < dig3) && (dig3 < dig4);

        // Determinar el tipo de número
        if (Feliz && Creciente) {
            System.out.println("El número es muy feliz");
        } else if (Feliz && !Creciente) {
            System.out.println("El número es feliz ");
        } else if (!Feliz && Creciente) {
            System.out.println("El número es creciente");
        } else {
            System.out.println("El número es infeliz");
        }
    }
	

}
