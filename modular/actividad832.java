/*
    Ejercicio propuesto 8.3.2: Crea una función que calcule el menor de dos números enteros que recibirá como parámetros.
    El resultado será otro número entero.

*/


public class actividad832 {
   
    public static int comparar(int numero1, int numero2){

        if (numero1 > numero2){
            return numero2;
        }
        else {
            return numero1;
        }
    } 


    public static void main(String[] args) {
        System.out.println(comparar(20, 10));
    }
}
