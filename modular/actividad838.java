/*
Ejercicio propuesto 8.3.8: Eliminar duplicados en un array.
Escribe un programa en Java que elimine los elementos duplicados en un array. Debes crear un método llamado eliminarDuplicados que tome un array de números como argumento
y devuelva un nuevo array sin elementos duplicados.
En el método main, crea un array con duplicados, llama al método eliminarDuplicados y muestra el array resultante sin duplicados en la consola.
Usar un método similar al creado en el ejercicio anterior para determinar si un elemento ya está en el array.
*/

public class actividad838 {
    

    public static int[] eliminarDuplicados(int array[]){

        boolean hayDuplicado = false;
        int contadorDeUnicos = 0;
        int arrayTemp[] = new int[array.length];
        int arraySinDuplicados[];

        for (int i = 0; i < array.length; i++){
            hayDuplicado=false;

            for (int j = 0; j < contadorDeUnicos; j++){

                if (array[i] == arrayTemp[j]){
                    hayDuplicado = true;
                    break;
                }

                hayDuplicado=false;
            }

            if (!hayDuplicado){
                arrayTemp[contadorDeUnicos] = array[i];
                contadorDeUnicos++;
                
            }
        }

        arraySinDuplicados = new int[contadorDeUnicos];

        for (int i = 0; i < contadorDeUnicos; i++){

            arraySinDuplicados[i] = arrayTemp[i];
            
        }



        return arraySinDuplicados;
    }


    public static void main(String[] args) {

        int arrayTemp[] = new int[10];
        int arrayDevuelto[];

        arrayTemp[0] = 1;
        arrayTemp[1] = 0;
        arrayTemp[2] = 2;
        arrayTemp[3] = 2;
        arrayTemp[4] = 0;
        arrayTemp[5] = 2;
        arrayTemp[6] = 2;
        arrayTemp[7] = 6;
        arrayTemp[8] = 2;
        arrayTemp[9] = 7;



        arrayDevuelto = eliminarDuplicados(arrayTemp);

        for (int i = 0; i < arrayDevuelto.length; i++){
            System.out.println(arrayDevuelto[i]);
        }
    }
}
