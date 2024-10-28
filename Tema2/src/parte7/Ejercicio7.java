package parte7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Creamos la variable numero n
		int num;

		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Hacemos un do para cercionarnos de que el usuario pone un dato correcto
		do {
			// Pedimos al usuario el número
			System.out.println("Introduzca número");
			// Lo leemos
			num = sc.nextInt();
		} while (num < 1);
		// Creamos un for para las filas que englobará a los otros dos for
		for (int j = 1; j <= num; j++) {
			// imprimimos en cada linea un numero desde uno hasta el numero de la fila en
			// que se encuentre
			for (int i = 1; i < j; i++) {
				System.out.print(i);
			}
			// Por otro lado imprimimos en la misma linea lo mismo que antes pero al reves,
			// y aqui se encuentra el numero mayor de la linea
			for (int k = j; k >= 1; k--) {
				System.out.print(k);
			}
			// En el primer bucle for dividimos las diferentes iteraciones con un salto de
			// linea
			System.out.println("");
		}
		// Cerramos el escáner
		sc.close();
	}

}
