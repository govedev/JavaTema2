package main;
import java.util.Scanner;

public class Ejercicio71 {

	public static void main(String[] args) {
		
	
		final int TAMANYO=5;
		double [] numeros = new double[TAMANYO];
		double sumaNumeros=0.0;
		double media=0.0;		
		int contadorPorEncimaMedia=0;
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i=0;i<TAMANYO;i++) {
			System.out.println("Introduzca el número de la posición " + i + ":");		
			numeros[i] = teclado.nextDouble();
		}
		for (int i=0;i<TAMANYO;i++) {
			sumaNumeros=sumaNumeros+numeros[i];
		}
		media = sumaNumeros/TAMANYO;
		System.out.println("La media es: " + media);
		
		System.out.println("Los valores que están por encima de la media son: ");
		
		for (int i=0;i<TAMANYO;i++) {
			if (numeros[i]>media) {
				System.out.print(" " + numeros[i]);
				contadorPorEncimaMedia++;
			}
		}
		System.out.println();
		System.out.println("Hay " + contadorPorEncimaMedia + " por encima de la media.");
	}

}
