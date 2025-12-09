package ARRAYS;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        
    float [] notasAlumnos = new float[200];

    for (int i = 0; i < notasAlumnos.length; i++) {
      System.out.print("Introduca la clasificación del alumno " + (i+1) + ": ");
      notasAlumnos[i]=sc.nextFloat();
    }
  }

}