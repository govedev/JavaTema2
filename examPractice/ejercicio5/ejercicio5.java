package ejercicio5;
public class ejercicio5 {
  
  public static int[] extraerFila(int[][] array, int indice) {
    
    int ceros[] = new int[5]; 
    if (indice > 4){
      return ceros;
    }

    int filaExtraida[] = array[indice];

    return filaExtraida;
  }

  public static int[] extraerColumna(int[][] array, int indice) {

    int ceros[] = new int[5]; 
    if (indice > 4){
      return ceros;
    }

    int columnaExtraida[] = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      
      columnaExtraida[i] = array[i][indice];
      
    }

    return columnaExtraida;
  }

  public static int[][] desplazarColumnas(int[][] array, int indice){
    System.out.println("Array con desplazamiento " + indice + ":\n");

    int filas = array.length;
    int columnas = array[0].length;

    int[][] arrayDesplazado = new int[filas][columnas];

    indice = (indice - 1) % columnas;
    if (indice < 0){ return null;}

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {

        int columnaNueva = (j + columnas - indice) % columnas;
        arrayDesplazado[i][columnaNueva] = array[i][j];
        
      }
      
    }



   
    return arrayDesplazado;
  }

  public static void main(String[] args) {
    
    int[][] matriz = new int[5][5];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {

        matriz[i][j] = (int) (Math.random()*21);
      }
    }

    System.out.println("Array:\n");
    for (int[] is : matriz) {
      for (int is2 : is) {
        if (is2 < 10){
          System.out.print("[ "+is2+"]");
        }
        else{
          System.out.print("["+is2+"]");
        }
      }
      System.out.println();
    }

    int[][] arrayDesplazado = desplazarColumnas(matriz, 6);

    for (int[] is : arrayDesplazado) {
      for (int is2 : is) {
        if (is2 < 10){
          System.out.print("[ "+is2+"]");
        }
        else{
          System.out.print("["+is2+"]");
        }
        
      }
      System.out.println();
    }
    
  }
}
