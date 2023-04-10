/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:05/04/23	      *
 * Descripción:Dados dos numeros      *
 * 			   determinar si el tercer*
 * 			   numero esta en el      *
 * 			   intervalo			  *
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		//Valores introducidos por el usuario donde x y y son el rango y w es el numero que deseamos saber si esta en el rango
        System.out.print("Ingrese el valor de X: ");
        float x = leer.nextFloat();

        System.out.print("Ingrese el valor de Y: ");
        float y = leer.nextFloat();

        System.out.print("Ingrese el valor de W: ");
        float w = leer.nextFloat();

        //Se comprueba si esta en el rango de x y y
        if (w >= x && w <= y) {
            System.out.println(w + " está dentro del intervalo");
        } else {
            System.out.println(w + " está fuera del intervalo");
        }

	}

}
