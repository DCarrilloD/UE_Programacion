import java.util.Scanner;

public class Ej_Media_DavidCarrillo {
	public static void main(String[] args) {
		
	//Variables y Constantes
		String nombre;
		double matemáticas, lengua, inglés, sumaNotas, media;
		Scanner sc=new Scanner (System.in);
		
	//Petición de datos
		
		System.out.println("Vamos a calcular la media de tus notas:");
		System.out.println("¿Cual es tu nombre?");
		nombre=sc.next();
		System.out.println("¿Cual ha sido tu nota de lengua?");
		lengua=sc.nextDouble(); //Me ha sugerido directamente double ^^
		System.out.println("Ahora por favor, indícame tu nota en matemáticas");
		matemáticas=sc.nextDouble();
		System.out.println("Por último dime tu nota de inglés");
		inglés=sc.nextDouble();
		
	//Operaciones
		
		sumaNotas=matemáticas+lengua+inglés;
		media=sumaNotas/3;
		
	//Mostrar resultados
		
		System.out.println("Bienvenido "+nombre+":" +" Tu nota es:+"+media);
		
		//Quería aprovechar para probar condicional (me ha obligado a cambiar alguna cosa...)
		if (media>=5) {
			System.out.println("Enhorabuena, estás aprobado");
		}else{
			System.out.println("Suspenso, puedes hacerlo mejor");
		}
	}

}
