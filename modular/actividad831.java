/*
    Ejercicio propuesto 8.3.1: Crea una función que calcule el cubo de un número real (float) que se indique como parámetro.
    El resultado deberá ser otro número real.
    Probar esta función para calcular el cubo de 3.2 y el de 5.

 */

public class actividad831 {

    public static float calculoCubo(float numeroCubo) {

        return numeroCubo*numeroCubo*numeroCubo;
    } 

    public static void main(String[] args) {
        System.out.println(calculoCubo(3.2f));
        System.out.println(calculoCubo(5));
    }
    
}
