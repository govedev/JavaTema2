package main;

public class Ejercicio713 {

	public static void main(String[] args) {

		/*
		 * Crea un programa que genere una matriz de dos dimensiones (5x5) 
		 * en la que todos los elementos fuera de la diagonal principal sean 0 
		 * y los elementos en la diagonal principal sean el número de la fila 
		 * en la que se encuentran.
		 */

		final int TAM=5;
		int matriz [][] = new int [TAM][TAM];
		for (int i=0;i<TAM;i++) {
			for (int j=0;j<TAM;j++) {
				if (i==j) {//cuando la fila sea igual a la columna
					matriz[i][j]=i; //insertamos el número de fila
				}
				if (matriz[i][j]<10) {
					System.out.print("[ "+matriz[i][j]+"]");
				}else{
					System.out.print("["+matriz[i][j]+"]");
				}
				
			}
			System.out.println();
		}
	}

}
