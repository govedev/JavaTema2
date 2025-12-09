package main;
import java.util.Scanner;

public class Ejercicio73bis {

	public static void main(String[] args) {

		int [] diasPorMes = {31,28,31,30,31,30,31,31,30,31,30,31};
		/*Alternativamente podríamos hacer: 
		int [] diasPorMes = new int[12];
		diasPorMes[0]=31;
		diasPorMes[1]=28;
		diasPorMes[2]=31;
		etc...*/
		boolean mesValido=false;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el número de mes: ");
		int mes = teclado.nextInt();
		
		if (mes >= 1 && mes <=12) 
			mesValido=true;
		
		while(mesValido) {
			mesValido=false;
			System.out.print("El mes introducido tiene: ");
			System.out.print(diasPorMes[mes-1]);
			System.out.println();
			System.out.println("Introduzca el número de mes: ");
			mes = teclado.nextInt();
			if (mes >= 1 && mes <=12)
				mesValido=true;
		}
		System.out.println("Programa terminado.");
		
	}

}
