package parte6;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Creamos la variable numero a
		int numA;
		// Creamos la variable número b
		int numB;
		// Introducimos las variables num max y num min que se le asignará a cada uno
		int numMax = 0;
		int numMin = 0;
		// Introducimos el escáner

		Scanner sc = new Scanner(System.in);

		// Pedimos el número A

		System.out.println("Introduzca número A");

		// Lo leemos

		numA = sc.nextInt();
		// Pedimos el número B

		System.out.println("Introduzca número B");

		// Lo leemos

		numB = sc.nextInt();
		//Creamos un if para asignar los números a máximo o mínimo
		if (numA > numB) {
			numMax = numA;
			numMin = numB;
		} else {
			numMin = numA;
			numMax = numB;
		}
		//Creamos el bucle for para imprimirb números en el intervalo
		for (int i = numMin; i <= numMax; i++) {
			System.out.print(i + ", ");
		}
		//Imprimimos fin para que no quede una coma
		System.out.println("fin");
		// Cerramos el escáner
		sc.close();
	}

}
