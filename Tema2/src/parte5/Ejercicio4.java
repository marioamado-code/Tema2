package parte5;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// Introducimos la variable número que pondrá el usuario

				int num;

				// Introducimos la variable del número por el que se multiplica el número que va

				// del 1 al 10, que llamaremos multiplo

				int mul =1;

				//introducimos el resultado de cada operación como variable

				int res;

				// Introducimos el escáner

				Scanner sc = new Scanner(System.in);

				//Pedimos al usuario un número

				System.out.println("Introduzca número");

				//Lo leemos

				num = sc.nextInt();

				//Introducimos el do while

				do {

					

					//Lo multiplicamos por el múltiplo

					res = num*mul;

					//Imprimimos por pantalla la línea de la tabla

					System.out.println(num + " x " + mul + " = " + res);

					//Sumamos 1 al múltiplo

					mul++;

				//Hacemos que la condición sea que cuando el múltiplo llegue a 10 se acabe el ciclo

				}while(mul<=10);

				// Cerramos el escáner

				sc.close();



	}

}
