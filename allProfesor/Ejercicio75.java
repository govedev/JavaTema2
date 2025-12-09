package main;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio75 {

	public static void main(String[] args) {

		final int TAM=20;
		int [] numeros = new int[TAM];
		Scanner teclado = new Scanner(System.in);
		Random generador = new Random(); 
		/*A nextInt podemos pasarle cualquier 
		 * número de tipo int y el “comando” nos devolverá un número 
		 * aleatorio en 0 y ese número menos uno. 
		 * Con el “comando” nextInt(10) obtenemos 
		 * un número aleatorio entre 0 y 9*/
		for (int i=0;i<TAM/2;i++) {
			numeros[i] = generador.nextInt(21);
		}
		/*
		for (int i=0;i<500;i++) {
			System.out.println(i + ":["+numeros[i]+"]");
		}
		*/
		System.out.println("Indique operación: ");
		System.out.println("1.- Insertar nuevo número");
		System.out.println("2.- Buscar número");
		System.out.println("3.- Salir");
		System.out.println("4.- Mostrar array");
		
		
		int operacion=teclado.nextInt();
		int posicionInsercion=TAM/2;
		
		while(operacion!=3) {
			
			if (operacion==1) {
				if (posicionInsercion<TAM) {
					System.out.println("Introduzca número a insertar: ");
					numeros[posicionInsercion]=teclado.nextInt();
					posicionInsercion++;		
				}else {
					System.out.println("Tamaño máximo alcanzado");
				}
			
			}else if(operacion==2){
			
				System.out.println("Qué número busca?");
				int numeroBuscado=teclado.nextInt();
				boolean encontrado=false;
				
				for (int i=0;i<TAM;i++){
					if (numeroBuscado==numeros[i]) {
						System.out.println("Número encontrado en la posición " + i);
						encontrado=true;
					}
				}//HEMOS TERMINADO DE RECORRER EL ARRAY
				
				if (encontrado==false) {//  SI ENCONTRADO NO ESTÁ A TRUE
					System.out.println("Número NO encontrado.");
				}
			}	
			else if (operacion==4) {
				for (int i=0;i<TAM;i++) {
					System.out.println(i + ":["+numeros[i]+"]");
				}
				
			}else {
			
				System.out.println("ERROR: Operación no permitida.");
			}
			
			System.out.println("Indique operación: ");
			System.out.println("1.- Insertar nuevo número");
			System.out.println("2.- Buscar número");
			System.out.println("3.- Salir");
			System.out.println("4.- Mostrar array");
			
			operacion=teclado.nextInt();
				
		
		}
		
		System.out.println("PROGRAMA TERMINADO.");
		
		
		
		
		
		
	}

}
