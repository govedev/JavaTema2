package main;

import java.util.Scanner;

public class Ejercicio832 {

	public static int calcularMinimo(int n1,int n2) {
		int min=0;
		if (n1<n2) {
			min=n1;
		}
		else if (n2<n1) {
			min=n2;
		}
		else if (n1==n2) {
			min=n1; // o min=numero2;
		}
		
		return min;
	}
	
	
	public static void main(String[] args) {

		int numero1,numero2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Numero 1: ");
		numero1=teclado.nextInt();
		System.out.println("Numero 2: ");
		numero2=teclado.nextInt();
		
		
		int menor = calcularMinimo(numero1,numero2);
		
		if (numero1==numero2) {
			System.out.println("Son iguales");
		}else {
			System.out.println("El menor es: " + menor);
		}
		
		
	}

	

}
