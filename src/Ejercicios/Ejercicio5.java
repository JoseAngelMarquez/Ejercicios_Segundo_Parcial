/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:04/04/23	      *
 * Descripción:Calcular hipotenusa de *
 * 			   un triàngulo rectàngulo*
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		//Se ingresan las longitudes de lo catetos
		System.out.println("Dame la longitud del primer cateto: ");
		float cat1 = leer.nextFloat();
		System.out.println("Dame la longitud del segundo cateto: ");
		float cat2 = leer.nextFloat();
		
		//Se obtienen por separado las potencias 
		float op1 = (float) Math.pow(cat1, 2);
		float op2 = (float) Math.pow(cat2, 2);
		//Se utilizan las potencias de ambos valores y depues se suman y se saca la raìz
		float Hipotenusa = (float) Math.sqrt(op1+op2);
		
		System.out.println("La longitud de la hipotenusa es : " + Hipotenusa);

	}

}
