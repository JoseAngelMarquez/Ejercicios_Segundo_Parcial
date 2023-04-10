/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:08/04/23	      *
 * Descripción:Suma digitos de un     *
 * 			   numero			      * 
 **************************************/
package Ejercicios;
import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		 Scanner leer = new Scanner(System.in);
	        int numero = 1;
	        while(numero != 0) {
	            System.out.print("Ingrese un número de mas de un digito o ingrese 0 para salir: ");
	            numero = leer.nextInt();
	            if(numero != 0) {
	                int suma = sumarDigitos(numero);
	                System.out.println("La suma de los dígitos es: " + suma);
	            }
	        }
	    }

	    public static int sumarDigitos(int numero) {
	        int suma = 0;
	        while (numero != 0) {
	            suma += numero % 10;
	            numero /= 10;
	        }
	        return suma;
	    }

}
