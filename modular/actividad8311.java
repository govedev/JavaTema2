/*
    Ejercicio propuesto 8.3.11: Factorial de un número. Escribe un programa en Java que calcule el factorial de un número entero.
    Debes crear un método llamado calcularFactorial que tome un número entero como argumento y devuelva su factorial.
    El factorial de un número entero n se calcula multiplicando todos los enteros desde 1 hasta n. En el método main, ingresa un número,
    llama al método calcularFactorial y muestra el resultado en la consola.

*/

public class actividad8311 {

    public static long factorial(int numero){

        long resultado = numero;

        for (int i = 2; i < numero; i++){

            resultado *= i;

        }

        return resultado;
    }

    public static void main(String[] args) {
        
        System.out.println(factorial(3));
    }
    
}
