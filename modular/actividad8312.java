/*
    Ejercicio 8.3.12 - Número de Divisores: Escribe un programa modular en Java que, dado un número entero positivo, calcule y muestre la cantidad de divisores que tiene.
    Define una función llamada calcularNumeroDeDivisores que tome el número como argumento y devuelva el número de divisores.
    Luego, en el programa principal, solicita al usuario que ingrese un número y llama a la función para mostrar la cantidad de divisores.
    Un numero d es divisor de otro numero n si n%d es igual a cero.
*/


public class actividad8312 {
    
    public static int calcularNumeroDeDivisores(int numero){

        int contadorDeDivisores = 0;

        for (int i = 1; i <= numero; i++){

            if (numero % i == 0){

                contadorDeDivisores++;

            }

        }

        return contadorDeDivisores;
    }


    public static void main(String[] args) {

        System.out.println(calcularNumeroDeDivisores(12));
    }

}
