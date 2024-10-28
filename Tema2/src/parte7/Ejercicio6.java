package parte7;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos la variable numero n
		int num;
		// Introducimos el contador para el do while
		int cont = 1;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Hacemos un do para cercionarnos de que el usuario pone un dato correcto
		do {
			// Pedimos al usuario el número
			System.out.println("Introduzca número de base y altura del triángulo");
			// Lo leemos
			num = sc.nextInt();
		} while (num < 1);
		// Hacemos un do while donde iremos haciendo cada linea del triangulo, y cuando
		// el contador llegue al numero se para
		do {
			// Creamos un for para los espacios de antes de los asteriscos, que irá
			// disminuyendo con cada línea
			for (int i = num - cont; i > 0; i--) {
				System.out.print(" ");

			}
			//Creamos un for para los asteriscos, que irán aumentando
			for (int j = 1; j <= cont; j++) {
				System.out.print("* ");
			}
			//El ln separa las diferentes iteraciones del contador, que va subiendo
			System.out.println("");
			cont++;
			//Cuando el contador es mayor que el numero se acaba el programa
		} while (cont <= num);
		// cerramos el escáner
		sc.close();
	}

}
