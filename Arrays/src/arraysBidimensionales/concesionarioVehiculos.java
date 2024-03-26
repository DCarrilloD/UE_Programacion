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
					if(vehiculos[filas][0]==null && vehiculos[filas][0]!=matricula) {
						vehiculos[filas][0]=matricula;
						System.out.println("Dime la marca");
						vehiculos[filas][1]=sc.next();
						System.out.println("Dime el modelo");
						vehiculos[filas][2]=sc.next();
						System.out.println("Dime el color");
						vehiculos[filas][3]=sc.next();
						System.out.println("Se ha dado de alta el vehículo con matrícula: "+vehiculos[filas][0]+vehiculos[filas][1]+vehiculos[filas][2]);
						break;
			}
			
			}
				break;
			case 2:		System.out.println("Dime la matrícula");
					matricula=sc.next();		
					for(int filas=0; filas<vehiculos.length;filas++) {
					if(vehiculos[filas][0]!=null && vehiculos[filas][0].equals(matricula)) {
						vehiculos[filas][0]=null;
						vehiculos[filas][1]=null;
						vehiculos[filas][2]=null;
						vehiculos[filas][3]=null;
						System.out.println("Se ha dado de baja el vehículo");
						break;
					}	
		}
					break;
			case 3:		System.out.println("Dime la matrícula");
						matricula=sc.next();		
						for(int filas=0; filas<vehiculos.length;filas++) {
							if(vehiculos[filas][0]!=null && vehiculos[filas][0].equals(matricula)) {
								System.out.println("Dime la marca");
								vehiculos[filas][1]=sc.next();
								System.out.println("Dime el modelo");
								vehiculos[filas][2]=sc.next();
								System.out.println("Dime el color");
								vehiculos[filas][3]=sc.next();
								System.out.println("Se han modificado los datos del vehículo con matrícula: "+matricula);
								break;
								} else {System.out.println("El vehículo no se ha encontrado");
							break;}
					}
				
			case 4: System.out.println("Hasta pronto!");
				break;
			default: System.out.println("Incorrecto");
			}		
		}
	while (opcion!=4);
	}
}
