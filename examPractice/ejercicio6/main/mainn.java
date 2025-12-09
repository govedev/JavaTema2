package ejercicio6.main;

import java.util.Scanner;
import ejercicio6.methods.metodos;

public class mainn {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i = 0;
    byte seleccionUsuario = 0;

    String cadenaUsuario = "";
    String[] cadenasUsuarioStrings= new String[100];

    while (!(seleccionUsuario == 4)) {
      System.out.println("Seleccione la operación a realizar:\n1.- Convertir a H1\n2.- Convertir a H2\n3.- Convertir en párrafo.\n4.- Terminar.\n");
      seleccionUsuario = sc.nextByte();

      if (!(seleccionUsuario==4)){
        System.out.print("Seleccion " + seleccionUsuario + " introduce la cadena de texto:");
        sc.nextLine();
        cadenaUsuario = sc.nextLine();
      }
      switch (seleccionUsuario) {
        case 1:
          cadenasUsuarioStrings[i] = metodos.convertirH1(cadenaUsuario);
          break;

        case 2:
          cadenasUsuarioStrings[i] = metodos.convertirH2(cadenaUsuario);
          break;

        case 3:
          cadenasUsuarioStrings[i] = metodos.convertirParrafo(cadenaUsuario);
          break;
        
        case 4:
          metodos.mostrarHtml(cadenasUsuarioStrings);
          break;
      
        default:
          break;
      }
      i++;
    }


    sc.close();
  }

}
