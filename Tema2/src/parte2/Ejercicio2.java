package parte2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Introducimos la variable día

		int dia;

		// Creamos el escáner

		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca la nota

		System.out.println("Introduzca día del 1 al 7");

		// Lo leemos del teclado

		dia = sc.nextInt();

		// Abrimos el switch

		switch (dia) {

		case 1 -> {

			System.out.println("LUNES");

		}

		case 2 -> {

			System.out.println("MARTES");

		}

		case 3 -> {

			System.out.println("MIÉRCOLES");

		}

		case 4 -> {

			System.out.println("JUEVES");

		}

		case 5 -> {

			System.out.println("VIERNES");

		}

		case 6 -> {

			System.out.println("SÁBADO");

		}

		case 7 -> {

			System.out.println("DOMINGO");

		}

		}

		// Cerramos el escáner

		sc.close();

	}

}
