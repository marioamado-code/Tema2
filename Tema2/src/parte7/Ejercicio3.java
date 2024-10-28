package parte7;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Introducimos el primer número

		int numA;

		// Introducimos el segundo número

		int numB;

		// Creamos las variables para asociarlas a las anteriores

		int max;

		int min;
		//Creamos la variable salir para salir del bucle for
		boolean salir = false;

		// Introducimos el escáner

		Scanner sc = new Scanner(System.in);

		// Creamos un do while mientras no se pongan datos correctos

		do {

			// Pedimos al usuario el número a

			System.out.println("Introduzca primer número");

			// Lo leemos

			numA = sc.nextInt();

			// Pedimos al usuario el número b

			System.out.println("Introduzca segundo número");

			// Lo leemos

			numB = sc.nextInt();

			// Ahora imponemos los numeros que pueden ponerse o no

		} while (numB == numA || (numA <= 1 || numB <= 1));

		// Ahora asociamos el mayor y el menor a cada número

		if (numA > numB) {

			max = numA;

			min = numB;

		} else {

			max = numB;

			min = numA;

		}

		// Ahora creamos el bucle for para ir viendo que numero puede ser divisible

		// entre los dos

		for (int i = min / 2; i >= 1; i--) {

			// Vemos si i es divisible entre los dos

			if (min % i == 0 && max % i == 0) {
				//Si lo es lo imprimimos y si no se continua buscando
				System.out.println(i + " es el máximo común divisor de " + min + " y " + max);

				salir = true;

			}
			//Si salir es true no se sigue buscando y sale del for, sino continua
			if (salir == true) {

				break;

			}

		}

		// Cerramos el escáner

		sc.close();

	}

}
