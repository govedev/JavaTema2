package main;

public class Ejercicio838 {
	
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
	
	public static int [] eliminarDuplicados(int [] duplicados) {
		
		int [] unicos = new int[duplicados.length];
	
		int j=0; //Con este índice recorreremos el array de únicos
		boolean ceroInsertado=false;
		
		/*Recorremos el array de duplicados*/
		for (int i=0;i<duplicados.length;i++) {
			
			/*Tenemos en cuenta el caso especial del cero, ya que aunque puede formar parte de los números que nos interesan, también está repetido en el array de unicos*/
			/*Si en el array de duplicados nos encontramos con un cero y aún no hemos insertado ninguno en únicos, cambiamos el valor del booleano y añadimos el 0 al array de unicos*/
			if (duplicados[i]==0 && !ceroInsertado) { //Aquí sólo va a entrar en la primera aparición de un 0 en duplicados
				unicos[j]=0; //Añadimos el cero al array de únicos. Esto sólo ocurrirá una vez
				j++; //Incrementamos el número de elementos insertados
				ceroInsertado=true; //Cambiamos el valor de la bandera para que no vuelva a entrar en este condicional para el resto de ceros
				
							
			}else { // El elemento de duplicados no es cero
				if (!buscarElemento(unicos,duplicados[i])) {  /*Buscamos el elemento en el array de unicos, usando el método del ejercicio anterior*/
						unicos[j]=duplicados[i]; //añadimos al array de unicos
						j++; //incrementamos la cantidad de elementos unicos
					}
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
		int [] conDuplicados = {0,0,0,0,0,12,7,3,6,0,5,7,6,6,6,2,2,1,3,3,0,0};
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
