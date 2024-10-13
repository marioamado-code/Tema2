package parte3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creamos las variables día y distancia
		int dia;
		int kilo;
		// Creamos la variable precio para el final
		float precio;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número de días
		System.out.println("Introduzca número de días");
		// Lo leemos del teclado
		dia = sc.nextInt();
		// Pedimos al usuario el número de kilometros
		System.out.println("Introduzca número de kilometros");
		// Lo leemos del teclado
		kilo = sc.nextInt();
		// Ahora hacemos el coste por ahora sin tener en cuenta la rebaja
		precio = (float) (kilo * 2.5);
		// Ahora hacemos el if o el else dependiendo de el numero de dias o kilometros
		if (dia>7&&kilo>800) {
			//Aplicamos la rebaja
			precio = (float) (precio*0.7);
			System.out.println("Su billete cuesta " + precio + " euros");
		}else {
			System.out.println("Su billete cuesta " + precio + " euros");
		}
		//Cerramos el escáner
		sc.close();
	}

}
