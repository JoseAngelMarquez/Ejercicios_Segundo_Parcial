/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:	07/04/23	  *
 * Descripción:Operaciones con numeros* 
 * 			   Pares e Impares   	  *
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio22 {

	public static void main(String[] args) {
		 Scanner leer = new Scanner(System.in);
		 
	        int numero;
	        int cantidadNumeros = 0;
	        int sumaTotal = 0;
	        int sumaPares = 0;
	        int sumaImpares = 0;
	        
	        //Ciclo para introducir N numeros 
	        do {
	            System.out.print("Ingrese un número (introducir 0 para terminar de pedir numeros): ");
	            numero = leer.nextInt();
	            //Se hacen las respectivas operaciones para saber si son pares o impares
	            if (numero != 0) {
	                cantidadNumeros++;
	                sumaTotal += numero;
	                if (numero % 2 == 0) {
	                    sumaPares += numero;
	                } else {
	                    sumaImpares += numero;
	                }
	            }
	        } while (numero != 0);
	        
	        //Se obtiene en porcentaje los numeros pares e impares
	        double porcentajePares = (double) sumaPares / sumaTotal * 100;
	        double porcentajeImpares = (double) sumaImpares / sumaTotal * 100;
	        
	        //Se imprime lo solicitado
	        System.out.println("Cantidad de números ingresados: " + cantidadNumeros);
	        System.out.println("Suma total: " + sumaTotal);
	        System.out.println("Suma de números pares: " + sumaPares + ", porcentaje: " + porcentajePares + "%");
	        System.out.println("Suma de números impares: " + sumaImpares + ", porcentaje: " + porcentajeImpares + "%");

	}

}
