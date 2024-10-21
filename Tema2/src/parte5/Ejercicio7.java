package parte5;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Introducimos la variable numero 1

		float num1;

		// Introducimos la variable numero 2

		float num2;
		// Añadimos la variable resultado para las operaciones
		float resultado;
		// Añadimos el booleano para ver si sale o no
		boolean salir = true;

		// Creamos el escáner

		Scanner sc = new Scanner(System.in);
		do {
			// Pedimos al usuario el primer número

			System.out.println("Introduzca primer número");

			// Lo leemos del teclado

			num1 = sc.nextFloat();

			// Pedimos al usuario el segundo número

			System.out.println("Introduzca segundo número");

			// Lo leemos del teclado

			num2 = sc.nextFloat();

			// Mostramos el menú de operaciones
			System.out.println("Seleccione opción");
			System.out.println("A. SUMAR LOS NÚMEROS");
			System.out.println("B. RESTAR LOS NÚMEROS");
			System.out.println("C. MULTIPLICAR LOS NÚMEROS");
			System.out.println("D. DIVIDIR LOS NÚMEROS");
			System.out.println("E. FIN DEL PROGRAMA");
			// Leemos la opción del usuario
			char opcion = sc.next().charAt(0);

			// Realizamos la operación correspondiente
			switch (Character.toUpperCase(opcion)) {
			case 'A':
				resultado = num1 + num2;
				System.out.println("La suma da " + resultado);
				break;
			case 'B':
				resultado = num1 - num2;
				System.out.println("La resta da " + resultado);
				break;
			case 'C':
				resultado = num1 * num2;
				System.out.println("La multiplicación da " + resultado);
				break;
			case 'D':
				resultado = num1 / num2;
				System.out.println("La división da " + resultado);
				break;
			// Si da la e sale false y sale del programa
			case 'E':
				salir = false;
				// Si no ha escogido ninguna sale esto
				break;
			default:
				System.out.println("Opción incorrecta");

			}
		} while (salir);
		//imprimimos el fin del programa
		System.out.println(" FIN DEL PROGRAMA");
		sc.close();
	}

}
