package parte7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Introducimos el número, el numero dividido por diez y el contador de cifras

		int num=0;
		int numDiv;
		int cont = 0;
		//Creamos el booleano error para el bucle de la excepcion
		boolean error=false;
		// Introducimos el escáner

		Scanner sc = new Scanner(System.in);
		
		//Aqui ponemos la excepcion del numero
		
		do {

			try {

				System.out.println("Introduzca número ");

				// Lo leemos

				num = sc.nextInt();

				assert (num > 0) : "El valor debe ser mayor que cero";

				error = false;

			} catch (AssertionError e) {

				System.out.println(e.getMessage());

				error = true;

			} catch (InputMismatchException e) {

				System.out.println("El tipo no es entero");

				error = true;

			} finally {

				sc.nextLine();

			}

		} while (error);


		// Creamos el do while donde el numero se ira dividiendo por diez y se ira
		// contando el numero de cifras
		do {
			numDiv = num / 10;
			cont++;
			num = numDiv;
			//Cuando el numDiv sea 0 ya no habrá más cifras
		} while (numDiv > 0);
		//Imprimimos las cifras
		System.out.println("El numero de cifras del numero es "+cont);
		
		//Cerramos el escáner
		sc.close();

	}

}
