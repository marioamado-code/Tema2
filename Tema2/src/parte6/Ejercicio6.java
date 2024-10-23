package parte6;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		


				// Introducimos la variable nota que será introducida por el usuario en el bucle

				// for

				float nota;

				//Creamos la variable contador de suspensos

				int contSus=0;

				//Creamos la constante 5 que sirve tanto para el contador como para el aprobado

				final int CINCO=5;
				
				// Introducimos el escáner

				Scanner sc = new Scanner(System.in);


				//Introducimos el bucle for y aprovechamos que el 5 sirve para dos cosas,

				//ya que pondremos una variable como contador y otra como aprobado o suspenso

						for(int i=1;i<=CINCO;i++) {

				//Pedimos al usuario una nota

				System.out.println("Introduzca nota");

				//Lo leemos

				nota = sc.nextFloat();

				//Introducimos el if si la nota es mayor o menor que cinco

				if (nota<CINCO) {

					contSus++;

				}

						}

						//Imprimimos el contador de suspensos

						System.out.println("Hay " + contSus + " suspensos");

				// Cerramos el escáner

				sc.close();

	}

}
