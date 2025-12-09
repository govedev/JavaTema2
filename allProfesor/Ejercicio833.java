package main;

public class Ejercicio833 {

	public static char devolverPrimeraLetra(String cad) {
		char letra;
		letra=cad.charAt(0);
		return letra;
	}
	
	public static void main(String[] args) {

		/*
		 * Ejercicio propuesto 8.3.3: Crea una función que devuelva la primera letra 
		 * de una cadena de texto. Probar esta función para calcular la primera letra 
		 * de la frase "Hola".
		 */
		
		String cadena = "Hola";
		
		char primeraLetra = devolverPrimeraLetra(cadena);
		
		System.out.println("La primera letra de la cadena " + cadena + " es " + primeraLetra);
		
		
		
	}

}
