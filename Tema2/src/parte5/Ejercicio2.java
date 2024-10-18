package parte5;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Introducimos el número que se irá mostrando, lo ponemos en 1 para que no
		// cuente el 0

		int num = 1;

		// Introducimos el escáner

		Scanner sc = new Scanner(System.in);

		// Introducimos el do while en el que se irá cambiando de número

		do {

			// Vemos si el número es par

			if (num % 2 == 0) {

				System.out.print(num + ", ");

			}

			// Para que se vea mejor por pantalla los separamos cada 20.

			if (num % 20 == 0) {

				System.out.println("");

			}

			// Sumamos uno al número

			num++;

		} while (num <= 200);

		// Cerramos el escáner

		sc.close();

	}

}
