package main;

public class Ejercicio830 {

	
	public static int calcularAreaYDibujar(int ancho,int alto) {
		int area = ancho*alto;
		for (int i=0;i<alto;i++) {
			for (int j=0;j<ancho;j++) {
					System.out.print("*");
				}
			System.out.println();
			
			}
			
		return area;
	}

	
	
	
	
	public static void main(String[] args) {

		int ancho=4;
		int alto=6;
		int area=calcularAreaYDibujar(ancho,alto);
		System.out.println("El área es: " + area);
	}

}
