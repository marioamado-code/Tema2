package parte4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Introducimos la variable número que cambia según lo que ponga el usuario

		int num = 0;

		// Introducimos la variable contador que cuenta los diferentes números

		int cont = 0;

		// Introducimos la variable suma que suma todos los números y los divide entre
		// el contador

		int suma = 0;

		// Introducimos la variable division que es el resultado

		float div = 0;

		// Creamos el escáner

		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca un número

		System.out.println("Introduzca número");

		// lo leemos del teclado

		num = sc.nextInt();

		// Hacemos el while para hacer el bucle si es mayor que 0 o igual.

		while (num >= 0) {

			// Aquí añadimos el contador que aumenta uno con cada número

			cont = cont + 1;

			// Añadimos el número a la suma

			suma = suma + num;

			

			// Pedimos otro número

			System.out.println("Introduzca otro número");

			// Lo leemos

			num = sc.nextInt();

			// De esta forma cuando salga un número negativo la operación será antes de

			// introducir este y no restará y saldrá del while

		}
		// Hacemos la operación con un cast para pasar de int a float

					div = (float) suma / cont;
		// Añadimos en la pantalla el resultado y el fin del programa

		System.out.println(div);

		System.out.println("Fin del programa");

		// Cerramos el escáner

		sc.close();

	}

}
