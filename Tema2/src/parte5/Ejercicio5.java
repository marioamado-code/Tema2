package parte5;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Introducimos el numero maximo y el minimo que podra poner la maquina

		int numMax = 100;

		int numMin = 1;

		// Introducimos el random

		Random rand = new Random();

		// Introducimos el escáner

		Scanner sc = new Scanner(System.in);

		// Abrimos el do while

		do {

			// Ahora decimos si el número es mayor o menor que el objetivo

			// y obligamos a la máquina a moverse en el intervalo, mediante

			// el uso de poner más o menos
			// Introducimos en el do while el número random y el string para que se
			// actualicen

			int num = rand.nextInt(numMin, numMax);
			// Imprimimos el número
			System.out.println(num);
			String pista = sc.next();
			// Creamos el switch para cada opción y ponemos un break para que no haya error
			switch (pista) {
			// Si el número es mayor se le suma uno al menor del ratio random
			case "más":

				numMin = num + 1;

				break;
			case "menos":
				// Al reves para el máximo
				numMax = num - 1;

				break;
			// Cuando el numero maximo y minimo sean el mismo se sale del bucle, de esta
			// forma la consola puede mostrar el numero sin que pongamos igual si solo queda
			// uno
			case "igual":
				numMax = numMin;
			}

		} while (numMax != numMin);

		// Decimos que lo ha logrado, ponemos nummax pero podria ser tambien nummin

		System.out.println("Lo he logrado, adiviné tu número, tu número es " + numMax);

		// Cerramos el escáner

		sc.close();
	}
}
