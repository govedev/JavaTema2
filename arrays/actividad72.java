package ARRAYS;
import java.util.Scanner;


public class actividad72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TAM = 8;
        int[] numeros = new int[TAM];
        int minimo = Integer.MAX_VALUE,
            maximo = Integer.MIN_VALUE,
            suma = 0;

        for (int i = 0; i < TAM; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println("El número mínimo es: " + minimo);
        System.out.println("El número máximo es: " + maximo);

    }
}
