/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:04/04/23	      *
 * Descripción:Formula de 2º grado    *
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        
        // Leemos los coeficientes que seràn introducidos por el usuario
        System.out.print("Ingrese el coeficiente a: ");
        double a = leer.nextDouble();
        System.out.print("Ingrese el coeficiente b: ");
        double b = leer.nextDouble();
        System.out.print("Ingrese el coeficiente c: ");
        double c = leer.nextDouble();
        
        // Calculamos la solución de la ecuación de segundo grado
        double discriminante = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        
        // Mostramos el valor de ambos valores de x
        System.out.println("Las soluciones de la ecuación son:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
	}

}
