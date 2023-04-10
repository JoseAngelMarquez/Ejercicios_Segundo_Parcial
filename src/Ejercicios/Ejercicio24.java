/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:07/04/23	      *
 * Descripción:Impresiòn primos 	  *
 * 			   hasta que se ingrese 0 * 
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int num = 0;
        int cont = 0;

        while (true) {
            System.out.println("Introduce un número mayor que 1 (presionar 0 para terminar el programa):");
            num = leer.nextInt();
            
            
            if (num == 0) {
                break;
            }
            //Se hace la respectiva operaciòn para saber si el nùmero es primo 
            int i;
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            //En caso de que si sea primo el contador suma +1
            if (i == num) {
                cont++;
            }
        }
        //Se imprimen los numeros primos
        System.out.println("Cantidad de números primos ingresados: " + cont);

	}

}
