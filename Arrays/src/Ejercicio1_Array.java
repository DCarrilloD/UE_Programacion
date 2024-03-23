import java.util.Scanner;

public class Ejercicio1_Array {

	public static void main(String[] args) {
		double  arrayNotas [];
		Scanner sc = new Scanner (System.in);
		int notas, aprobados=0, suspensos=0;
				
		System.out.println("Cuantas notas necesitas almacenar?");
		notas = sc.nextInt();
		arrayNotas = new double [notas];
		
//preguntar las notas y guardarlas en mi array
		for (int i=0; i<arrayNotas.length; i++) {
		System.out.println("Dime la nota " +i+1);
		arrayNotas[i]=sc.nextDouble();
		}
		
//Recorrer el array para ver notas y saber si está suspenso o aprobado
		for (int i=0; i<arrayNotas.length; i++) {
			if (arrayNotas[i]<5) {
				suspensos++;
			} else aprobados++;
		}
		System.out.println("El numero de suspensos es = "+suspensos);
		System.out.println("El numero de aprobados es = "+aprobados);
		}
	}

