package main;

public class Ejercicio839 {

	public static int encontrarMaximo (int [] matriz) {
		
		int max=matriz[0]; //Suponer que el maximo provisional es el primer elemento
		for (int i=0;i<matriz.length;i++) {
			if (matriz[i]>max) {
				max=matriz[i];
			}
		}
		return max;
	}
	
	
	
	public static void main(String[] args) {

		int [] numeros = {0,0,0,0,0,12,7,3,6,0,5,7,6,6,6,2,2,1,3,3,0,0};

		int maximo = encontrarMaximo(numeros);
		
		System.out.println("El máximo es: " + maximo);
	}

}
