package ejercicio6.methods;

public class metodos {
  
  public static String convertirH1(String cadenaUsuario){
    return "<h1>" + cadenaUsuario + "</h1>";
  }

  public static String convertirH2(String cadenaUsuario){
    return "<h2>" + cadenaUsuario + "</h2>";
  }

  public static String convertirParrafo(String cadenaUsuario){
    return "<p>" + cadenaUsuario + "</p>";
  }

  public static void mostrarHtml(String[] cadenasUsarioConvertidas){

    System.out.println("\n<!DOCTYPE html>\n<html lang=\"es\">\n<head>\n<meta charset=\"UTF-8\">\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n<title>Título de la Página</title>\n<!-- Enlaces a hojas de estilo, scripts u otros recursos -->\n</head>\n<body>");
    for (String string : cadenasUsarioConvertidas) {
      if (string == null){
        break;
      }
      System.out.println(string);
    }
    System.out.println("</body>\n</html>");

  }

}
