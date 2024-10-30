package parte7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Introducimos la variable número, numero siguiente, contador de fallos y

		// contador de numeros

		int num = 0;

		int numSig = 0;

		int contFallo = 0;

		int contNum = 0;
		// Añadimos el boolean para salir del do while de la excepcion en el bucle y en
		// la primera lectura de datos
		boolean error = false;

		// Creamos el escáner

		Scanner sc = new Scanner(System.in);

		// Pedimos el número inicial y hacemos un try para posibles equivocaciones

		do {

			try {

				System.out.println("Introduzca número inicial");

				// Lo leemos

				num = sc.nextInt();

				assert (num > 0) : "El valor debe ser mayor que cero";

				error = false;

			} catch (AssertionError e) {

				System.out.println(e.getMessage());

				error = true;

			} catch (InputMismatchException e) {

				System.out.println("El tipo no es entero");

				error = true;

			} finally {

				sc.nextLine();

			}

		} while (error);

		// Si el numero es cero pasa del while

		while (num != 0) {

			// Pedimos el número siguiente y hacemos lo mismo que en el numero anterior
			// Ahora la condición del assert se hace con el numSig para evitar que no se
			// pueda salir del bucle
			do {

				try {

					System.out.println("Introduzca número");

					// Lo leemos

					numSig = sc.nextInt();

					assert (numSig >= 0) : "El valor debe ser mayor o igual que cero";

					error = false;

				} catch (AssertionError e) {

					System.out.println(e.getMessage());

					error = true;

				} catch (InputMismatchException e) {

					System.out.println("El tipo no es entero");

					error = true;

				} finally {

					sc.nextLine();

				}

			} while (error);

			// Creamos un if donde pedimos que el número siguiente sea menor para que el

			// contador de errores sume, y tambien que sea distinto de 0

			if (numSig < num && numSig != 0) {

				System.out.println("Fallo, es menor");

				// Le sumamos al contador del fallo uno

				contFallo++;

			}

			// Asociamos el nuevo número al antiguo

			num = numSig;

			// Sumamos el nuevo numero al contador

			contNum++;

		}

		// Imprimimos el número de fallos y el de numeros introducidos

		System.out.println("El número de fallos es de " + contFallo);

		System.out.println("El número de numeros introducidos es de " + contNum);

		// Cerramos el escáner

		sc.close();

	}

}
