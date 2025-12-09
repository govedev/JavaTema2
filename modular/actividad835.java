/*
 *Ejercicio propuesto 8.3.5: Crea una función "esPrimo", que reciba un número y devuelva el valor booleano "true" si es un número primo o "false" en caso contrario.
 Hacer un main que pruebe la función con varios números, algunos primos y otros no, mostrando un mensaje por pantalla indicando si cada número es primo o no lo es.

 */


public class actividad835 {

    public static boolean esPrimo(int numero){

        for (int i = 2; i < Math.sqrt(numero); i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(esPrimo(5));
        System.out.println(esPrimo(121));
        System.out.println(esPrimo(8));

    }

    

}