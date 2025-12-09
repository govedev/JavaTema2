package main;

import java.util.Scanner;

public class Ejercicio8314 {

	public static boolean buscarElemento(int [] matriz, int buscado) {
		boolean encontrado=false;
		//for (int i=0;i<matriz.length && encontrado==false;i++) { --> MÁS EFICIENTE
		for (int i=0;i<matriz.length;i++) {
			if (buscado==matriz[i]) {
				encontrado=true;
			}
		}
		return encontrado;
	}
	
	public static int calcularNumeroDivisores(int n) {
		int contadorDivisores=0;
		for (int i=1;i<=n;i++) {
			if (n%i==0) {
				contadorDivisores++;
			}
				
		}
		return contadorDivisores;
	}
	
	public static int [] calcularDivisores(int n) {
		
		int [] divisores = new int[calcularNumeroDivisores(n)];
		int j=0; // para recorrer el array de divisores
		for (int i=1;i<=n;i++) { //recorremos todos los numeros desde 1 hasta el numero dado
			if (n%i==0) { //si un numero es divisor
				divisores[j]=i; // guardamos ese numero en el array de divisores
				j++; //incrementamos el indice para guardar el siguiente divisor en la siguiente posicion
			}
				
		}
	
		return divisores;
	}
	
	public static int [] devolverComunes(int [] a, int [] b) {
		int tam;
		
		if (a.length<b.length) {
			tam=a.length;
		}else {
			tam=b.length;
		}
		
		int [] comunes = new int [tam];
		int j=0;
		if (a.length<b.length) {
			for (int i=0;i<a.length;i++) {
				if (buscarElemento(b,a[i])) {
					comunes[j]=a[i];
					j++;
				}
			}
			
		}else if (a.length>=b.length) {
			for (int i=0;i<b.length;i++) {
				if (buscarElemento(a,b[i])) {
					comunes[j]=b[i];
					j++;
				}
			}
			
		}
		return comunes;
		
	}
	
	public static int encontrarMaximo (int [] matriz) {
		
		int max=matriz[0]; //Suponer que el maximo provisional es el primer elemento
		for (int i=0;i<matriz.length;i++) {
			if (matriz[i]>max) {
				max=matriz[i];
			}
		}
		return max;
	}
	private static int calcularMCD(int numero1, int numero2) {
		int [] divisoresNumero1 = calcularDivisores(numero1);
		int [] divisoresNumero2 = calcularDivisores(numero2);
		int [] arrayComunes = devolverComunes(divisoresNumero1,divisoresNumero2);
		return encontrarMaximo(arrayComunes);
	}
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int numero1 = teclado.nextInt();
		System.out.println("Introduzca otro número: ");
		int numero2 = teclado.nextInt();
				
		int mcd = calcularMCD(numero1,numero2);
		System.out.println("El MCD es: " + mcd);
		
		
	}

	

}
