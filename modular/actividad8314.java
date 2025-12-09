/**
 * Ejercicio 8.3.14
 * - Máximo Común Divisor (MCD): Crea un programa modular en Java que calcule el Máximo Común Divisor (MCD) de dos números enteros positivos.
 * Define una función llamada calcularMCD que tome dos números como argumentos y devuelva el MCD de esos dos números.
 * Luego, en el programa principal, solicita al usuario que ingrese dos números y llama a la función para mostrar el resultado del cálculo del MCD.
 */
import java.util.Scanner;

public class actividad8314 {

    public static long calcularMCD(long a, long b) {
    long temporal;
    while (b != 0) {
        temporal = b;
        b = a % b;
        a = temporal;
    }
    return a;
}


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número entero positivo: ");
        long numero1 = scanner.nextLong();

        System.out.print("Ingrese el segundo número entero positivo: ");
        long numero2 = scanner.nextLong();

        System.out.println(calcularMCD(numero1, numero2));

        scanner.close();
    }
}
