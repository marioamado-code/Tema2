package parte1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		// Introducimos la variable nota
		float nota;
		// Introducimos el escáner
		Scanner sc = new Scanner(System.in);
		//Pedimos la nota al usuario
		System.out.println("Introduzca nota");
		// La leemos por pantalla
		nota = sc.nextFloat();
		// Ahora vemos si la nota es posible, es decir que va entre 0 y 10
		// Si entra seguimos dividiendo y si no decimos que ha introducido un número
		// erróneo
		if (nota >= 0 && nota <= 10) {
			// Ahora diferenciamos entre aprobado y suspenso
			if (nota < 5) {
				// Lo mostramos por pantalla
				System.out.println(nota + " es suspenso");
				// Ahora diferenciamos entre suficiente y el resto
			} else if (nota < 6) {
				// Lo mostramos por pantalla
				System.out.println(nota + " es suficiente");
				// Ahora diferenciamos entre bien y el resto
			} else if (nota < 7) {
				// Lo mostramos por pantalla
				System.out.println(nota + " es bien");
				// Ahora diferenciamos entre notable y sobresaliente
			} else if (nota < 9) {
				// Lo mostramos por pantalla
				System.out.println(nota + " es notable");
				// Ahora queda el sobresaliente
			} else
				System.out.println(nota + " es sobresaliente");

		} else {
			System.out.println("Nota errónea");
		}

		//Cerramos el escáner
		sc.close();
	}
}
