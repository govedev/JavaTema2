package main;

public class Ejercicio714bis {

	public static void main(String[] args) {

		final int TAM = 3;
		int matriz [][] = {{5,7,9},{5,3,6},{15,4,3}};
		
		for (int i=0;i<TAM;i++) {
			
			float promedioFila = 0.0f;
			float sumaFila = 0.0f;
			float promedioColumna = 0.0f;
			float sumaColumna = 0.0f;
			
			for (int j=0;j<TAM;j++) {
				sumaFila=sumaFila + matriz[i][j];
				sumaColumna = sumaColumna + matriz[j][i];
			}
			promedioFila=sumaFila/TAM;
			promedioColumna=sumaColumna/TAM;
			
			System.out.print("Promedio fila " + i + ": ");
			System.out.print(promedioFila);
			System.out.println();
			System.out.print("Promedio columna " + i + ":");
			System.out.print(promedioColumna);
			System.out.println();
		}
				
	}

}
