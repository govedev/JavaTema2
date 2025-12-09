package main;

public class Ejercicio721 {

	public static void main(String[] args) {

		String frase = "De esta cadena, tenemos que contar cuantas veces aparece la a.";
		int contadorAes=0;
		for (int i=0;i<frase.length();i++) {
			if (frase.charAt(i)=='a') {
				contadorAes++;
			}
		}
		System.out.println("El caracter 'a' aparece " + contadorAes + " veces.");
		
	}

}
