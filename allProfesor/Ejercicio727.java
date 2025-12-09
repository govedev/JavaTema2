package main;

public class Ejercicio727 {

	public static void main(String[] args) {

		String cadena = "Hola, esto es una cadena de prueba.";
		
		if (cadena.startsWith("Hola") || cadena.startsWith("hola"))
			System.out.println("La cadena empieza por Hola u hola");
		else
			System.out.println("La cadena no empieza por Hola ni hola");
	}

}
