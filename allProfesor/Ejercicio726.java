package main;

public class Ejercicio726 {

	public static void main(String[] args) {

		String cadena = "           Esto es una cadena de entrada   ";
		cadena = cadena.trim(); //Quita espacios por delante y detrás
		String cadenaSinEspacios = cadena.replace(" ","");
		System.out.println("Cadena de entrada: " + cadena);
		System.out.println("Cadena de salida: " + cadenaSinEspacios);
		
	}

}
