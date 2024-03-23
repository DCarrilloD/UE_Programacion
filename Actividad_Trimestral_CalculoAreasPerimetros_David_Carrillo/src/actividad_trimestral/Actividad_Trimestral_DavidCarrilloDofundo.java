package actividad_trimestral;

	import java.util.Scanner;
	
		
	public class Actividad_Trimestral_DavidCarrilloDofundo {

		public static void main(String[] args) {
		
			//VARIABLES Y CONSTANTES INICIALES
			
			 double resultadoArea, resultadoPerimetro;
			 
			 Scanner sc = new Scanner(System.in);		

					
			//INICIO Y PETICION DE DATOS
					
			 
			        while (true) {
			            System.out.println("Bienvenido a la calculadora de áreas y perímetros");
			            System.out.println("Por favor, elige la opción que deseas:");
			            System.out.println("1. Círculo");
			            System.out.println("2. Cuadrado");
			            System.out.println("3. Rectángulo");
			            System.out.println("4. Triángulo");
			            System.out.println("5. Salir");

			            System.out.print("Introduce número de la opción (1-5): ");
			            int opcion = sc.nextInt();

			            if (opcion == 5) {
			                System.out.println("Muchas gracias, nos vemos pronto");
			                break;
			            }	           

		            switch (opcion) {
		                case 1:
		                    System.out.println("Introduce cuanto mide el radio del círculo en cm: ");
		                    double radioCirculo = sc.nextDouble();
		                    System.out.println("Para radio = "+radioCirculo+" cm");
		                    resultadoArea = Math.PI * radioCirculo * radioCirculo; // Pequeño comentario de aprendizaje, me ha abrumado leyendo sobre Class Math
		                    resultadoPerimetro = 2 * Math.PI * radioCirculo;
		                    break;
		                case 2:
		                    System.out.println("Introduce cuanto mide el lado del cuadrado en cm: ");
		                    double ladoCuadrado = sc.nextDouble();
		                    System.out.println("Para lado = "+ladoCuadrado+" cm");
		                    resultadoArea = ladoCuadrado * ladoCuadrado;
		                    resultadoPerimetro = 4 * ladoCuadrado;
		                    break;
		                case 3:
		                    System.out.println("Introduce cuanto mide la base del rectángulo en cm: ");
		                    double baseRectangulo = sc.nextDouble();
		                    System.out.println("Introduce cual es la altura del rectángulo en cm: ");
		                    double alturaRectangulo = sc.nextDouble();
		                    System.out.println("Para base = "+baseRectangulo+" cm y para altura ="+alturaRectangulo+" cm");
		                    resultadoArea = baseRectangulo * alturaRectangulo;
		                    resultadoPerimetro = 2 * (baseRectangulo + alturaRectangulo);
		                    break;
		                case 4:
		                    System.out.println("Introduce cuanto mide la base del triángulo en cm: ");
		                    double baseTriangulo = sc.nextDouble();
		                    System.out.println("Introduce cual es la altura del triángulo en cm: ");
		                    double alturaTriangulo = sc.nextDouble();
		                    System.out.println("Para base = "+baseTriangulo+" cm y para altura ="+alturaTriangulo+" cm, (Siempre que sea isósceles):");
		                    resultadoArea = 0.5 * baseTriangulo * alturaTriangulo;
		                    resultadoPerimetro = 2 * alturaTriangulo + baseTriangulo;  // Sólo nos sirve para triángulos isósceles
		                    break;
		                default:
		                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
		                    continue;
		            }
		            System.out.println("Área: " + resultadoArea + " cm²");
		            System.out.println("Perímetro: " + resultadoPerimetro+ " cm");
		            
		       System.out.println();
		       System.out.println(); 
		            }
		            
			        }
		}



		      
