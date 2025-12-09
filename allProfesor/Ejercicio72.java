package main;
import java.util.Scanner;

public class Ejercicio72 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		final int TAM=8;
		int max,min;
		int numeros [] = new int[TAM];
		for (int i=0;i<TAM;i++) {
			System.out.println("Introduzca el número de la posición " + i + ":");		
			numeros[i] = teclado.nextInt();
		}
		System.out.println();
		for (int i=0;i<TAM;i++) {
			System.out.print("[" + numeros[i] + "]");		
		}
		/*Suponemos que el maximo y minimo son el valor contenido
		 * en la primera casilla del array*/
		max=numeros[0];
		min=numeros[0];
		
		for (int i=0;i<TAM;i++) {
			if (numeros[i]>max) {
				max=numeros[i];
			}
			if(numeros[i]<min) {
				min=numeros[i];
			}
		}
		System.out.println();
		System.out.println("El máximo es " + max + " y el mínimo es: " + min);
		
		
		
		
	}

}
