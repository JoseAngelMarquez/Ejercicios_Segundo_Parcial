/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:04/04/23	      *
 * Descripción:Paga de trabajadores   *
 **************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        
		//Datos introducidos por el usuario
        System.out.print("Ingrese el número de horas trabajadas: ");
        float horasTrabajadas = leer.nextFloat();
        
        System.out.print("Ingrese el costo por hora: ");
        float costoPorHora = leer.nextFloat();
        
        //Se hace la operacion para obtener la paga
        float pagaTotal = horasTrabajadas * costoPorHora;
        System.out.println("La paga total es: " + pagaTotal);
	}

}
