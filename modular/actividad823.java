/*
    Ejercicio propuesto 8.2.3: Crea un método que dibuje en pantalla un cuadrado del ancho (y alto) que se indique como parámetro.
    Completa el programa con un "main" que permita probarla.

 */


public class actividad823{

    public static void dibujarCuadrado(int ancho){

        for (int i = 0; i < ancho; i++){
            for (int j = 0; j < ancho; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        dibujarCuadrado(2);
    }
}