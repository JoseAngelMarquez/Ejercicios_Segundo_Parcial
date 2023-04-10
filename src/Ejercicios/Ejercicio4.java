/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:04/04/23	      *
 * Descripción:Cociente y residuo     *
 * 			   de una divisiòn        *
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		//Primer valor introducido
		System.out.print("Ingrese primer valor: ");
        int num1 = leer.nextInt();

        //Segundo valor introducido por el usuario
        System.out.print("Ingrese el segundo valor: ");
        int num2 = leer.nextInt();

        //Operaciones a realizar para obtener el cociente y el residuo
        int c = num1 / num2;
        int r = num1 % num2;

        //Se imprime el resultado
        System.out.println(num1 + " entre " + num2 + " da un cociente " + c + " y un resto " + r);
    }

}


