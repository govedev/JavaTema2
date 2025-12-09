package main;

public class Ejercicio711 {

	public static void main(String[] args) {
		
		final int TAM = 3;
		int matrizA [][] = {{5,7,9},{2,5,3},{8,1,9}};
		int matrizB [][] = {{6,8,0},{4,8,7},{6,4,7}};
		
		int matrizSuma [][] = new int [TAM][TAM];
		for (int i=0;i<TAM;i++) {
			for (int j=0;j<TAM;j++) {
				matrizSuma[i][j]=matrizA[i][j]+matrizB[i][j];
				
				if (matrizSuma[i][j]<10)
					System.out.print("[ "+matrizSuma[i][j]+"]");
				else
					System.out.print("["+matrizSuma[i][j]+"]");
			}
			System.out.println();
		}
		
	
		
	}

}
