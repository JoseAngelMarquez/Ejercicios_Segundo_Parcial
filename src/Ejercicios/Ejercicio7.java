/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:04/04/23	      *
 * Descripción:Peso de muñecos        *
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        
        // Leemos el número de payasos y muñecas vendidos 
        System.out.print("Ingrese el número de payasos vendidos: ");
        int numPayasos = leer.nextInt();
        System.out.print("Ingrese el número de muñecas vendidas: ");
        int numMuñecas = leer.nextInt();
        
        // Calculamos el peso total del paquete
        double pesoTotal = numPayasos * 112 + numMuñecas * 75;
        
        // Mostramos el total del peso del paquete
        System.out.println("El peso total del paquete es: " + pesoTotal + " g");
	    }
	

}
