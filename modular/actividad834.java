
/*
    Ejercicio propuesto 8.3.4: Crea una función que devuelva la última letra de una cadena de texto.
    Probar esta función para calcular la última letra de la frase "Hola".

 */

public class actividad834 {

    public static char ultimaLetra(String palabra){

        return palabra.charAt(palabra.length() - 1);

    }
    
    public static void main(String[] args) {
        System.out.println(ultimaLetra("merengue"));
    }
}
