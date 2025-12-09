package ejercicio7;

public class ejercicio7 {

  public static boolean esFilaValida(int[][] sudoku, int filaUsuario){
    int fila = filaUsuario;
    boolean esCorrecto = true;

    int[] arrayQueSeRecorre = new int[sudoku[fila].length];
    //[0,1][0,2][0,3][0,4] --> 0 es la primera fila, lo que me diga el user

    for (int i = 0; i < sudoku[fila].length; i++) {
      arrayQueSeRecorre[i] = sudoku[fila][i]; 

    }

    for (int i = 0; i < arrayQueSeRecorre.length && esCorrecto; i++) {
      for (int j = 0; j < arrayQueSeRecorre.length && esCorrecto; j++) {
        if (i == j){
          continue;
        }

        if (arrayQueSeRecorre[i] == arrayQueSeRecorre[j]){
          esCorrecto=false;
        }
      }
    }

    return esCorrecto;
  }

    public static boolean esColumnaValida(int[][] sudoku, int columnaUsuario){
    int columna = columnaUsuario;
    boolean esCorrecto = true;

    int[] arrayQueSeRecorre = new int[sudoku.length];
    //[1,0][2,0][3,0][4,0] --> 0 es la primera columna, lo que me diga el user

    for (int i = 0; i < sudoku.length; i++) {
      arrayQueSeRecorre[i] = sudoku[i][columna]; 

    }

    for (int i = 0; i < arrayQueSeRecorre.length && esCorrecto; i++) {
      for (int j = 0; j < arrayQueSeRecorre.length && esCorrecto; j++) {
        if (i == j){
          continue;
        }

        if (arrayQueSeRecorre[i] == arrayQueSeRecorre[j]){
          esCorrecto=false;
        }
      }
    }

    return esCorrecto;
  }

  public static boolean esSubcuadroValida(int[][] sudoku, int inicioFila, int inicioColumna){
    boolean esCorrecto = true;

    int[] arrayQueSeRecorre = new int[sudoku.length];
    //[0,0][0,1][1,0][1,1] --> 0 es la primera fila, lo que me diga el user

    for (int i = inicioColumna, n = 0; i < inicioColumna+2; i++) {
      for (int j = inicioFila; j < inicioFila+2; j++, n++){

        arrayQueSeRecorre[n] = sudoku[(2+inicioColumna)-i][(2+inicioFila)-j];

      }
    }

    for (int i = 0; i < arrayQueSeRecorre.length && esCorrecto; i++) {
      for (int j = 0; j < arrayQueSeRecorre.length && esCorrecto; j++) {
        if (i == j){
          continue;
        }

        if (arrayQueSeRecorre[i] == arrayQueSeRecorre[j]){
          esCorrecto=false;
        }
      }
    }

    return esCorrecto;
  }

  public static boolean esTableroValido(int[][] sudoko){
    boolean verificacion=true;


    for (int i = 0; i < sudoko.length && verificacion; i++) {
      verificacion=esFilaValida(sudoko, 0);
    }

    for (int i = 0; i < sudoko.length && verificacion; i++) {
      verificacion=esColumnaValida(sudoko, 0);
    }

    for (int i = 0; i < sudoko.length/2 && verificacion; i++) {
      for (int j = 0; j < sudoko.length/2 && verificacion; j++) {
       
        verificacion=esSubcuadroValida(sudoko, i, j);

      }
    }
    


    return verificacion;
  }










  public static void main(String[] args) {
    
    int[][] sudoku = {{1,4,2,3},{3,2,4,1},{2,1,3,4},{4,3,1,2}};

    for (int[] is : sudoku) {
      for (int is2 : is) {
        
        System.out.print("[" + is2 + "]");




      }
      System.out.println(esFilaValida(sudoku, 1));
    }

    for (int i = 0; i < sudoku.length; i++) {
      for (int j = 0; j < sudoku[i].length; j++) {
        
        System.out.print("[ " + sudoku[i][j] + " ]");

      }
      System.out.println();
      System.out.println(esFilaValida(sudoku, i));
      System.out.println(esColumnaValida(sudoku, i));
      System.out.println(esSubcuadroValida(sudoku, 0, 0));
    }

    System.out.println(esTableroValido(sudoku));

  }

}
