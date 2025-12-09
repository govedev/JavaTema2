package main;

public class Ejercicio723 {

	public static void main(String[] args) {

		String cadena = "Hola. EstO es Una CAdena.";
		String [] letras = cadena.split("");
		
		String resultado="";
		
		String minusculas = "abcdefghijklmnñopqrstuvwxyz";
		String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		
		for (int i=0;i<letras.length;i++) {
			if (minusculas.contains(letras[i])){
				//Es una minúscula
				resultado = resultado + letras[i].toUpperCase();
			}else if (mayusculas.contains(letras[i])) {
				resultado = resultado + letras[i].toLowerCase();
			}else {
				resultado = resultado + letras[i];
			}
			
		}
		System.out.println("Cadena de entrada: " + cadena);
		System.out.println("Cadena de salida: " + resultado);
		
		
	}

}
