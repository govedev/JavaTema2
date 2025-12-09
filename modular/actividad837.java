/*
 * Ejercicio propuesto 8.3.7: Buscar un elemento en un array. Crea un programa que busque un elemento específico en un array.
 * Debes crear un método llamado buscarElemento que tome un array de números y un valor a buscar, y devuelva true si el valor está en el array o false si no lo está.
 * En el método main, crea un array de números y solicita por teclado un valor para buscar, llama al método buscarElemento y muestra un mensaje en la consola indicando si el valor se encuentra en el array o no.
 *
 */

import java.lang.reflect.Array;

public class actividad837 {

    public static boolean buscarArray(int lista[], int numeroABuscar){

        for (int i = 0; i < Array.getLength(lista); i++){
            if (lista[i] == numeroABuscar){
                return true;
            }
        }
        
        return false;

    }
    

    public static void main(String[] args) {
        int lista[] = new int[100];

        for (int i = 0; i < lista.length; i++){
            lista[i] = (int) (Math.random() * 101);
        }

        System.out.println(buscarArray(lista, 67));


    }
}
