package parte1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Introducimos la variable número 1
		int num1;
		// Introducimos la variable número 2
		int num2;
		// Introducimos la variable número 3
		int num3;
		// Introducimos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos los números al usuario el 1
		System.out.println("Introduzca primer número");
		// Lo leemos por pantalla
		num1 = sc.nextInt();
		// Pedimos los números al usuario el 2
		System.out.println("Introduzca segundo número");
		// Lo leemos por pantalla
		num2 = sc.nextInt();
		// Pedimos los números al usuario el 3
		System.out.println("Introduzca tercer número");
		// Lo leemos por pantalla
		num3 = sc.nextInt();
		// Pedimos que busque el número mayor y que vea si los otros dos se suman para
		// dar este
		if (num1 > num2 && num1 > num3) {
			if (num1 == num2 + num3) {
				System.out.println(num1 + " es la suma de " + num2 + " y " + num3);
			} else {
				System.out.println("No hay sumas de números");

			}
		} else {
			// Ahora vemos si el dos es el mayor
			if (num2 > num3 && num2 > num1) {
				if (num2 == num1 + num3) {
					System.out.println(num2 + " es la suma de " + num1 + " y " + num3);
				} else {
					System.out.println("No hay sumas de números");

				}

			} else {
				// Ahora vemos si el tercero es la suma de ambos números
				if (num3 == num1 + num2) {
					System.out.println(num3 + " es la suma de " + num1 + " y " + num2);
				} else {
					System.out.println("No hay sumas de números");
				}

			}
		}
		//Cerramos el escáner
		sc.close();
	}
}
