package main;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio717 {

	public static void main(String[] args) {
		final int FILAS=6;
		final int COLUMNAS=4;
		int [][] numeros = new int[FILAS][COLUMNAS];
		Random generador = new Random();
		int contador=0;
		
		for (int i=0;i<FILAS;i++) {
			for (int j=0;j<COLUMNAS;j++) {
				numeros[i][j]=generador.nextInt(21);
			}
		}
		
		
		for (int i=0;i<FILAS;i++) {
			for (int j=0;j<COLUMNAS;j++) {
				if (numeros[i][j]<10) {
					System.out.print("[ " + numeros[i][j] + "]");
				}else { 
					System.out.print("[" + numeros[i][j] + "]");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		int [] contadores = new int[21];
				
		
		for (int i=0;i<FILAS;i++) {
			for (int j=0;j<COLUMNAS;j++) {
				//hacer algo
				contadores[numeros[i][j]]++;
				
			}
		}
		
		for (int i=0;i<contadores.length;i++) {
			if (contadores[i]!=0) {
				System.out.println("El número " + i + " aparecere " + contadores[i] +" veces.");
			}
				
		}
		
		
	}

}


