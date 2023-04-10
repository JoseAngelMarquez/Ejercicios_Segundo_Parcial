/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:04/04/23	      *
 * Descripción: Potencia y raìz       *
 **************************************/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		//Datos introducidos por el usuario
		System.out.print("Ingrese el valor de x: ");
        float x = leer.nextFloat();
        
        System.out.print("Ingrese el valor de y: ");
        float y = leer.nextFloat();
        
        System.out.print("Ingrese el valor de z: ");
        float z = leer.nextFloat();
        
        //Se eleva a exponente 5 
        float op1 = (float) Math.pow(x+y*z,5);
        //Se obtiene el resultado sacando la raiz de op1
        float resultado = (float) Math.sqrt(op1);
        
     
        System.out.println("El resultado de la operación es: " + resultado);
    }
	

	

}
