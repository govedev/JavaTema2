package main;

import java.util.Scanner;

public class Ejercicio8313 {
	
	public static int calcularNumeroDivisores(int n) {
		int contadorDivisores=0;
		for (int i=1;i<=n;i++) {
			if (n%i==0) {
				contadorDivisores++;
			}
				
		}
		return contadorDivisores;
	}
	
	public static int [] calcularDivisores(int n) {
		
		int [] divisores = new int[calcularNumeroDivisores(n)];
		int j=0; // para recorrer el array de divisores
		for (int i=1;i<=n;i++) { //recorremos todos los numeros desde 1 hasta el numero dado
			if (n%i==0) { //si un numero es divisor
				divisores[j]=i; // guardamos ese numero en el array de divisores
				j++; //incrementamos el indice para guardar el siguiente divisor en la siguiente posicion
			}
				
		}
	
		return divisores;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int numero = teclado.nextInt();
		
		int [] divisores = calcularDivisores(numero);
		
		System.out.println("Los divisores de " + numero + " son: " );
		
		for (int i=0;i<divisores.length;i++) {
			System.out.print("["+divisores[i]+"]");
		}
		
		
	}

}
