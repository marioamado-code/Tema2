package parte7;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Introducimos la variable numero

		int num = 0;

		// Introducimos la variable numero inverso para el while, tambien la cifra y el

		// numero original

		int numInverso = 0;

		int cifra;

		int numOriginal = 0;

		// Introducimos la variable booleana para salir del bucle de la excepcion

		boolean error = false;

		// Introducimos el escáner

		Scanner sc = new Scanner(System.in);

		// Aqui ponemos la excepcion del numero

		do {

			try {

				System.out.println("Introduzca número ");

				// Lo leemos

				num = sc.nextInt();

				assert (num >= 0) : "El valor debe ser mayor o igual que cero";

				error = false;

			} catch (AssertionError e) {

				System.out.println(e.getMessage());

				error = true;

			} catch (InputMismatchException e) {

				System.out.println("El tipo no es entero");

				error = true;

			}

			sc.nextLine();

		} while (error);

		// Asociamos la variable numero original para evitar que al comparar despues el

		// num no sea 0

		numOriginal = num;

		// Creamos el while mientras el numero original no sea 0

		while (numOriginal != 0) {

			// Calculamos la cifra más pequeña

			cifra = numOriginal % 10;

			// Le damos la vuelta al numero

			numInverso = numInverso * 10 + cifra;

			// Vamos bajando de nivel

			numOriginal /= 10;

		}

		// Comparamos el numero creado con el original

		System.out.println(num == numInverso ? num + " es capicua" : num + " no es capicua");

		// Cerramos el escáner

		sc.close();

	}

}
