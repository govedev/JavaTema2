package main;

public class Ejercicio836 {

	
	
	public static float calcularPromedio(float [] cal) {
		
		float prom=0.0f;
		float suma;
		suma=sumarElementos(cal);
		prom=suma/cal.length;
		
		return prom;
		
	}
	
	/* Hemos implementado este método para ser usado por calcularPromedio
	 * porque en clase se preguntó si un módulo podía llamar a otro módulo
	 * */
	public static float sumarElementos(float [] cal) {
		
		float suma=0.0f;
		for (int i=0;i<cal.length;i++) {
			
			suma = suma + cal[i];
		}
		return suma;
	}
	
	
	public static void main(String[] args) {

		/*
		 * Ejercicio propuesto 8.3.6: Calcular el promedio de calificaciones. 
		 * Escribe un programa en Java que calcule el promedio de un conjunto de 
		 * calificaciones. Debes crear un método llamado calcularPromedio que tome 
		 * un array de calificaciones como argumento y devuelva el promedio de las 
		 * calificaciones. Luego, en el método main, crea un array de calificaciones, 
		 * llama al método calcularPromedio y muestra el resultado en la consola.
		 * */
		float promedio;
		float [] calificaciones= {5.6f,7.9f,7.2f,2.6f,8.1f,4.8f,9.5f,8.2f,6.3f};
		
		promedio=calcularPromedio(calificaciones);
		
		System.out.println("El promedio es: " + promedio);
		


	}

	
	
	
}
