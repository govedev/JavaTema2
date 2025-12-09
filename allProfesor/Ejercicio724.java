package main;

public class Ejercicio724 {

	public static void main(String[] args) {

		String cadena = "Esta es la cadena de entrada.";
		/*Suponemos que todas las palabras están separadas por un solo
		espacio en blanco*/
		String [] palabras = cadena.trim().split(" ");
		System.out.println("La cadena tiene " + palabras.length + " palabras.");
	}

}
