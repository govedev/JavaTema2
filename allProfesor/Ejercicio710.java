package main;

public class Ejercicio710 {

	public static void main(String[] args) {

		final int TAM=5;
		char matriz [][] = new char [TAM][TAM];
				
		for (int i=0;i<TAM;i++) {
			for (int j=0;j<TAM;j++) {
				
				if (i==j) {
					matriz[i][j] = 'X';
				}else {
					matriz[i][j] = '.';
				}
				System.out.print("["+matriz[i][j]+"]");
			}
		System.out.println();
		
		}
	}

}
