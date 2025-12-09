import java.util.Scanner;

public class actividad8315 {
    
    public static long calcularMCD(long numero1, long numero2){

        long numero;

        if (numero1 > numero2){ numero = numero1; }
        else if (numero1 < numero2){ numero = numero2; }
        else { numero = numero1; }

        for (long i = numero; i > 1; i--){

            if (numero1 % i == 0 && numero2 % i == 0){
                return i;
            }
        }

        return 0;
    }

    public static long calcularMCM (long numero1, long numero2){

        return (numero1*numero2)/(calcularMCD(numero1, numero2));
    }


    public static void main(String[] args) {
        
                Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número entero positivo: ");
        long numero1 = scanner.nextLong();

        System.out.print("Ingrese el segundo número entero positivo: ");
        long numero2 = scanner.nextLong();

        System.out.println(calcularMCM(numero1, numero2));

        scanner.close();
    }


}
