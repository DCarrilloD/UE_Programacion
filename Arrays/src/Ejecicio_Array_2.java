import java.util.Scanner;

public class Ejecicio_Array_2 {

	public static void main(String[] args) {
		//VARIABLES
		int numArray [] = new int[10];
		Scanner sc=new Scanner(System.in);
		int positivo=0, negativo=0, cero=0;
		
		//Array para recoger datos
		System.out.println("Dime 10 números:");
		
		for (int i=0; i<numArray.length; i++) {
			numArray[i]=sc.nextInt();
			System.out.println("Añadido en la posición "+(i+1)+":");
			if (numArray[i]<0) {negativo++;}
				else if (numArray[i]>0) {positivo++;}
				else if (numArray[i]==0) {cero++;}
			}
		System.out.println ("Números positivos ="+positivo);
		System.out.println ("Números negativos ="+negativo);
		System.out.println ("Igual a cero = "+cero);
		
		}

	}


