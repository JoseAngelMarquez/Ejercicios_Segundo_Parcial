/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:07/04/23	      *
 * Descripción:Sumatorias	          * 
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		//El valor introduce el numero de iteraciones de la sumatoria
        System.out.print("Ingrese un valor para n: ");
        int n = leer.nextInt();

        double suma = 0.0;
        //Se hace la iteracion la catidad de veces que introdujo el usuario
        for (int j = 1; j <= n; j++) {
            suma += Math.PI * Math.pow(j, 2);
        }
        //Se imprime el total de la sumatoria
        System.out.println("La suma de la expresión es: " + suma);

	}

}
