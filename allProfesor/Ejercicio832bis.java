package main;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio832bis {

	public static int[] crearArrayAleatorios(int tam, int limite) {
		int [] devuelto = new int [tam];
		Random generador = new Random();
		for (int i=0;i<tam;i++) {
			devuelto[i]=generador.nextInt(limite);
		}
		return devuelto;
	}

	public static void main(String[] args) {

		int tam;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Indique tamaño: ");
		tam=teclado.nextInt();
		System.out.println("Indique valor máximo: ");
		int limite = teclado.nextInt();
				
		int [] array1 = crearArrayAleatorios(tam, limite);
		
		System.out.println();
		
		for (int i=0;i<tam;i++) {
			System.out.print("[" + array1[i] +"]");
		}
		
		
	}

	
}
