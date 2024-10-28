package parte7;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Introducimos el primer número

		int num;

		// Introducimos el escáner

		Scanner sc = new Scanner(System.in);

		// Creamos un do while mientras no se pongan datos correctos

		do {

			// Pedimos al usuario el número 

			System.out.println("Introduzca  número");

			// Lo leemos

			num = sc.nextInt();

			// Ahora imponemos el numero que pueden ponerse y los que no

		} while (num > 20 || num < 1);

		// Creamos el bucle for en el que se irá aumentando tanto la i como la iteración
		// de la i
		for (int i = 1; i <= num; i++) {
			// Creamos otro bucle for relacionandolo con el anterior
			for (int j = 1; j <= i; j++) {
				// Aqui imprimimos la i tantas veces como esta diga
				System.out.print(i + " ");
			}
			// Para que salga en cada línea 1 debemos poner un ln vacio al final de cada
			// numero y fuera del segundo for
			System.out.println(" ");
			
		}
		// Cerramos el escáner
		sc.close();
	}

}
