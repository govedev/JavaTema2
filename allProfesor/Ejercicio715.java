package main;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio715 {

	public static void main(String[] args) {

		final int FILAS=100;
		final int COLUMNAS=100;
		int [][] numeros = new int[FILAS][COLUMNAS];
		Scanner teclado = new Scanner(System.in);
		Random generador = new Random();
		int contador=0;
		
		for (int i=0;i<FILAS;i++) {
			for (int j=0;j<COLUMNAS;j++) {
				numeros[i][j]=generador.nextInt(74);
			}
		}
		
		System.out.println("Introduzca el número a buscar: ");
		int buscado = teclado.nextInt();
		
		
		for (int i=0;i<FILAS;i++) {
			for (int j=0;j<COLUMNAS;j++) {
				//hacer algo
				if (numeros[i][j]==buscado) {
					contador++;
				}
			}
		}
		
		System.out.println("El número " + buscado + " aparece " + contador + " veces.");
		
		
		
		
		
	}

}
