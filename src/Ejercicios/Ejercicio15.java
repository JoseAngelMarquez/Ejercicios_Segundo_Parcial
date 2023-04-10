/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:	05/04/23	  *
 * Descripción:Dado un numero entre 1 *
 *             y 12 obtener el mes    *
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		//El usuario debe introducir un nùmero entre 1 y 12
        System.out.print("Introduce un número entre 1 y 12: ");
        int numeroMes = leer.nextInt();
        String nombreMes;

        //Determina el mes en base al numero introducido
        if (numeroMes >= 1 && numeroMes <= 12) {
            if (numeroMes == 1) {
                nombreMes = "Enero";
            } else if (numeroMes == 2) {
                nombreMes = "Febrero";
            } else if (numeroMes == 3) {
                nombreMes = "Marzo";
            } else if (numeroMes == 4) {
                nombreMes = "Abril";
            } else if (numeroMes == 5) {
                nombreMes = "Mayo";
            } else if (numeroMes == 6) {
                nombreMes = "Junio";
            } else if (numeroMes == 7) {
                nombreMes = "Julio";
            } else if (numeroMes == 8) {
                nombreMes = "Agosto";
            } else if (numeroMes == 9) {
                nombreMes = "Septiembre";
            } else if (numeroMes == 10) {
                nombreMes = "Octubre";
            } else if (numeroMes == 11) {
                nombreMes = "Noviembre";
            } else {
                nombreMes = "Diciembre";
            }
            //Imprime el mes al que corresponde el numero y en caso que no este el mes solo se imprime un mensaje
            System.out.println("El número corresponde al mes de " + nombreMes);
        } else {
            System.out.println("El número introducido no está en el rango de meses del año");
        }

	}

}
