package parte1;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		// Creamos las variables de los dos números y la variable de la división entre
		// ellos
		float num1;
		float num2;
		float div;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario los números
		System.out.println("Introduzca  primer número ");
		// Leemos el número
		num1 = sc.nextFloat();
		System.out.println("Introduzca segundo número ");
		// Leemos el número
		num2 = sc.nextFloat();
		// Vemos cual es mayor mediante una división que si es mayor que uno será el
		// primero y si es menor será el segundo
		div = num1 / num2;
		// Creamos una condición en la que si el cociente da menos de 1 se pone como
		// ultimo al segundo, y al contrario si da más de 1
		if (div < 1) {
			System.out.println(num1 + " , " + num2);
		} else {
			System.out.println(num2 + " , " + num1);
		}
		// Cerramos el escáner
		sc.close();
	}

}
