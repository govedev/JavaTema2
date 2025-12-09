package main;
import java.util.Scanner;

public class Ejercicio74 {

	public static void main(String[] args) {

		long [] numeros  = {11232,987654321,15698,123456789,856974,58965471,1598745,2369587,987987987,65498732};
	
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el número a buscar");
		long buscado = teclado.nextLong();
		boolean encontrado=false;
		
		while(buscado!=-1) {
			/*Recorrer el array para buscar el número*/

			for (int i=0;i<numeros.length;i++) {
				if(buscado==numeros[i]) {
					encontrado=true;
				}
			}
			if (encontrado==true) {
				System.out.println("El número ha sido encontrado");
			}else {
				System.out.println("El número NO ha sido encontrado");
			}
			
			System.out.println("Introduzca el número a buscar");
			buscado = teclado.nextLong();
			encontrado=false;
		}
		System.out.println("Programa terminado.");
	}

}
