package parte1;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// Introducimos la variable número que pondrá el usuario,
		// y un numero que servira para hacer las operaciones
		float num;
		float num2;
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número
		System.out.println("Introduzca número");
		// Leemos el número
		num = sc.nextFloat();
		// Deducimos que los números que se piden son aquellos que al multiplicarse por
		// si mismos se hacen de valor absoluto menor, por lo que necesitaremos dividir
		// al número en positivo o negativo
		num2 = num * num;
		if (num >= 0) {
			// Ahora tendremos que dividir en los que dan un número menor y los que no y
			// quitar el 0
			if (num2 < num && num2 != 0) {
				System.out.println(num + " es casi 0");
			} else {
				System.out.println(num + " no es casi 0");
			}
		} else {
			// Hacemos lo mismo pero al revés para los números negativos
			if (num2 > num && num2 != 0) {
				System.out.println(num + " es casi 0");
			} else {
				System.out.println(num + " no es casi 0");
			}

		}
		//Cerramos el escáner
		sc.close();
	}

}
