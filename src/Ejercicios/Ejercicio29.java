/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:08/04/23	      *
 * Descripción:Extraer numeros        *
 * 			   a la izquierda         * 
 **************************************/
package Ejercicios;
import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		//Numero introducido por el usuario
        System.out.print("Ingrese un número: ");
        int N = leer.nextInt();
        //Ingresa cuantos digito se quieren extraer
        System.out.print("Ingrese la cantidad de dígitos a extraer: ");
        int K = leer.nextInt();
        //Llamamos a la funciòn para hacer la operaciòn
        int resultado = extraerDigitos(N, K);
        //Se imprime la cantidad de digitos desde la izquierda
        System.out.println(resultado);
    }
	//Funciòn para extraer los dìgitos
    public static int extraerDigitos(int N, int K) {
        String Convert = Integer.toString(N); // Convertir N a un String
        String extraccion = Convert.substring(0, K); // Obtener los primeros K caracteres
        int resultado = Integer.parseInt(extraccion); // Convertir el resultado a un entero
        return resultado;
    }
	

}
