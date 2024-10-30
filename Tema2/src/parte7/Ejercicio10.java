package parte7;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Introducimos la variable numero
		int num = 0;
		int cont = 1;
		int numDiv = 0;
		int contInverso=0;
		int numAlante=0;
		int numDetras=0;
		// Introducimos la variable booleana para salir del bucle de la excepcion
		boolean error = false;
		// Introducimos el escáner
		Scanner sc = new Scanner(System.in);

		// Aqui ponemos la excepcion del numero

		do {

			try {

				System.out.println("Introduzca número ");

				// Lo leemos

				num = sc.nextInt();

				assert (num >= 0) : "El valor debe ser mayor o igual que cero";

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
		numDiv=num/10;
		while(numDiv>0) {
			numDiv=numDiv/10;
			cont++;
		}
		do {
	for(int i=(int)Math.pow(10,contInverso);i>=0;contInverso++) {
		numAlante=num/i;
	}
	for(int j=(int)Math.pow(10,cont);j>=0;cont--) {
		numDetras=num%j;
	}
		
		}while(numDetras==numAlante);
		sc.close();

	}

}
