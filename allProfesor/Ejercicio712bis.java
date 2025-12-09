package main;
import java.util.Random;

public class Ejercicio712bis {

	public static void main(String[] args) {
		
		final int TAM=3;
		int matriz [][] = new int[TAM][TAM];
		Random generador = new Random();
		int minimo = Integer.MAX_VALUE;
		/*Completamos la matriz con números aleatorios entre el 0 y el 16*/
		for (int i=0;i<TAM;i++) {
			for (int j=0;j<TAM;j++) {
				matriz[i][j] = generador.nextInt(51);
				if (matriz[i][j]<minimo) {
					minimo=matriz[i][j];
				}
				/*Mostramos la matriz por pantalla*/
				if (matriz[i][j]<10) {
					System.out.print("[ "+matriz[i][j]+"]");
				}else{
					System.out.print("["+matriz[i][j]+"]");
				}
			}
			System.out.println();
		}
	
		
		System.out.println("El mínimo es: " + minimo);
		
	}

}
