package parte7;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Introducimos el primer número

		int numA;

		// Introducimos el segundo número

		int numB;

		// Creamos las variables para asociarlas a las anteriores

		int max;

		int min;
		//Introducimos un boolean para salir del for cuando encontremos el mcm
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

		// Ahora creamos el bucle for para ir viendo que numero puede ser multiplo

		// de los dos y no añadimos el maximo

		for (int i = max+1; i <=min*max; i++) {

			// Vemos si i es multiplo de los dos

			if (  i%max == 0 &&  i%min== 0) {
				//Imprimimos el resultado
				System.out.println(i + " es el mínimo común múltiplo de " + min + " y " + max);
				//Salimos del bucle si salir es true si no continuamos
				salir = true;

			}
			//fuera del if si salir es true se sale del for con un break
			if (salir == true) {

				break;

			}

		}

		// Cerramos el escáner

		sc.close();

	}

}
