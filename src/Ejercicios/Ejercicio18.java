/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:	4/04/23	      *
 * Descripción:Determinar segundos 	  *
 * 			   transcurridos en el dìa*
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la hora en formato de 12 horas (HH:MM:SS AM/PM): ");
        String horaStr = leer.nextLine();

        // Separar la hora, minutos, segundos y AM/PM de la cadena de entrada
        int hora = Integer.parseInt(horaStr.substring(0, 2));
        int minutos = Integer.parseInt(horaStr.substring(3, 5));
        int segundos = Integer.parseInt(horaStr.substring(6, 8));
        String amPm = horaStr.substring(9);

        // Calcular el número de segundos transcurridos desde el inicio del día
        int segundosTranscurridos = 0;

        if (amPm.equals("AM")) {
            if (hora == 12) {
                segundosTranscurridos = minutos * 60 + segundos;
            } else {
                segundosTranscurridos = hora * 3600 + minutos * 60 + segundos;
            }
        } else if (amPm.equals("PM")) {
            if (hora == 12) {
                segundosTranscurridos = hora * 3600 + minutos * 60 + segundos;
            } else {
                segundosTranscurridos = (hora + 12) * 3600 + minutos * 60 + segundos;
            }
        }

        System.out.println("Número de segundos transcurridos es de: " + segundosTranscurridos);

	}

}
