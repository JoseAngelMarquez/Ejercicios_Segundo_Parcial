/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:08/04/23	      *
 * Descripción:Suma digitos de un     *
 * 			   numero y suma total    * 
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio32 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int numero = 1;
        int sumaTotal = 0;
        int sumaDigitosTotal = 0;
        while(numero != 0) {
            System.out.print("Ingrese un número (0 para salir): ");
            numero = leer.nextInt();
            if(numero != 0) {
            	//Llamamos a la funciòn
                int sumaDigitos = sumarDigitos(numero);
                //Imprime la suma de todos los dìgitos de un solo numero mayor a 1 digito
                System.out.println("La suma de los dígitos es: " + sumaDigitos);
                sumaTotal += numero;
                sumaDigitosTotal += sumaDigitos;
            }
        }
        //Se imprime la suma total 
        System.out.println("La sumatoria de los números ingresados es: " + sumaTotal);
        System.out.println("La suma de los dígitos de todos los números ingresados es: " + sumaDigitosTotal);
    }
	//Funciòn para sumar los numeros ingresados y tambièn sumar los dìgitos de un solo numero mayor a un digito
    public static int sumarDigitos(int numero) {
        int suma = 0;
        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
	}

}
