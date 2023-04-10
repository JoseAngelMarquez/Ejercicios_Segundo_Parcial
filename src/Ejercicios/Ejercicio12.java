/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:	05/04/23      *
 * Descripción:Numeros capicùa        *
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		//El usuario introduce el numero que debe ser de 4 dìgitos
        System.out.print("Ingrese un número de cuatro dígitos: ");
        int numero = leer.nextInt();
        
        // Extraemos los dígitos del número
        int digito1 = numero / 1000;
        int digito2 = (numero % 1000) / 100;
        int digito3 = (numero % 100) / 10;
        int digito4 = numero % 10;
        
        // Verificamos si el número es capicúa
        if (digito1 == digito4 && digito2 == digito3) {
            System.out.println("Capicúa");
        } else {
            System.out.println("No es Capìcua");
        }

	}

}
