import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
//VARIABLES Y CONSTANTES INICIALES
		
		String operacion;
		double x,y;
		Scanner sc = new Scanner(System.in);
		char E = 1, S=0;
		char inicio=E; 
//PETICION DE DATOS
		
		do {
		System.out.println("Dime un número");
		x=sc.nextDouble();
		System.out.println(x);
		System.out.println("Dime qué operación quieres realizar");
		operacion=sc.next();
		System.out.println(operacion);
		System.out.println("Dime otro número");
		y=sc.nextDouble();
		
//VARIABLES Y OPERACIONES PARA SWITCH
		
		double a,b;
		a=Math.max(x, y); //establecemos variables para la resta (superior restado por inferior) 
		b=Math.min(x, y);
		String suma1, resta1, division1, multiplicacion1;
		suma1 = String.valueOf(x + y);
	    resta1 = String.valueOf(a - b);
	    multiplicacion1 = String.valueOf(x * y);
	    division1 = String.valueOf(x / y);
		
		switch (operacion) {
		case "+":
		case "sumar":
			System.out.println("El resultado de la suma es: "+suma1);
			System.out.println(suma1);
			break;
		
		case "-":
		case"restar":
			System.out.println("El resultado de la resta es: "+resta1);
			System.out.println(resta1);
			break;
			
		case "*":
		case "multiplicar":
			System.out.println("El resultado de la multiplicacion es: "+multiplicacion1);
			break;
			
		case "/":
		case "dividir":
			if (y==0) {System.out.println("Esta operación no es posible");} else {
			System.out.println("El resultado de la división es: "+division1);}
			break;
			
		default:
			System.out.println("Operación no válida");
		}
		System.out.println("Gracias por utilizar la calculadora");
		System.out.println();	
		System.out.println("¿Quieres hacer más operaciones?");
  
		System.out.println("Empezar          "+"Salir");
	inicio = sc.next().toUpperCase().charAt(0);
		} while(inicio==E);
		
	}

}


        
