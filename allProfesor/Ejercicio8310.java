package main;

public class Ejercicio8310 {

	public static int [] invertirArray(int [] matriz) {
		int [] inv = new int[matriz.length]; 
		int j=0;
		for (int i = matriz.length-1;i>=0;i--) {
			inv[j]=matriz[i];
			j++;
		}
		return inv;
	}
	
		
	public static void main(String[] args) {

		int [] numeros = {12,7,3,6,0,5,7,6,6,6,2,2,1,3,3,73};
		for (int i=0;i<numeros.length;i++) {
			System.out.print("["+ numeros[i] +"]");
		}
	
		System.out.println();
		int [] invertido = invertirArray(numeros);
		for (int i=0;i<invertido.length;i++) {
			System.out.print("["+ invertido[i] +"]");
		}
	
		
		
		
	}

}
