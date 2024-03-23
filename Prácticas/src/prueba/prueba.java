package prueba;

import java.util.Scanner;

public class prueba {

    public static void main(String[] args) {
        // Variables y constantes
        double num1, num2, num3;
        String operacion;
        Scanner sc = new Scanner(System.in);

        // Petición de datos
        System.out.println("Dime un número");
        num1 = sc.nextDouble();
        System.out.println("Dime otro número");
        num2 = sc.nextDouble();
        sc.nextLine();  // Limpiar el buffer de entrada

        System.out.println("¿Qué operación quieres hacer? (+, -, *, /)");
        operacion = sc.nextLine();

        double resultado = 0;

        if (operacion.equals("+")) {
            resultado = num1 + num2;
        } else if (operacion.equals("-")) {
            resultado = num1 - num2;
        } else if (operacion.equals("*")) {
            resultado = num1 * num2;
        } else if (operacion.equals("/")) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Error: división por cero.");
                return;  // Salir del programa
            }
        } else {
            System.out.println("Operación no válida");
            return;  // Salir del programa
        }

        System.out.println("El resultado es: " + resultado);
    }
}