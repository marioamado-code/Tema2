package parte2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Introducimos el escáner
		Scanner sc = new Scanner(System.in);
		// Solicitamos al usuario el tipo de carnet
		System.out.println("Introduzca el tipo de carnet de conducir");
		// Creamos variable tipo string y convertimos a mayusculas
		String tipoCarnet = sc.nextLine().toUpperCase();
		// Ahora determinamos a que vehiculo corresponde cada tipo de carnet
		switch (tipoCarnet) {
		case "E":
			System.out.println("Corresponde a remolque");
			break;
		case "D":
			System.out.println("Corresponde a autobuses");
			break;
		case "A":
			System.out.println("Corresponde a motocicletas");
			break;
		case "B1":
		case "B2":
			System.out.println("Corresponde a automoviles");
			break;
		case "C1":
		case "C5":
			System.out.println("Corresponde a camiones");
			break;
		// Si no pertenece a ninguno se va al default
		default:
			System.out.println("No pertenece a ninguna categoría");
			break;

		}
		// Cerramos el escáner
		sc.close();
	}

}
