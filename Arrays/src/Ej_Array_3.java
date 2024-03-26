import java.util.Scanner;

// Ejercicio para guardar la altura de un número de personas, hallar la media y decir cuantos están por debajo y cuantas por encima.
public class Ej_Array_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidad, altos=0, bajos=0;
		double alturaArray[];
		double suma = 0.0, media=0.0;
		System.out.println("Dime el número de personas");
		
			while (!sc.hasNextInt() || (cantidad=sc.nextInt())<=0) {	
			System.out.println("Debe ser entero y positivo");
			sc.nextLine();	
		}		
			//Toma de datos de array
			
		alturaArray= new double [cantidad];
		System.out.println("Dime las alturas:");
		for(int i=0;i<alturaArray.length; i++) {
			alturaArray[i]=sc.nextDouble();
			suma +=alturaArray[i];
			System.out.println("Siguiente");
		}	
			//Toma media, compara a lo largo del array
		
		media=suma/cantidad;
		System.out.println("La media es: "+media);
			for (int i=0; i<alturaArray.length; i++) {
				if (alturaArray[i]<=media) {++bajos;}
				if (alturaArray[i]>=media) {++altos;}				
			}
		System.out.println("El número de personas altas es: "+altos);
		System.out.println("El número de personas bajas es: "+bajos);
		}
}
