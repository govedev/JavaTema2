import java.util.Scanner;

public class ejercicioalgo {
  

  public static void main(String[] args) {

    int contadorNoPrimos=0;
    int contadorUnos=0;

    Scanner sc = new Scanner(System.in);

    System.out.println("Filas: ");
    int filas = sc.nextInt();

    System.out.println("Columnas");
    int columnas = sc.nextInt();

    boolean[][] matrizBoleana = new boolean[filas][columnas];
    int[][] matriz = new int[filas][columnas];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        
        matriz[i][j] = (int) ((Math.random()*99) +1);
        if (matriz[i][j] < 10){
          System.out.print("[ " + matriz[i][j] + "]");
        }
        else{
          System.out.print("[" + matriz[i][j] + "]");
        }
      }
      System.out.println();
    }

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        int contador=0;

        if (matriz[i][j] == 1){
          contadorUnos++;
          matrizBoleana[i][j]=true;
          continue;
        }
        else{

          for (int n = 1; n <= Math.sqrt(matriz[i][j]); n++){

            if (matriz[i][j] % n == 0){
              
              contador++;

              if (contador > 1){

                contadorNoPrimos++;
                matrizBoleana[i][j]=true;
                break;

              }
            }
          }
        }
      }
      System.out.println();
    }


    int contadorPrimos = (filas*columnas)-contadorNoPrimos-contadorUnos;

    int[] todosLosPrimos = new int[contadorPrimos];
    int[] todosLosNoPrimos = new int[contadorNoPrimos+contadorUnos];

    System.out.println(contadorPrimos);

    System.out.println("Matriz de números primos");
    for (int i = 0, n = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        
        if (matrizBoleana[i][j]){
          System.out.print("[ " + 0 + "]");
        }
        else if (!matrizBoleana[i][j]){

          if (matriz[i][j] < 10){
            System.out.print("[ " + matriz[i][j] + "]");
          }
          else{
            System.out.print("[" + matriz[i][j] + "]");
            todosLosPrimos[n] = matriz[i][j];
            n++;
          }
        }

      }
      System.out.println();
      
    }




    System.out.println("Matriz de números no primos");
    for (int i = 0, n = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        
        if (matrizBoleana[i][j]){

          if (matriz[i][j] < 10){
            System.out.print("[ " + matriz[i][j] + "]");
          }
          else{
            System.out.print("[" + matriz[i][j] + "]");
            todosLosNoPrimos[n] = matriz[i][j];
            n++;
          }
        }
        else {
          System.out.print("[ " + 0 + "]");
        }

      }
      System.out.println();
      
    }

    
    System.out.print("Array de números primos: [");
    for (int i : todosLosPrimos) {
      System.out.print(i + ", ");
    }
    System.out.println("]");


    System.out.print("Array de números no primos: [");
    for (int i : todosLosNoPrimos) {
      System.out.print(i + ", ");
    }
    System.out.println("]");



    sc.close();
  }

}
