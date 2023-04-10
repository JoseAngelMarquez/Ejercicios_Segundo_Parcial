/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:	4/04/23	      *
 * Descripción:Numeros impares		  *
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		//Numero introducido por el usuario
		System.out.println("Dame un nùmero positivo");
		int num = leer.nextInt();
		//Se comprueban cuales numeros son impares desde 0 hasta num
		for (int i = 0; i <= num; i++) {
			if (i%2!=0) {
				System.out.println("Numero " + i + " es impar");
			}
		
		}
	}

}
