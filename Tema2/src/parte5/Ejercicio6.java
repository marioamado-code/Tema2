package parte5;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Creamos la variable que servirá para asignar un valor al dato del jugador 1
		int num = 0;
		// Lo mismo con el jugador 2
		int num2 = 0;
		// Introducimos la variable del número final, que según como sea nos mostrará
		// una información u otra
		int numFin;
		// Introducimos la variable booleana para salir del do while
		boolean salir = false;
		// Introducimos la variable booleana para volver al do while general
		boolean volvere = false;
		// Introducimos el do while de la partida
		do {
			// Introducimos un do while para el primer jugador
			do {
				// Le damos el turno al jugador 1
				System.out.println("Jugador 1: Elija PIEDRA, PAPEL o TIJERA");
				// Leemos su dato
				String jugador1 = sc.next();
				// Segun lo que ponga se le asignara un valor diferente a la variable numero
				switch (jugador1) {
				case "PIEDRA":
					num = 1;
					break;
				case "PAPEL":
					num = 2;
					break;
				case "TIJERA":
					num = 3;
					break;
				// para que salga es necesario que sea false, y si es true se continua
				default:
					salir = true;

				}
			} while (salir);
			// Hacemos lo mismo con el jugador 2
			do {
				// Le damos el turno al jugador 2
				System.out.println("Jugador 2: Elija PIEDRA, PAPEL o TIJERA");
				String jugador2 = sc.next();
				switch (jugador2) {
				case "PIEDRA":
					num2 = 1;
					break;
				case "PAPEL":
					num2 = 2;
					break;
				case "TIJERA":
					num2 = 3;
					break;
				default:
					salir = true;

				}
			} while (salir);
			// Ahora restamos el numero 1 con el 2, y si da 0 es empate porque han puesto lo
			// mismo
			numFin = num - num2;
			if (numFin == 0) {
				System.out.println("Empate");
			} else {
				// Podemos saber si las ganadoras son las piedras debido a que si ganan la
				// operación da 2 o menos dos y en el resto de operaciones da uno o menos uno
				if (numFin % 2 == 0) {
					System.out.println("Ganan las piedras");
					if (numFin > 0) {
						// Si es positivo gana el 2, y si no el 1
						System.out.println("Gana el jugador 2");
					} else {
						System.out.println("Gana el jugador 1");
					}
					// Si el uno es negativo gana el jugador 2 y si no el 1 gana
				} else if (numFin > 0) {
					System.out.println("Gana el jugador 1");
				} else {
					System.out.println("Gana el jugador 2");
				}
			}
			//Mostramos si quieren volver a jugar y hacemos el switch correspondiente
			System.out.println("¿Queréis volver a jugar?");
			String volver = sc.next();
			switch (volver) {
			case "S":
				volvere = true;
				break;
			default:
				volvere = false;
			}

		} while (volvere);
		// Mostramos que se acabó el juego
		System.out.println("Pues se acabó");
		// Cerramos el Scanner
		sc.close();

	}

}
