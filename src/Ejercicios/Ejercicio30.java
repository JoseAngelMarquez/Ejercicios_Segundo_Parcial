/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:08/04/23	      *
 * Descripción:nummayor y total de    *
 * 			   numeros ingresados     * 
 **************************************/
package Ejercicios;
import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int maxSum = -1;
        int numMaxSum = 0;
        int numMenorSum = 0;
        //Numero introducido por el usuario
        System.out.print("Ingrese un número positivo (0 para terminar): ");
        int num = leer.nextInt();
        while (num != 0) {
            int sum = 0;
            int n = num;
            //Compara si el numero es mayor a 0
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            //Hace la sumatoria total
            if (sum > maxSum) {
                maxSum = sum;
                numMaxSum = num;
            }
            //Cuenta los dìditos que sumados no son mayores a 10
            if (sum < 10) {
                numMenorSum++;
            }
            System.out.print("Ingrese otro número positivo (0 para terminar): ");
            num = leer.nextInt();
        }
        System.out.println("El número con la sumatoria de dígitos máxima es: " + numMaxSum);
        System.out.println("La cantidad de números con sumatoria menor a 10 es: " + numMenorSum);

	}

}
