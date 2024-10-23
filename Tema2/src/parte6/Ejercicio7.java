package parte6;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Introducimos el número que va a introducir el usuario

		int num;

		// Hay que crear un booleano que sirva para salir del bucle
		boolean salir = false;

		// Introducimos el escáner

		Scanner sc = new Scanner(System.in);
		do{
		// pedimos el numero

		System.out.println("Introduzca número positivo");

		// Lo leemos

		num = sc.nextInt();
		//Si no es positivo pedimos que lo vuelva a introducir mediante un do while
		}while(num<=0);
		// Introducimos el bucle for para ver si el resto del numero entre cualquier
		// otro número menor es 0, empezamos por su raiz y vamos bajando para encontrar
		// un divisor, ponemos mayor o igual que 2 en la condición para que no cuente el
		// 1 como divisor
		for (int i = (int) Math.sqrt(num); i >= 2 && salir == false; i--) {
			//Abrimos un ternario para cada número y si es true se sale del bucle
			salir = num % i == 0 ? true : false;
		}
		//Si es true lo imprimimos como no primo
		if (salir == true) {
			System.out.println(num + " no es primo");
		} else {
			//Y si no como primo
			System.out.println(num + " es primo");
		}
		// Cerramos el escáner

		sc.close();

	}

}
