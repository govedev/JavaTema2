package main;

public class Ejercicio77 {

	public static void main(String[] args) {

		/*Dado un array desordenado*/
		/*Obtener un array con los mismos numeros ordenados de forma ascendente*/
		final int TAM=10;
		final int inf = Integer.MAX_VALUE;
		final int MenosInf = Integer.MIN_VALUE;
		int [] desordenado = {7,2,8,14,1,6,15,0,23,12};
		int [] desordenado2 = {7,2,8,14,1,6,15,0,23,12};
		
		int [] ordenado = new int[TAM];
		int [] ordenadoDesc = new int[TAM];
		/*Mostramos el array desordenado*/
		System.out.print("Array desordenado: ");
		for (int i=0;i<TAM;i++) {
			System.out.print("["+desordenado[i]+"]");
		}
		
		/*Para rellenar el array ordenado vamos a buscar el mínimo 
		 * del desordenado y lo vamos a ir insertando en el ordenado.
		 * Cuando encontremos el mínimo, lo sustituiremos por la
		 * constante Integer.MAX_VALUE (es como sustituirlo por el valor INFINITO) 
		 * para que no vuelve a encontrarse como el mínimo*/
		
		/*Para cada posicion de ordenado, buscamos el mínimo en desordenado*/
		
		for (int i=0;i<TAM;i++) { //recorremos el array ordenado, que está vacío
			//y en cada posición vamos a ir colocando el mínimo del desordenado
			//hacemos la busqueda del minimo en el desordenado 
			int minimo=desordenado[0];
			int posicionMin=0;
			for (int j=0;j<TAM;j++) {
				
				if (desordenado[j]<minimo) {
					minimo=desordenado[j];
					posicionMin=j;
				}
			
			}
			
			
			desordenado[posicionMin]=inf;
			ordenado[i]=minimo;
			
		}
		System.out.println();
		System.out.print("Array ordenado: ");
		for (int i=0;i<TAM;i++) {
			System.out.print("["+ordenado[i]+"]");
		}
		
		
		
		int [] ordenadoD = new int[TAM]; 
		for (int i=0;i<TAM;i++) { //recorremos el array ordenado, que está vacío
			//y en cada posición vamos a ir colocando el mínimo del desordenado
			//hacemos la busqueda del minimo en el desordenado 
			int max=desordenado2[0];
			int posicionMax=0;
			for (int j=0;j<TAM;j++) {
				
				if (desordenado2[j]>max) {
					max=desordenado2[j];
					posicionMax=j;
				}
			
			}
			
			
			desordenado2[posicionMax]=MenosInf;
			ordenadoD[i]=max;
			
		}
		System.out.println();
		System.out.print("Array ordenado descendente: ");
		for (int i=0;i<TAM;i++) {
			System.out.print("["+ordenadoD[i]+"]");
		}
		
		
		
		
		
		
		
		
	}

}
