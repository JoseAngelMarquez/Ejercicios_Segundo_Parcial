/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:	05/04/23	  *
 * Descripción:IMC de una persona     *
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio13_y_14 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
	      
		//Datos introducidos por el usuario
	      System.out.print("Ingrese su peso en libras: ");
	      double pesoLibras = leer.nextDouble();
	      
	      System.out.print("Ingrese su estatura en centimetros: ");
	      double estaturaCm = leer.nextDouble();
	      
	      // Convertir peso a kilogramos
	      double pesoKg = pesoLibras * 0.453592;
	      
	      // Convertir estatura a metros
	      double estaturaM = estaturaCm / 100.0;
	      
	      // Calcular el IMC
	      double imc = pesoKg / (estaturaM * estaturaM);
	      
	      // Mostrar el peso en kilogramos y el IMC
	      System.out.printf("Su peso en kilogramos es: %.2f kg\n", pesoKg);
	      System.out.printf("Su IMC es: %.2f\n", imc);
	      
	      // Clasificar el IMC de acuerdo con la OMS
	      if (imc < 16.0) {
	         System.out.println("Criterio de ingreso");
	      } else if (imc >= 16.0 && imc <= 16.9) {
	         System.out.println("Infrapeso");
	      } else if (imc >= 17.0 && imc <= 18.4) {
	         System.out.println("Bajo peso");
	      } else if (imc >= 18.5 && imc <= 24.9) {
	         System.out.println("Peso normal");
	      } else if (imc >= 25.0 && imc <= 29.9) {
	         System.out.println("Sobrepeso");
	      } else if (imc >= 30.0 && imc <= 34.9) {
	         System.out.println("Obesidad premórbida");
	      } else if (imc >= 40.0 && imc <= 45.0) {
	         System.out.println("Obesidad mórbida");
	      } else {
	         System.out.println("Obesidad hipermórbida");
	      }

	}

}
