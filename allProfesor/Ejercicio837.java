package main;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio837 {

	
	public static boolean buscarElemento(int [] matriz, int buscado) {
		boolean encontrado=false;
		//for (int i=0;i<matriz.length && encontrado==false;i++) { --> MÁS EFICIENTE
		for (int i=0;i<matriz.length;i++) {
			if (buscado==matriz[i]) {
				encontrado=true;
			}
		}
		return encontrado;
	}
	
	
	public static void main(String[] args) {

		int [] matriz = {5,7,8,9,10,5,6,7,13,73,13};
		Scanner teclado = new Scanner(System.in);
		System.out.println("\nIntroduzca un número a buscar: ");
		int buscado = teclado.nextInt();
		boolean encontrado=false;
		encontrado=buscarElemento(matriz,buscado);
	
		if (encontrado) {
			System.out.println("El elemento " + buscado + " está en el array.");
		}else {
			System.out.println("El elemento " + buscado + " NO está en el array.");

		}
			
		for (int i=0;i<matriz.length;i++) {
			System.out.print("["+ matriz[i] +"]");
		}
	
	
	}

}
