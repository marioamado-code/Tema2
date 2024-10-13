package parte3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Introducimos la variable, hora, minuto y segundo
		int hora;
		int minuto;
		int segundo;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario la hora
		System.out.println("Introduzca hora");
		// Lo leemos del teclado
		hora = sc.nextInt();
		// Pedimos al usuario el minuto
		System.out.println("Introduzca minuto");
		// Lo leemos del teclado
		minuto = sc.nextInt();
		// Pedimos al usuario el segundo
		System.out.println("Introduzca segundo");
		// Lo leemos del teclado
		segundo = sc.nextInt();
		// Ahora vemos si el numero de horas, minutos y segundos introducidas es
		// correcta, si lo es continua y si no va al else
		if ((hora >= 0 || hora < 24) && (minuto >= 0 || minuto < 60) && (segundo >= 0 || segundo < 60)) {
			// Ahora realizamos la operación de incrementar un segundo
			segundo = segundo + 1;
			// Creamos la relación entre dia horas minutos y segundos
			if (segundo == 60) {
				minuto = minuto + 1;
				segundo = 0;
			}
			if (minuto == 60) {
				hora = hora + 1;
				minuto = 0;
			}
			if (hora == 24) {
				hora = 0;
			}
			// Imprimimos la hora
			System.out.println(hora + " : " + minuto + " : " + segundo);
		} else {
			System.out.println("Datos introducidos erróneos");
		}
		//Cerramos el escáner
		sc.close();
	}
}
