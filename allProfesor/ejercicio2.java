package ejercicio2;
import java.util.Scanner;

public class ejercicio2 {
  
  public static void main(String[] args) {
    int contadorHttps=0, contadorHttp=0;

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Pon cadena: ");
    String cadenaUsuario = sc.nextLine().trim().toLowerCase();

    String[] cadenasDeUsuario = cadenaUsuario.split(" ");

    for (String string : cadenasDeUsuario) {


      if (string.startsWith("https://")){
        contadorHttps++;

      } else if(string.startsWith("http://")){
        contadorHttp++;

      }
    }

    System.out.println("HTTPS: " + contadorHttps +"\nHTTP: " + contadorHttp);

    sc.close();
  }
}