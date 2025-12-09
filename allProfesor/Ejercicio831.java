package main;

import java.util.Scanner;

public class Ejercicio831 {

	public static float calcularCubo(float n) {
		
		float cubo=n*n*n;
		return cubo;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca número: ");
		float numero= teclado.nextFloat();
		float cubo = calcularCubo(numero);
		
		System.out.println("El cubo del número " + numero + " es " + cubo);
		teclado.close();
	}

}
