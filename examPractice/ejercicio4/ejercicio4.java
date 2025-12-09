package ejercicio4;
public class ejercicio4 {

  public static void primeraMayuscula(char[] arrayCaracteres){

    //Comprobamos si la posición 0 (La primera letra) es minuscula -->
    if (Character.isLowerCase(arrayCaracteres[0])){

      //Si esto es verdadero lo cambia a su misma letra pero en mayuscula.
      arrayCaracteres[0] = Character.toUpperCase(arrayCaracteres[0]);

    }
  }

  public static void mayusculaDespuesDePunto(char[] arrayCaracteres){

    
    for (int i = 2 /* Empieza en 2 pq sino al restarle luego 1 y 2 daria un error por "Out of bounds" */; i < arrayCaracteres.length; i++) {
      
      //Este "if" comprueba si 1. La letra es minuscula, 2. Si lo que tiene detras es un espacio y 3. Si lo que tiene dos detras es un '.' (punto). Ej: ". s" --> daria true
      if ((Character.isLowerCase(arrayCaracteres[i])) && (arrayCaracteres[i-1] == ' ') && (arrayCaracteres[i - 2]) == '.'){

        arrayCaracteres[i] = Character.toUpperCase(arrayCaracteres[i]);
      }

      //Este "if" comprueba si 1. La letra es minuscula, 2. Si lo que tiene detras es un '.' (punto). Ej: ".s" --> daria true
      //Esto esta puesto en caso de que la persona que esta escribiendo sea boba y escriba ".Hola" en vez de ". Hola".
      if ((Character.isLowerCase(arrayCaracteres[i])) && (arrayCaracteres[i-1] == '.')){

        arrayCaracteres[i] = Character.toUpperCase(arrayCaracteres[i]);
      }
    }
  }

  public static void puntoFinal (char[] arrayCaracteres){

    if (arrayCaracteres[arrayCaracteres.length -1] != '.'){
      System.out.println('.');
    }

  }


  public static void main(String[] args) {
    
    String cadenaUsuario = "hoy es viernes y estamos haciendo un examen. son las 19:30 de la tarde. la semana que viene es Navidad";
    System.out.println(cadenaUsuario);

    char[] cadenaUsuarioChar = new char[cadenaUsuario.length()];


    //Pasar el string a un array de caracteres.
    for (int i = 0; i < cadenaUsuarioChar.length; i++) {
      cadenaUsuarioChar[i] = cadenaUsuario.charAt(i);
    }

    primeraMayuscula(cadenaUsuarioChar);
    mayusculaDespuesDePunto(cadenaUsuarioChar);

    for (char c : cadenaUsuarioChar) {
      System.out.print(c);
    }
    puntoFinal(cadenaUsuarioChar);

    


  }


}
