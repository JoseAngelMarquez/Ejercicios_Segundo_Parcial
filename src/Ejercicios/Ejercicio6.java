/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:04/04/23	      *
 * Descripción:Numeros invertidos     *			          
 **************************************/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		 Scanner leer = new Scanner(System.in);
		 	//Se ingresa un valor de 4 cifras
	        System.out.print("Ingrese un número de cuatro dígitos: ");
	        int numero = leer.nextInt();

	        //Operaciones para extraer cada dìgito
	        int digito1 = numero % 10;
	        int digito2 = (numero / 10) % 10;
	        int digito3 = (numero / 100) % 10;
	        int digito4 = (numero / 1000) % 10;

	        //Se concatenan los numeros para obtener el invertido
	        int numeroInvertido = digito1 * 1000 + digito2 * 100 + digito3 * 10 + digito4;
	        
	        //Se imprime el resultado
	        System.out.println("El número invertido es: " + numeroInvertido);
	    }
}
