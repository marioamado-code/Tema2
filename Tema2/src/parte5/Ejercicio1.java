package parte5;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Introducimos la variable número que también será el contador

		int num = 1;

		// Creamos el escáner

		Scanner sc = new Scanner(System.in);

		// Introducimos el do while

		do {

			// Imprimimos el número

			System.out.print(num);

			// Si el número no es 20 ponemos coma

			if (num < 20) {

				System.out.print(", ");

			}

			// Sumamos 1 al número

			num++;
			// Mientras el número sea menor o igual que veinte el bucle continúa
		} while (num <= 20);

		// Ahora ponemos el punto

		System.out.print(".");

		// Cerramos el escáner

		sc.close();

	}

}
