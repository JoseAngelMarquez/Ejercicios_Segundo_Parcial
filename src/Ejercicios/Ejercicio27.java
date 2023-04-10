/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:07/04/23	      *
 * Descripción:dìas transcurridos     * 
 **************************************/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		//El usuario ingresa un valor entre 1 y 12
        System.out.print("Ingresa el número de mes (1-12): ");
        int mes = leer.nextInt();
        //Llamamos a la funciòn para hacer la operaciòn
        int dias = diasTranscurridos(mes);
        //Imprimos el valor 
        System.out.println("Días transcurridos desde el comienzo del año: " + dias);

	}
	//Funciòn utilizada para contar los dìas
	public static int diasTranscurridos(int mes) {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diasTranscurridos = 0;
        
        for (int i = 0; i < mes; i++) {
            diasTranscurridos += diasPorMes[i];
        }
        
        return diasTranscurridos;
    }

}
