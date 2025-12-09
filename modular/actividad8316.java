import java.util.Scanner;
/*
Ejercicio 8.3.16 El Juego del Ahorcado: El juego del ahorcado es un juego en el que un jugador debe adivinar una palabra oculta letra por letra.
El jugador tiene un número limitado de intentos para adivinar la palabra antes de que se complete un dibujo de un ahorcado.
Un ejemplo de cómo se mostraría el dibujo al terminar el juego sin éxito sería el siguiente:

            System.out.println(" ______ ");
            System.out.println(" |      |");
            System.out.println(" O    |");
            System.out.println(" /|\\    |");
            System.out.println(" / \\    |");
            System.out.println("        |");

Escribe un programa en Java para jugar al ahorcado. Aquí están los pasos básicos del juego:
El programa selecciona una palabra aleatoria de una lista de palabras predeterminadas.
El jugador tiene un número limitado de intentos para adivinar la palabra.
En cada intento, el jugador ingresa una letra.
El programa verifica si la letra está en la palabra oculta y muestra la palabra parcialmente adivinada.
Si la letra no está en la palabra, el programa resta un intento y muestra una parte del dibujo del ahorcado.
El juego continúa hasta que el jugador adivine la palabra o se quede sin intentos.

*/

public class actividad8316 {

  public static String[] eleccionPalabra() {

    String[] cadenaDePalabras = { "JAVA", "Programacion", "Modular", "RafikiPutero", "RafitaTieneUnPollon" };

    String[] palabraElegida = new String[2];

    palabraElegida[0] = cadenaDePalabras[(int) (Math.random() * cadenaDePalabras.length)];
    palabraElegida[1] = palabraElegida[0].toLowerCase();

    return palabraElegida;

  }

  public static void imprimirPalabra(boolean[] letrasAcertadas, String palabraElegidaNormal) {

    for (int i = 0; i < letrasAcertadas.length; i++) {

      if (letrasAcertadas[i]) {
        System.out.print(palabraElegidaNormal.charAt(i));
      }

      else {
        System.out.print("_");
      }

    }

    System.out.println();

  }

  public static void imprimirMonigote(byte intentos) {

    switch (intentos) {
      case 1:
        System.out.println(" ______ ");
        break;

      case 2:
        System.out.println(" ______ ");
        System.out.println(" |      |");
        break;

      case 3:
        System.out.println(" ______ ");
        System.out.println(" |      |");
        System.out.println(" O      |");
        break;

      case 4:
        System.out.println(" ______ ");
        System.out.println(" |      |");
        System.out.println(" O      |");
        System.out.println("/|\\     |");
        break;

      case 5:
        System.out.println(" ______ ");
        System.out.println(" |      |");
        System.out.println(" O      |");
        System.out.println("/|\\     |");
        System.out.println("/ \\     |");
        break;

      case 6:
        System.out.println(" ______ ");
        System.out.println(" |      |");
        System.out.println(" O      |");
        System.out.println("/|\\     |");
        System.out.println("/ \\     |");
        System.out.println("        |");
        break;

      default:
        System.out.println("Error.");
        break;
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    byte intentos = 0;
    boolean letraHaSidoAcertada = false;
    boolean ganado = false;
    boolean terminarPrograma = false;

    char usuario = ' ';

    String palabraElegida[] = eleccionPalabra();
    boolean[] letrasAcertadas = new boolean[palabraElegida[0].length()];

    System.out.println("Bienvenido al juego del ahorcado.");
    System.out.println("----------");

    imprimirPalabra(letrasAcertadas, palabraElegida[0]);

    while (!terminarPrograma) {
      ganado = true;
      letraHaSidoAcertada = false;

      System.out.println("Introduce una letra para comprobarla");
      try {
        usuario = sc.nextLine().charAt(0);
      } catch (Exception e) {
        System.out.println("Error al introducir la letra.");
        continue;
      }

      for (int i = 0; i < palabraElegida[0].length(); i++) {

        if (usuario == palabraElegida[1].charAt(i)) {

          letrasAcertadas[i] = true;
          letraHaSidoAcertada = true;

        }

      }

      imprimirPalabra(letrasAcertadas, palabraElegida[0]);

      if (!letraHaSidoAcertada) {

        intentos++;
        System.out.println("La letra introducida es incorrecta, te quedan " + (6 - intentos) + " intentos.");
        imprimirMonigote(intentos);

      }

      if (intentos == 6){

        System.out.println("Ha perdido, malo de los cojones.");
        terminarPrograma = true;

      }

      for (int i = 0; i < letrasAcertadas.length && ganado == true; i++){

        if (!letrasAcertadas[i]){
          ganado = false;
        }

      }

      if (ganado){

        System.out.println("Ha ganado, felicidades !!!");
        terminarPrograma = true;

      }

    }

    sc.close();

  }

}
