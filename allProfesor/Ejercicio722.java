package main;

public class Ejercicio722 {

	public static void main(String[] args) {
		
		String palabra = "isaac no ronca asi";
		palabra=palabra.replaceAll(" ",""); //reemplazamos los espacios por nada
		int longitud = palabra.length();
		
		boolean esPalindromo=true;
		
		for (int i=0;i<longitud && esPalindromo;i++) {
			if (palabra.charAt(i)==palabra.charAt(longitud-i-1)) {
				esPalindromo=true;
			}else {
				esPalindromo=false;
			}
		}//terminamos de recorrer la palabra
		
		if (esPalindromo==true) {
			System.out.println("Es un palíndromo.");
		}else {
			System.out.println("No es un palíndromo.");
		}

	}

}
