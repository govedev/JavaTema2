

public class algo {
	
	public static boolean buscarElemento(int [] matriz, int buscado, int tamaño) {
		boolean encontrado=false;
		//for (int i=0;i<size && encontrado==false;i++) { --> MÁS EFICIENTE
		for (int i=0;i<tamaño;i++) {
			if (buscado==matriz[i]) {
				encontrado=true;
			}
		}
		return encontrado;
	}
	
	public static int [] eliminarDuplicados(int [] duplicados) {
		
		int [] unicos = new int[duplicados.length];
	
		int j=0;
		for (int i=0;i<duplicados.length;i++) {

			if (!buscarElemento(unicos,duplicados[i], j)) {
				   unicos[j]=duplicados[i];
				   j++;
			}
		}
		int [] unicosRecortado = new int [j];

		for (int i=0;i<unicosRecortado.length;i++) {
			unicosRecortado[i]=unicos[i];
		}		
		
		return unicosRecortado;
	}
	
	public static void main(String[] args) {
		/*Ejercicio propuesto 8.3.8: Eliminar duplicados en un array. 
		 * Escribe un programa en Java que elimine los elementos duplicados en un 
		 * array. Debes crear un método llamado eliminarDuplicados que tome un array 
		 * de números como argumento y devuelva un nuevo array sin elementos duplicados. 
		 * En el método main, crea un array con duplicados, llama al método 
		 * eliminarDuplicados y muestra el array resultante sin duplicados 
		 * en la consola. 
		 * Usar un método similar al creado en el ejercicio anterior 
		 * para determinar si un elemento ya está en el array.
		 */
		int [] conDuplicados = {0,7,3,6,0,5,7,6,6,6,2,2,1,3,3,0,0};
		for (int i=0;i<conDuplicados.length;i++) {
			System.out.print("["+ conDuplicados[i] +"]");
		}
	
		int [] sinDuplicados = eliminarDuplicados(conDuplicados);
		
		System.out.println();
		System.out.println("Sin duplicados: ");
		for (int i=0;i<sinDuplicados.length;i++) {
			System.out.print("["+ sinDuplicados[i] +"]");
		}
	
	
	
	}

}
