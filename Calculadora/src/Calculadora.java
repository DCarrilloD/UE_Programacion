import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables y constantes
		double num1, num2,num3, num4,num5;
		int operacion;
		char letra;
		Scanner sc = new Scanner (System.in);
		
		//Recogida de datos
		System.out.println("Dime un número");
		num1=sc.nextDouble();
		System.out.println(num1);
		
		System.out.println("¿Qué operación quieres realizar?");
		System.out.println("1 - Sumar");
		System.out.println("2 - Restar");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		operacion=sc.nextInt();
		System.out.println(operacion);
		System.out.println("Dime otro número");
		num2=sc.nextDouble();
		System.out.println(num2);
		switch(operacion) {
			case 1: num3=num1+num2;
				System.out.println("El resultado de la suma es:");
				System.out.println(num3);
			break;
			case 2: num3=num1-num2;
				System.out.println("El resultado de la resta es:");
				System.out.println(num3);
			break;
			case 3: num3=num1*num2;
				System.out.println("El resultado de la multiplicación es:");
				System.out.println(num3);
			break;
			case 4: num3=num1/num2;
				System.out.println("El resultado de la división es:");
				System.out.println(num3);
		}
		System.out.println("¿Qué operación quieres realizar?");
		System.out.println("1 - Sumar");
		System.out.println("2 - Restar");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		operacion=sc.nextInt();
		System.out.println(operacion);
		System.out.println("Dime otro número");
		num5=sc.nextDouble();
		System.out.println(num5);
		switch(operacion) {
			case 1: num4=num3+num5;
				System.out.println("El resultado de la suma es:");
				System.out.println(num4);
			break;
			case 2: num4=num3-num5;
				System.out.println("El resultado de la resta es:");
				System.out.println(num4);
			break;
			case 3: num4=num3*num5;
				System.out.println("El resultado de la multiplicación es:");
				System.out.println(num4);
			break;
			case 4: num4=num3/num5;
				System.out.println("El resultado de la división es:");
				System.out.println(num4);
				
				}
			
			}
		}
	


