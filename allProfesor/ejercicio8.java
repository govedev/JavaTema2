package ejercicio8;

import java.util.Scanner;

public class ejercicio8 {

  public static int contarPalabras(String string){
    int contador=1;

    if (string == ""){
      return 0;
    }

    for (int i=0; i<string.trim().length(); i++){
      if (string.charAt(i) == ' '){
        contador++;
      }
    }
    return contador;
  }

  public static String invertirFrase(String string){

    char[] algo = new char[string.length()];

    for (int i = 0; i < algo.length; i++) {

      algo[i] = string.charAt(string.length() - i - 1);
    }

    return new String(algo);
  }

  public static String vocalesMayusculas(String string) {
    
    char[] arrayDeCaracteres = string.toCharArray();
    char[] vocalesMin = {'a','e','i','o','u'};

    for (int i = 0; i < arrayDeCaracteres.length; i++) {
      for (int j = 0; j < vocalesMin.length; j++) {
        
        if (arrayDeCaracteres[i] == vocalesMin[j]){

          arrayDeCaracteres[i] = Character.toUpperCase(arrayDeCaracteres[i]);

        }

      }
    }

    return new String(arrayDeCaracteres);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    byte seleccionUsuario = 0;

    String usuario = "";
    System.out.print("Dime una frase panchito:");
    System.out.println();
    usuario = sc.nextLine();

    while (seleccionUsuario != 5){
      System.out.println("Elige una opción:\n1. Contar palabras\n2. Invertir frase\n3. Convertir vocales a mayúscula\n4. Introducir otra frase\n");
      seleccionUsuario = sc.nextByte();
      sc.nextLine();


      switch (seleccionUsuario) {
        case 1:
          System.out.println(contarPalabras(usuario));
          break;
        case 2:
          System.out.println(invertirFrase(usuario));
          break;
        case 3:
          System.out.println(vocalesMayusculas(usuario));
          break;
        case 4:
          System.out.println("Introduzca una nueva frase: ");
          usuario = sc.nextLine();
          break;      
        default:
          break;
      }
    }

    sc.close();
  }

}
