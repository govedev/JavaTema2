package main;
import java.util.Scanner;

public class Ejercicio79 {

	public static void main(String[] args) {
		
		final int TAM = 5;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la fila (1-5): ");
		int fila = teclado.nextInt();
		
		char [][] matriz = new char[TAM][TAM];
		
		for (int i=0;i<TAM;i++) {
			for (int j=0;j<TAM;j++) {
				
				if (i==fila-1) {
					matriz[i][j] = 'A';
				}else {
					matriz[i][j] = '.';
				}
				System.out.print("[" + matriz[i][j] + "]");

			}
			/*Acabamos de recorrer una fila, saltamos de línea*/
			System.out.println();
		}
				
	}

}
