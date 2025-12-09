package main;

public class Ejercicio76 {

	public static void main(String[] args) {

		int vectorA [] = new int[3];
		int vectorB [] = new int[3];
		int productoVectorial [] = new int[3];
		vectorA[0]=7;
		vectorA[1]=5;
		vectorA[2]=3;
		
		vectorB[0]=9;
		vectorB[1]=6;
		vectorB[2]=3;
		
		int productoEscalar = vectorA[0]*vectorB[0] + vectorA[1]*vectorB[1] + vectorA[2]*vectorB[2];
		System.out.println("El producto escalar es: " + productoEscalar);
		productoVectorial[0]=vectorA[1]*vectorB[2] - vectorA[2]*vectorB[1];
		productoVectorial[1]=vectorA[2]*vectorB[0] - vectorA[0]*vectorB[2];
		productoVectorial[2]=vectorA[0]*vectorB[1] - vectorA[1]*vectorB[0];
		System.out.println();
		System.out.print("El producto vectorial es: ");
		System.out.print("[" + productoVectorial[0] +  "," + productoVectorial[1] + "," + productoVectorial[0] + "]");
	
	}

}
