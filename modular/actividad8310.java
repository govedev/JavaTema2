/*
 *Ejercicio propuesto 8.3.10: Invertir un array. Crea un programa en Java que invierta los elementos de un array.
 Debes crear un método llamado invertirArray que tome un array de números como argumento y devuelva un nuevo array con los elementos en orden inverso.
 En el método main, crea un array de números, llama al método invertirArray y muestra el array resultante en la consola.
 */

public class actividad8310 {


    public static int[] invertirArray(int array[]){

        int[] arrayinvertido = new int[array.length];

        for (int i=0; i < array.length; i++){

            arrayinvertido[(array.length-i-1)] = array[i];

        }

        return arrayinvertido;
    }

    public static void main(String[] args) {

        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] arrayinvertido = invertirArray(array);

        for (int i = 0; i < arrayinvertido.length; i++){
            System.out.println(arrayinvertido[i]);
        }
        
    }
    
}
