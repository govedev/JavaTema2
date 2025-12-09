/*
 * Ejercicio propuesto 8.3.9: Encontrar el valor máximo en un array. Escribe un programa en Java que encuentre el valor máximo en un array de números.
 * Debes crear un método llamado encontrarMaximo que tome un array de números como argumento y devuelva el valor máximo en el array.
 * En el método main, crea un array de números, llama al método encontrarMaximo y muestra el valor máximo en la consola.
 */
public class actividad839 {

    public static int encontrarMaximoArray(int array[]){

        int maximo = Integer.MIN_VALUE;

        for (int i=0; i<array.length; i++){

            if (maximo < array[i]) {

                maximo = array[i];

            }

        }

        return maximo;
    }

    public static void main(String[] args) {

        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int maximo = encontrarMaximoArray(array);

        System.out.println(maximo);
    }


    
}
