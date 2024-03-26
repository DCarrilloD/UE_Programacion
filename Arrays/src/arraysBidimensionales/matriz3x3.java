package arraysBidimensionales;

import java.util.Scanner;

public class matriz3x3 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner (System.in)) {
			final int FILAS=3, COLUMNAS=3;
			String matriz [][] = new String[FILAS][COLUMNAS];
			
			//Toma de datos
			System.out.println("Dime los números de la primera fila:");
			for (int i=0; i<COLUMNAS; i++) {
				matriz[0][i]=sc.next();			
			}
			System.out.println("Dime los números de la segunda fila:");
			for (int i=0; i<COLUMNAS; i++) {
				matriz[1][i]=sc.next();
			}
			System.out.println("Dime los números de la tercera fila:");
			for (int i=0; i<COLUMNAS; i++) {
				matriz[2][i]=sc.next();
}
			System.out.println("Los números guardados son los siguientes:");
			for (int i=0; i<COLUMNAS; i++) {
				System.out.print(matriz[0][i]+" ");
			}
			System.out.println();
			
			for (int i=0; i<COLUMNAS; i++) {
				System.out.print(matriz[1][i]+" ");
			}
			System.out.println();
			
			for (int i=0; i<COLUMNAS; i++) {
			System.out.print(matriz[2][i]+" ");		
			}
		}
		}
	}
	

