package parte2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Introducimos la variable nota

		int nota;

		// Creamos el escáner

		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca la nota

		System.out.println("Introduzca nota del 1 al 10");

		// Lo leemos del teclado

		nota = sc.nextInt();

		// Abrimos el switch

		switch (nota) {

		case 0, 1, 2, 3, 4 -> {

			System.out.println("Suspenso");

		}

		case 5 -> {

			System.out.println("Suficiente");

		}

		case 6 -> {

			System.out.println("Bien");

		}

		case 7, 8 -> {

			System.out.println("Notable");

		}

		case 9, 10 -> {

			System.out.println("Sobresaliente");

		}

		}

		// Cerramos el escáner

		sc.close();

	}

}
