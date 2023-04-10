/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:	05/04/23	  *
 * Descripción:Comaparaciòn edad      *
 * 			   y decidir si tributar  *
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		//Edad e ingresos dados por el usuario
        System.out.print("Ingrese su edad: ");
        int edad = leer.nextInt();
        System.out.print("Ingrese sus ingresos mensuales: ");
        double ingresos = leer.nextDouble();
        
        //Condiciones para saber si la persona debe de tributar
        if (edad >= 16 && ingresos >= 500) {
            System.out.println("Usted debe tributar.");
        } else {
            System.out.println("Usted no debe tributar.");
        }

	}

}
