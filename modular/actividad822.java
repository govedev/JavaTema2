/*
    Ejercicio propuesto 8.2.2: Crea un método llamado "dibujarCuadrado3x3", que dibuje un cuadrado formato por 3 filas con 3 asteriscos cada una.
    Crea también un "main" para comprobar que funciona correctamente.
*/

public class actividad822 {

    public static void dibujarCuadrado3x3() {
        for (int i=0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        dibujarCuadrado3x3();
    }
}
