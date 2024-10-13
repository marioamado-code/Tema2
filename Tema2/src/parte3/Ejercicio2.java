package parte3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Introducimos la variable número
		float num;
		//Introducimos la variable del ternario
		float tern;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número
		System.out.println("Introduzca número");
		// Lo leemos del teclado
		num = sc.nextFloat();
		// Hacemos el ternario preguntando si el numero es mayor que 0, si lo es lo
		// imprimimos tal cual y si no le cambiamos el signo
		tern = num>=0 ? num : -num;
		//Imprimimos el ternario
		System.out.println(tern);
		//Cerramos el escáner
		sc.close();
	}

}
