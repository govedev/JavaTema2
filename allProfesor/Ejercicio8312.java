package main;

import java.util.Scanner;

public class Ejercicio8312 {

	public static int calcularNumeroDivisores(int n) {
		int contadorDivisores=0;
		for (int i=1;i<=n;i++) {
			if (n%i==0) {
				contadorDivisores++;
			}
				
		}
		return contadorDivisores;
	}
	
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int numero = teclado.nextInt();
		int divisores=calcularNumeroDivisores(numero);
		
		System.out.println("El numero " + numero + " tiene " + divisores + " divisores.");
		
		
	}

}
