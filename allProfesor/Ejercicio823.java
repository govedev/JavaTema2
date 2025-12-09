package main;

public class Ejercicio823 {

	public static void dibujarCuadrado(int lado) {
		
		for (int i=0;i<lado;i++) {
			if (i==0 || i==lado-1) {
				for (int j=0;j<lado;j++) {
					System.out.print("*");
				}
					
			}else {
				System.out.print("*");
				for (int j=0;j<lado-2;j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
		
	public static void main(String[] args) {

		dibujarCuadrado(5);
		dibujarCuadrado(7);
		dibujarCuadrado(9);
		
	}

}
