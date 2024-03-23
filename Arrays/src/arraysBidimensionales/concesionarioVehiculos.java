package arraysBidimensionales;

import java.util.Scanner;

public class concesionarioVehiculos {
	public static void main(String[] args) {
		
	int opcion;
	String matricula;
	final int FILAS = 100;
	final int COLUMNAS = 100;
	Scanner sc = new Scanner (System.in);
	String vehiculos [][] = new String[FILAS][COLUMNAS];
	System.out.println("Elige opción:");
	do {
		System.out.println("1. Dar de alta vehículo");
		System.out.println("2. Dar de baja vehículo");
		System.out.println("3. Modificar datos:");
		System.out.println("4. Salir");
		opcion = sc.nextInt();
			switch(opcion) {
			case 1: 	System.out.println("Dime la matrícula");
						matricula=sc.next();		
					for(int filas=0; filas<vehiculos.length;filas++) {
					if(vehiculos[filas][0]==null && vehiculos(filas][0]!=matricula)) {
						System.out.println("Dime la marca");
						vehiculos[filas][1]=sc.next();
						System.out.println("Dime el modelo");
						vehiculos[filas][2]=sc.next();
						System.out.println("Dime el color");
						vehiculos[filas][3]=sc.next();
						break;
				
			}
			
			}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4: System.out.println("Hasta pronto!");
				break;
			default: System.out.println("Incorrecto");
			}		
		}
	while (opcion!=4);
	}
}
