package main;

public class Ejercicio834 {

	public static char devolverUltimaLetra(String s) {
		char caracter = s.charAt(s.length()-1);
		return caracter;
	}
	
	public static void main(String[] args) {

		String cadena = "Hola";
		char ultimaLetra = devolverUltimaLetra(cadena);
		System.out.println("La última letra de la cadena " + cadena + " es " + ultimaLetra);
		
	}

}
