package main;

public class Ejercicio725 {

	public static void main(String[] args) {

		String cadena = "Esto es una cadena que contiene numeros como el 7 y caracteres especiales como el guión bajo _";
		String palabras [] = cadena.split(" ");
		
		int contadorCaracteres=0;
		for (int i=0;i<palabras.length;i++) {
			contadorCaracteres = contadorCaracteres + palabras[i].length();
		}
		
		System.out.println("La cadena de entrada tiene " + contadorCaracteres + " caracteres.");
		
	}

}
