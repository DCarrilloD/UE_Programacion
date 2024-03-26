import java.util.Scanner;

public class DiezNumeros {

	public static void main(String[] args) {
		double arrayNum [];
		Scanner sc= new Scanner(System.in);
		int cantidad, positivos=0, negativos=0;
	
		System.out.println("Dime cuantos números:");
		cantidad = sc.nextInt();
		arrayNum= new double[cantidad];
		
		//Preguntar las notas
		
		for (int i=0; i<arrayNum.length; i++) {
			System.out.println("Dime las "+cantidad+" que quieres incluir:");
			arrayNum[i]=sc.nextDouble();
		}
		
		for (int i=0; i<arrayNum.length; i++) {
			if (arrayNum[i]<0) {negativos++;}
			else {positivos++;}
		}
		System.out.println("el cantidad de números positivos son "+positivos);
		System.out.println("el cantidad de números negativos son "+negativos);
		}		
	}

