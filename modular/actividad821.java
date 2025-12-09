/*
    Ejercicio propuesto 8.2.1: Crea un método llamado "borrarPantalla", que borre la pantalla dibujando 25 líneas en blanco.
    No debe devolver ningún valor.
    Crea también un "main" que permita probarla.
*/

public class actividad821 {

    public static void borrarPantalla(){
        for (int i = 0; i < 50; i++){
                System.out.println("-");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hola que tal");
        borrarPantalla();
        System.out.println("hola dps");
        
    }
}
