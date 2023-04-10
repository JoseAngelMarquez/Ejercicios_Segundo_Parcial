/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:	05/04/23      *
 * Descripción:Numeros primos		  *
 **************************************/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		//Numero introducido por el usuario
        System.out.println("Introduce un número entero:");
        int num = leer.nextInt();
        boolean Primo = true;

        //Ciclo utilizado para comprobar cada uno de los numeros hasta el numero dado si solo es divisible entre 1 y el mismo numero
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                Primo = false;
            }
        }
        
        //Imprime si es primo o no
        if (Primo && num > 1) {
            System.out.println(num + " es un número primo");
        }
        else {
            System.out.println(num + " no es un número primo");
		}
	}
}