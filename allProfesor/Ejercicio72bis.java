package main;
import java.util.Scanner;

public class Ejercicio72bis {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		final int TAM=8;
		int max=0,min=0;
		int numeros [] = new int[TAM];
		
		
		for (int i=0;i<TAM;i++) {
			System.out.println("Introduzca el número de la posición " + i + ":");		
			numeros[i] = teclado.nextInt();
			if (i==0) { //en la primera iteración damos valor a max y min, con el primer valor introducido
				max=numeros[0];
				min=numeros[0];
			}
			
			if (numeros[i]>max) {
				max=numeros[i];
			}
			if(numeros[i]<min) {
				min=numeros[i];
			}
		}
		System.out.println();
		for (int i=0;i<TAM;i++) {
			System.out.print("[" + numeros[i] + "]");		
		}
		System.out.println();
		System.out.println("El máximo es " + max + " y el mínimo es: " + min);
		
		
		
		
	}
}
