/*
    Ejercicio propuesto 8.3.0: Crea un método que dibuje en pantalla un rectángulo del ancho y alto que se indiquen como parámetros y que devuelva el área de dicho rectángulo.
    Completa el programa con un "main" que permita probarla. 

*/

public class actividad830 {

    public static int dibujarRectangulo(int ancho, int alto){

        int area = ancho*alto;
        return area;
    }
    
    public static void main(String[] args) {
        
        System.out.println(dibujarRectangulo(2, 5));
        
    }
}
