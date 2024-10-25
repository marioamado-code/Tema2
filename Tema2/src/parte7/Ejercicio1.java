package parte7;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// Introducimos la variable, hora, minuto y segundo

		int hora;

		int minuto;

		int segundo;

		// Introducimos la variable segundo incrementado

		int segInc;

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

		// Pedimos al usuario el número de segundos incrementados

		System.out.println("Introduzca segundos incrementados");

		// Lo leemos del teclado

		segInc = sc.nextInt();

		// Ahora vemos si el numero de horas, minutos y segundos introducidas es

		// correcta, si lo es continua y si no va al else

		if ((hora >= 0 && hora < 24) && (minuto >= 0 && minuto < 60) && (segundo >= 0 && segundo < 60)) {

			// Añadimos el bucle for para añadir los segundos que sean a la marca de tiempo

			for (int i = 0; i < segInc; i++) {

				// Añadimos un segundo más en el bucle para que por cada segundo incrementado se

				// sume un segundo, y lo ponemos aquí y no al final para que los segundos no se

				// queden en 60 si hay cambio de hora

				segundo++;

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

			}

			// Imprimimos la hora y ponemos un cero delante de los números que sean menores

			// que diez

			System.out.println((hora < 10 ? "0" + hora : hora) + " : " + (minuto < 10 ? "0" + minuto : minuto) + " : "

					+ (segundo < 10 ? "0" + segundo : segundo));

		} else {
			//Imprimimos que los datos son erróneos si alguno lo fue
			System.out.println("Datos introducidos erróneos");

		}

		// Cerramos el escáner

		sc.close();

	}

}
