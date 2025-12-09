package ejerciciostipoexamen;

import java.util.Scanner;

public class EjercicioCadenas2025 {

	public static void main(String[] args) {

		/*Escribe un programa en Java que:
1. Pida al usuario una frase.
2. Cuente cuántas veces aparece cada vocal (a, e, i, o, u), diferenciando entre mayúsculas
y minúsculas. (1 punto)
3. Identifique la palabra más larga de la frase. (1 punto)
4. Verifique si la frase es un palíndromo (se lee igual de izquierda a derecha que de
derecha a izquierda, ignorando espacios y mayúsculas). (1 punto)
Sólo se pueden usar los métodos de cadenas que hemos visto en clase*/
		
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca la frase: ");
		String frase = teclado.nextLine();
		int contadorA=0;
		int contadorE=0;
		int contadorI=0;
		int contadorO=0;
		int contadorU=0;
		
		
		
		for (int i=0;i<frase.length();i++) {
			if (frase.charAt(i)=='a' || frase.charAt(i)=='A' || frase.charAt(i)=='á' || frase.charAt(i)=='Á' ) {
				contadorA++;
			}if (frase.charAt(i)=='e' || frase.charAt(i)=='E' || frase.charAt(i)=='é' || frase.charAt(i)=='É') {
				contadorE++;
			}
			if (frase.charAt(i)=='i' || frase.charAt(i)=='I' || frase.charAt(i)=='Í' || frase.charAt(i)=='í') {
				contadorI++;
			}
			if (frase.charAt(i)=='o' || frase.charAt(i)=='O' || frase.charAt(i)=='ó' || frase.charAt(i)=='Ó') {
				contadorO++;
			}
			if (frase.charAt(i)=='u' || frase.charAt(i)=='U' || frase.charAt(i)=='Ú' || frase.charAt(i)=='ú') {
				contadorU++;
			}
		
			
			
			
		}
		System.out.println("Conteo de vocales: ");
		System.out.println("a: " + contadorA);
		System.out.println("e: " + contadorE);
		System.out.println("i: " + contadorI);
		System.out.println("o: " + contadorO);
		System.out.println("u: " + contadorU);	
		
		
 		frase = frase.trim();
		String [] palabras = frase.split(" ");
		//Otra forma de hacerlo --> String [] palabras = frase.trim().split(" ");
		System.out.println("Palabras de la frase: ");
		for (int i=0;i<palabras.length;i++) {
			System.out.println(palabras[i]);
		}
		int maximo=palabras[0].length();
		String palabraMasLarga=palabras[0];
		for (int i=0;i<palabras.length;i++) {
			if (palabras[i].length()>maximo) {
				maximo=palabras[i].length();
				palabraMasLarga=palabras[i];
			}
		}
		
		System.out.println("La palabra más larga es: " + palabraMasLarga + " con longitud " + maximo);
		frase = frase.replace(" ","");
		frase = frase.toUpperCase();
		
		boolean esPalindromo=true;
		for (int i=0;i<frase.length();i++) {
			if ((frase.charAt(i)!=frase.charAt(frase.length()-i-1))) {
				esPalindromo=false;
			}
		}
		 if (esPalindromo) {
			 System.out.println("Es un palíndromo");
		 }else {
			 System.out.println("No es un palíndromo");
		 }
		
	}

}
