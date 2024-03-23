import java.util.Scanner;

public class PrimerEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		int vida=100, resta=20,suma=20,HPrestante,golpe,powerup,resto,multiplicación;
		String nombre;
		double mp=6.2;
		char letra='d';
		String palabra="David";
		boolean verdadero=false;
		//Constantes, SIEMPRE MAYÚSCULA
		final int VIDA_MAX=120;
		System.out.println(VIDA_MAX+mp+vida);
		System.out.println("Hola mundo");
		
		powerup=vida+suma;
		golpe=vida-resta;
		HPrestante=vida%resta;
		System.out.println(powerup);
		System.out.println(golpe);
		System.out.println(HPrestante);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");
		int edad= sc.nextInt();
		
		System.out.println(edad);
		System.out.println("Dime tu nombre");
		nombre=sc.next();
		System.out.println(nombre);
		
	}

}
