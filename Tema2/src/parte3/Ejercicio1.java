package parte3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos la variable número que pondrá el usuario
		int num;
		
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número
		System.out.println("Introduzca número del 0 al 9999");
		// Lo leemos del teclado
		num = sc.nextInt();
		// Ahora vemos si el número no está en el rango, si está hacemos los cálculos y
		// si
		// no ponemos un mensaje
		if (num > 9999 || num < 0) {
			System.out.println("Error");

		} else {
			// Ahora vemos si es capicua viendo los siguientes factores

			// si tiene una cifra lo es
			if (num > 0 && num < 10) {
				System.out.println(num + " es capicua");
			} else {
				// si tiene dos
				// cifras lo es si la división entre diez y el módulo entre diez son lo mismo,
				if (num > 10 && num < 100) {
					if (num / 10 == num % 10) {
						System.out.println(num + " es capicua");
					} else {
						System.out.println(num + " no es capicua");

					}
				}
				// con tres cifras si la division entre cien del numero y el modulo de
				// esa division entre diez son lo mismo,
				if (num > 100 && num < 1000) {
					if (num / 100 == (num % 100) % 10) {
						System.out.println(num + " es capicua");
					} else {
						System.out.println(num + " no es capicua");

					}
					// y por último cuatro cifras es si la
					// division entre mil es igual al modulo entre diez de la division del modulo
					// entre cien de la division que da el primer numero, y por otro lado
					// que tambien sean iguales la division entre cien del resto de la division
					// entre mil y la division entre diez del resto de la propia division anterior
				} else {
					if (1000 < num && num < 10000) {
						if (num / 1000 == (((num % 1000) % 100) % 10)
								&& (((num % 1000) / 100) == (((num % 1000) % 100) / 10))) {
							System.out.println(num + " es capicua");
						} else {
							System.out.println(num + " no es capicua");

						}
					}
				}
			}
			

		}
		// Cerramos el escáner
					sc.close();
	}
}
