package parte3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Introducimos variable año, dias y mes
		int dias;
		int mes;
		int anio;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario el número de mes
		System.out.println("Introduzca mes del 1 al 12");
		// Lo leemos del teclado
		mes = sc.nextInt();
		// Le pedimos al usuario el número de año
		System.out.println("Introduzca año");
		// Lo leemos del teclado
		anio = sc.nextInt();
		// Hacemos el switch con mes y yield para los dias
		dias = switch (mes) {
		// Para los de 31
		case 1, 3, 5, 7, 8, 10, 12 -> {
			yield 31;
		}
		// Para los de 30
		case 4, 6, 9, 11 -> {
			yield 30;
		}
		// Para febrero vemos si el año es bisiesto, que lo es si es divisible entre 4 y
		// no entre cien a no ser que sea divisible por 400 que entonces si puede ser
		// divisible entre cien
		case 2 -> {
			if (anio % 4 == 0 && (anio % 400 == 0 || anio % 100 != 0)) {
				yield 29;
			} else {
				yield 28;
			}

		}
		//Hacemos el default por si se pone un número incorrecto
		default -> {
			System.out.println("Error");
			yield -1;
		}
		//Cerramos el switch con punto y coma
		};
		//Escribimos por pantalla el resultado
		System.out.println("Dias del mes seleccionado en el año seleccionado :" + dias);
		//Cerramos el escáner
		sc.close();

	}
}
