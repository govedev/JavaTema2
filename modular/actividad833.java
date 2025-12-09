/*
    Ejercicio propuesto 8.3.3: Crea una función que devuelva la primera letra de una cadena de texto.
    Probar esta función para calcular la primera letra de la frase "Hola".

*/


public class actividad833 {

    public static char primeraLetra(String palabra){

        return palabra.charAt(0);

    }
    
    public static void main(String[] args) {
        System.out.println(primeraLetra("merengue"));
    }
}
