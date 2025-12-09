package ejerciciostipoexamen;

import java.util.Scanner;

public class EjercicioModulos2025 {

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
	public static void calcularSumaPrimos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca número 1: ");
		
		int numero1 = teclado.nextInt();
		System.out.println("Introduzca número 2: ");

		int numero2 = teclado.nextInt();
		int sumaPrimos=0;
		for (int i=numero1;i<=numero2;i++) {
			if (esPrimo(i)) {
				sumaPrimos = sumaPrimos + i;
				
			}
		}
		System.out.println("La suma de los primos comprendidos entre " + numero1 + " y " + numero2 + " es " + sumaPrimos);
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Seleccione una opción: ");
		System.out.println("1.- Suma de primos en un rango.");
		System.out.println("2.- Dígito más frecuente en un número.");
		System.out.println("3.- Verificar si un número es capicúa.");
		
		Scanner teclado = new Scanner(System.in);
		int opcion = teclado.nextInt();
		while (opcion!=4) {
			if (opcion==1) {
				calcularSumaPrimos();
			}
			else if (opcion==2) {
				digitoMasFrecuente();
			}else if (opcion==3) {
				esCapicua();
			}else {
				System.out.println("Opción incorrecta.");
			}
			System.out.println("Seleccione una opción: ");
			System.out.println("1.- Suma de primos en un rango.");
			System.out.println("2.- Dígito más frecuente en un número.");
			System.out.println("3.- Verificar si un número es capicúa.");
			System.out.println("4.- Salir");
			opcion = teclado.nextInt();
			
		
		}
		
		

	}
	private static void esCapicua() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca número: ");
		int numero = teclado.nextInt();
		int numeroOriginal=numero;
		int contadorDigitos=0;
		while(numero>0) {
			numero=numero/10;
			contadorDigitos++;
		}
		int [] digitos = new int [contadorDigitos];
		numero=numeroOriginal;
		int i=0;
		while(numero>0) {
			digitos[i]=numero%10;
			numero=numero/10;
			i++;
		}
		System.out.println();
		for (int j=0;j<digitos.length;j++) {
			System.out.print("[" + digitos[j] + "]");
		}
		int [] capicua = new int[digitos.length];
		for (int z=0;z<digitos.length;z++) {
			capicua[z]=digitos[digitos.length-z-1];
		}
		boolean esCapicua=true;
		for (int j=0;j<digitos.length;j++) {
			if (capicua[j]!=digitos[j]) {
				esCapicua=false;
			}
				
		}
		
		if (esCapicua) {
			System.out.println("ES CAPICUA");
		}else {
			System.out.println("NO ES CAPICUA");
		}
		
		
		
		
	}
	private static void digitoMasFrecuente() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca número: ");
		int numero = teclado.nextInt();
		int numeroOriginal=numero;
		int contadorDigitos=0;
		while(numero>0) {
			numero=numero/10;
			contadorDigitos++;
		}
		int [] digitos = new int [contadorDigitos];
		numero=numeroOriginal;
		int i=0;
		while(numero>0) {
			digitos[i]=numero%10;
			numero=numero/10;
			i++;
		}
		System.out.println();
		for (int j=0;j<digitos.length;j++) {
			System.out.print("[" + digitos[j] + "]");
		}
		
		System.out.println();
		int contadores [] = new int[10];
		for (int z=0;z<digitos.length;z++) {
			contadores[digitos[z]]++;
		}
		
		for (int z=0;z<contadores.length;z++) {
			System.out.print("[" + contadores[z] + "]");
		}
		System.out.println();
		
		int maximo=contadores[0];
		int posicionMaximo=0;
		for (int z=0;z<contadores.length;z++) {
			if (contadores[z]>maximo) {
				maximo=contadores[z];
				posicionMaximo=z;
			}
		}
		
		System.out.println("El digito que más se repite es el " + posicionMaximo);
		
	}
	
	

}
