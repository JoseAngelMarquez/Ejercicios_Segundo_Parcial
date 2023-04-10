/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 03/04/23           *
 * Fecha Actualización:07/04/23	      *
 * Descripción:Area del circulo y  	  *
 * 			   volumen del cilindro   *
 **************************************/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio26 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		//El usuario ingresa el valor del radio
        System.out.println("Ingrese el radio del círculo:");
        double radio = leer.nextDouble();
        //Se usa la funciòn para calcular el àrea
        double areaCirculo = calcularAreaCirculo(radio);
        //Se imprime el valor del area
        System.out.println("El área del círculo es: " + areaCirculo);
        
        //El usuario ingresa el valor del radio del cilindro y la altura
        System.out.println("Ingresa el radio del cilindro:");
        radio = leer.nextDouble();
       
        System.out.println("Ingresa la altura del cilindro:");
        double altura = leer.nextDouble();
        
        //Llamamos a la funciòn para hacer la operaciòn
        double volumenCilindro = calcularVolumenCilindro(radio, altura);
        //Imprimimos el volumen
        System.out.println("El volumen del cilindro es: " + volumenCilindro);
    }
    
	//Funciòn para calcular el area del circulo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
    //Funciòn para imprimir volumen cilindro
    public static double calcularVolumenCilindro(double radio, double altura) {
        return calcularAreaCirculo(radio) * altura;

	}

}
