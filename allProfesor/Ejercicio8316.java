package main;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8316 {

	public static String inicializarAdivinada(int longitud) {
		String palabra ="";
		for (int i=0; i < longitud;i++) {
			palabra = palabra + "_";
		}
		return palabra;
	}
	
	public static void mostrarAdivinada(String palabra) {
		for (int i=0; i < palabra.length();i++) {
			System.out.print(palabra.charAt(i) + " ");
		}
		System.out.println();
	}
	
	public static String actualizarPalabraAdivinada(String palabraAdivinada, String letraIntento,
			String palabraSecreta) {
		
		String cadenaRetorno="";
		for (int i=0;i<palabraSecreta.length();i++) {
			if (palabraSecreta.substring(i,i+1).equals(letraIntento)) {
				cadenaRetorno = cadenaRetorno + letraIntento;
			}else {
				cadenaRetorno = cadenaRetorno + palabraAdivinada.substring(i, i+1);
			}
		}
		
		return cadenaRetorno;
	}
	
	public static void dibujarMonigote(int intentos) {
		
		if (intentos==1) {
		System.out.println(" ______ ");
		}
		if (intentos==2) {
			System.out.println(" ______ ");
			System.out.println(" |     |");

		}
		if (intentos==3) {
			System.out.println(" ______ ");
			System.out.println(" |     |");
			System.out.println(" O     |");
	        
		}
		if (intentos==4) {
			System.out.println(" ______ ");
			System.out.println(" |     |");
			System.out.println(" O     |");
	        System.out.println("/|\\   |");
		       
		}
		if (intentos==5) {
			System.out.println(" ______ ");
			System.out.println(" |     |");
			System.out.println(" O     |");
	        System.out.println("/|\\   |");
	        System.out.println("/ \\   |");
	         
		}
		if (intentos==6) {
			System.out.println(" ______ ");
			System.out.println(" |     |");
			System.out.println(" O     |");
	        System.out.println("/|\\   |");
	        System.out.println("/ \\   |");
	        System.out.println("       |");

		}
		
	}

	public static String seleccionarPalabraSecreta() {
		String palabra="";
		String [] palabrasSecretas = {"PROGRAMACION","PEZ","JAVA","ENTORNOS","PYTHON","AULA","TECLADO"};
		Random generador = new Random();
		int indice = generador.nextInt(0, palabrasSecretas.length);
		palabra = palabrasSecretas[indice];
		return palabra;
		
		
	}
	public static String leerLetra() {
		String validos = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca una letra: ");
		String letra = teclado.nextLine();
		letra=letra.toUpperCase();
		while (letra.length()>1 || !validos.contains(letra)) {
			System.out.println("Introduzca una letra: ");
			letra = teclado.nextLine();
			letra=letra.toUpperCase();
		}
		
	
		
		return letra;
		
		
	}
		
		
	public static void main(String[] args) {

		
		String palabraSecreta=seleccionarPalabraSecreta();
		String palabraAdivinada = inicializarAdivinada(palabraSecreta.length());
		final int MAX_INTENTOS = 6;
		int intentos=0;
		boolean palabraAcertada=false;
		int intentosRestantes=0;
		String letrasUsadas="";
		
		mostrarAdivinada(palabraAdivinada);
		
		while (intentos<MAX_INTENTOS && palabraAcertada==false) {
			
			if (palabraSecreta.equals(palabraAdivinada)) {
				palabraAcertada=true;
			}
			else {
			
			String LetraIntento = leerLetra();
			
			while (letrasUsadas.contains(LetraIntento)) {
				System.out.println("LETRA YA USADA: " + letrasUsadas);
				LetraIntento=leerLetra();
			}
			letrasUsadas = letrasUsadas + LetraIntento;

			
			if (palabraSecreta.contains(LetraIntento)) {
				palabraAdivinada=actualizarPalabraAdivinada(palabraAdivinada,LetraIntento,palabraSecreta);
				System.out.println("ACERTASTE! La letra sí está en la palabra secreta.");
				
				
			}else {
				System.out.println("Has fallado! La letra no está en la palabra secreta.");
				intentos++;
				dibujarMonigote(intentos);
				System.out.println();
			}
			mostrarAdivinada(palabraAdivinada);
			intentosRestantes=MAX_INTENTOS - intentos;
			System.out.println("Te quedan " + intentosRestantes + " intentos.");
		}
		
					
		}
		
		if (palabraAcertada==true) {
			System.out.println("HAS ACERTADO LA PALABRA SECRETA, QUE ERA " + palabraSecreta);
			
		}
		if (intentos>=MAX_INTENTOS) {
			System.out.println("HAS SUPERADO EL LÍMITE DE INTENTOS. LA PALABRA SECRETA ERA " + palabraSecreta);
		}
		
		dibujarMonigote(intentos);
		
		
		
	}

	
	

}
