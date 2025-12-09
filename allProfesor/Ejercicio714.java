package main;

public class Ejercicio714 {

	public static void main(String[] args) {
		final int TAM = 3;
		int matriz [][] = {{5,7,9},{5,3,6},{15,4,3}};
		
		for (int i=0;i<TAM;i++) {
			float promedioFila = 0.0f;
			float sumaFila = 0.0f;
			System.out.print("Promedio fila " + i + ": ");
			for (int j=0;j<TAM;j++) {
				sumaFila=sumaFila + matriz[i][j];
			}
			promedioFila=sumaFila/TAM;
			System.out.print(promedioFila);
			System.out.println();
		}
		
		for (int i=0;i<TAM;i++) {
			float promedioColumna = 0.0f;
			float sumaColumna = 0.0f;
			System.out.print("Promedio columna " + i + ": ");
			for (int j=0;j<TAM;j++) {
				sumaColumna=sumaColumna + matriz[j][i];
			}
			promedioColumna=sumaColumna/TAM;
			System.out.print(promedioColumna);
			System.out.println();
		}
		
		
	}

}
