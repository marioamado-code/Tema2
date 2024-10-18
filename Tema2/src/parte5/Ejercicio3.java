package parte5;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Introducimos la variable número que irá aumentando

		int num = 0;

		// Introducimos la variable suma que irá añadiendo los números

		int suma = 0;

		// Introducimos la variable contador que será el número que introduzca el

		// usuario y las veces que se debe aumentar la variable

		int cont;

		// Introducimos el escáner

		Scanner sc = new Scanner(System.in);

		// Pedimos el número al usuario

		System.out.println("Introduzca número máximo del sumatorio");

		// Lo leemos

		cont = sc.nextInt();
		// Metemos un if donde meteremos el while y en el else meteremos la opción de
		// cuando el usuario pone un sumatorio incorrecto
		if (cont >= 1) {
			// Introducimos el bloque do while para ir aumentando el número

			do {
				// Añadimos 1 al número antes de la suma para que no salga un número más que el
				// contador
				num++;
				// Sumamos los números
				suma = suma + num;
				// Hacemos la condición
			} while (num < cont);
			// Imprimimos el resultado
			System.out.println(suma);
			// En el otro caso mostramos el error
		} else {
			System.out.println("Datos introducidos erróneos");
		}
		// Cerramos el escáner
		sc.close();

	}

}
