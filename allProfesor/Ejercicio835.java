package main;

import java.util.Scanner;

public class Ejercicio835 {

	public static boolean esPrimo(int num) {
		
		boolean primo=false;
		int cantidadDivisores=0;
		for (int divisor=1;divisor<=num;divisor++) {
			if (num%divisor==0) {
				cantidadDivisores++;
			}
		}
		
		if (cantidadDivisores==2) {
			primo=true;
		}
		return primo;
	}
	public static void main(String[] args) {

		/*Ejercicio propuesto 8.3.5: Crea una función "esPrimo", 
		 * que reciba un número y devuelva el 
		 * valor booleano "true" si es un número primo o "false" en caso contrario. 
		 * Hacer un main que pruebe la función con varios números, 
		 * algunos primos y otros no, mostrando un mensaje 
		 * por pantalla indicando si cada número es primo o no lo es.
		 * */
		int numero;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca numero: ");
		numero = teclado.nextInt();
		
		boolean primo = esPrimo(numero);
		
		if (primo) {
			System.out.println("El número es primo.");
		}else {
			System.out.println("El número no es primo.");

		}
		
		
	}

}
