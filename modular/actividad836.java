/*
    Ejercicio propuesto 8.3.6: Calcular el promedio de calificaciones.
    Escribe un programa en Java que calcule el promedio de un conjunto de calificaciones.
    Debes crear un método llamado calcularPromedio que tome un array de calificaciones como argumento y devuelva el promedio de las calificaciones.
    Luego, en el método main, crea un array de calificaciones, llama al método calcularPromedio y muestra el resultado en la consola.

*/

public class actividad836 {

    public static float calcularPromedio(float calificaciones[]){
        float total = 0;

        for (float cal : calificaciones){
            total += cal;
        }

        return total / calificaciones.length;
    }

    public static void main(String[] args) {
        float calificaciones[] = new float[100];

        for (int i = 0; i < calificaciones.length; i++){
            calificaciones[i] = (float) (Math.random() * 11);
        }

        System.out.println(calcularPromedio(calificaciones));


    }
    
}
