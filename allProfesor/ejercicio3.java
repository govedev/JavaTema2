package ejercicio3;
public class ejercicio3 {
  
  public static void inicializar(int[][] array){
    System.out.println("Array principal:\n\n");


    for (int i = 0; i < array.length; i++) {
      
      for (int j = 0; j < array.length; j++) {
        
        array[i][j] = (int) ((Math.random() * 25) + 1); 

        if (array[i][j] < 10){
          System.out.print("[ " + array[i][j] + "]");
        }
        else{
          System.out.print("[" + array[i][j] + "]");
        }
      }
      
      System.out.println();
    }
    
    System.out.println();
  }

  public static void diagonalPrincipal(int[][] array){
    System.out.println("Diagonal principal:\n");

    for (int i = 0; i < array.length; i++) {
      
      System.out.print("[" + array[i][i] + "]");
    }
    System.out.println("\n");
  }

  public static void diagonalSecundaria(int[][] array){
    System.out.println("Diagonal secundaria:\n");

    for (int i = 0; i < array.length; i++) {
      
      System.out.print("[" + array[i][array.length - i - 1] + "]");
    }
    System.out.println("\n");
  }

  public static void diagonalPrincipalInvertida(int[][] array){
    System.out.println("Diagonal principal invertida:\n");

    for (int i = 0; i < array.length; i++) {
      
      System.out.print("[" + array[array.length - i - 1][array.length - i - 1] + "]");
    }
    System.out.println("\n");
  }

  public static void diagonalSecundariaInvertida(int[][] array){
    System.out.println("Diagonal secundaria invertida:\n");

    for (int i = 0; i < array.length; i++) {
      
      System.out.print("[" + array[array.length - i - 1][i] + "]");
    }
    System.out.println();
  }




  public static void main(String[] args) {
    int[][] array = new int[5][5];
    inicializar(array);
    diagonalPrincipal(array);
    diagonalPrincipalInvertida(array);
    diagonalSecundaria(array);
    diagonalSecundariaInvertida(array);
  }
}
