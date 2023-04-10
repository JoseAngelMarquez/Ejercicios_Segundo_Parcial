/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:08/04/23	      *
 * Descripción:Coordenadas del        *
 * 			   rectàngulo	          * 
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio28 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		//Datos introducidos por el usuario
        System.out.println("Ingrese la coordenada x del vértice superior izquierdo del rectángulo:");
        double x = leer.nextDouble();

        System.out.println("Ingrese la coordenada y del vértice superior izquierdo del rectángulo:");
        double y = leer.nextDouble();

        System.out.println("Ingrese el ancho del rectángulo:");
        double ancho = leer.nextDouble();

        System.out.println("Ingrese la altura del rectángulo:");
        double altura = leer.nextDouble();

        System.out.println("Ingrese la coordenada x del punto:");
        double xPunto = leer.nextDouble();

        System.out.println("Ingrese la coordenada y del punto:");
        double yPunto = leer.nextDouble();
        
        //Utilizamos la funciòn para hacer la comparaciòn  e imprimimos si esta o no
        if (estaDentroDelRectangulo(x, y, ancho, altura, xPunto, yPunto)) {
            System.out.println("El punto está dentro del rectángulo");
        } else {
            System.out.println("El punto está fuera del rectángulo");
        }
    }
	//Funciòn utilizada para saber si el punto que introdujo el usuario està dentro del rango
    public static boolean estaDentroDelRectangulo(double x, double y, double ancho, double altura, double xPunto, double yPunto) {
        return xPunto >= x && xPunto <= x + ancho && yPunto >= y && yPunto <= y + altura;
    
	}

}
