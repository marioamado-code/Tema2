package parte1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		//Introducimos la variable jugador1
		String jugador1;
		// Introducimos la variable jugador2
		String jugador2;
		// Introducimos las constantes piedra, papel y tijera
		final String PIEDRA = "PIEDRA";
		final String TIJERA = "TIJERA";
		final String PAPEL = "PAPEL";

		//Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Le damos el turno al jugador 1
				System.out.println("Jugador 1: Elija PIEDRA, PAPEL o TIJERA");
				jugador1 = sc.next();
				
				// Le damos el turno  al jugador 2
				System.out.println("Jugador 2: Elija PIEDRA, PAPEL o TIJERA");
				jugador2 = sc.next();
				//Ahora se ve si han introducido la misma cadena
				if (jugador1.equals(jugador2)){
					System.out.println("Empate");
				//Ahora se hacen las relaciones para que gane el jugador 1
				}else if(jugador1.equals(PIEDRA) && jugador2.equals(TIJERA)
						|| jugador1.equals(PAPEL) && jugador2.equals(PIEDRA)
							|| jugador1.equals(TIJERA) && jugador2.equals(PAPEL)) {
						System.out.println("Gana el jugador 1");
					} else {
						System.out.println("Gana el jugador 2");
					}
			
				
				
				// Cerramos el Scanner
				sc.close();
	}

}


