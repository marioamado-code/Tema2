package parte4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Introducimos la variable número que cambia según lo que ponga el usuario

		int num = 0;

		// Introducimos la variable que cuenta los numeros totales, le ponemos un uno
		// porque la lectura de numero siempre va a ser antes que la suma del contador

		int cont = 1;

		// Introducimos la variable contador que cuenta los diferentes números en los

		// negativos

		int contNeg = 0;

		// Introducimos la variable suma que suma todos los números y los divide entre

		// el contador en los negativos

		int sumaNeg = 0;

		// Introducimos la variable division que es el resultado de la media de los

		// negativos

		float divNeg = 0;

		// Introducimos la variable que suma los positivos

		int sumaPos = 0;

		// Introducimos el contador de ceros

		int contCer = 0;

		// Creamos el escáner

		Scanner sc = new Scanner(System.in);

		// Hacemos el while para hacer el bucle si es menor o igual que 10 el contador.
		// Metemos dentro el print num porque no participa en el bucle activamente

		while (cont <= 10) {

			// Pedimos al usuario que introduzca un número

			System.out.println("Introduzca  número");

			// lo leemos del teclado
			num = sc.nextInt();

			// Para la suma de positivos

			if (num > 0) {

				// Aquí añadimos el número a la suma

				sumaPos = sumaPos + num;

			} else {

				if (num < 0) {

					// Aquí añadimos el contador que aumenta uno con cada número negativo

					contNeg = contNeg + 1;

					// Añadimos el número a la suma

					sumaNeg = sumaNeg + num;

				} else {

					contCer = contCer + 1;

				}

			}
			// Pedimos al usuario que introduzca un número

			cont = cont + 1;
		}
		// Hacemos la operación con un cast para pasar de int a float en los negativos
		// siempre que haya números negativos

		if (contNeg > 0) {
			divNeg = (float) sumaNeg / contNeg;
		} else {
			divNeg = 0;
		}

		// Mostramos los resultados
		System.out.println("La media de números negativos es " + divNeg + ", la suma de números positivos es " + sumaPos
				+ ", el número de ceros introducidos es " + contCer);
		// Cerramos el escáner

		sc.close();

	}

}
