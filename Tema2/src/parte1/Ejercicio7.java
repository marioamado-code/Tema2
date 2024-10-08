package parte1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Introducimos la variable número
		float num;
		// Introducimos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número
		System.out.println("Introduzca número entre 0 y 99999");
		// Lo leemos del teclado
		num = sc.nextFloat();
		// Ahora lo vamos a ir dividiendo entre diez y cada vez que lo dividimos
		// le sumamos una cifra al número de cifras, a no ser que el resultado sea menor
		// a uno
		if (num / 10 >= 1) {
			num = num / 10;
			if (num / 10 >= 1) {
				num = num / 10;
				if (num / 10 >= 1) {
					num = num / 10;
					if (num / 10 >= 1) {
						System.out.println("El número tiene 5 cifras");
					} else {
						System.out.println("El número tiene 4 cifras");
					}
				} else {
					System.out.println("El número tiene 3 cifras");
				}
			} else {
				System.out.println("El número tiene 2 cifras");
			}
		} else {
			System.out.println("El número tiene 1 cifra");
		}
		// Cerramos el escáner
		sc.close();
	}
}
