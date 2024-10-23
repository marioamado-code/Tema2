package parte6;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		

				//Introducimos la variable número n

				int num;
				//Introducimos el escáner

				Scanner sc= new Scanner(System.in);
				//Pedimos un número n

				System.out.println("Introduzca número");

				//Lo leemos

				num = sc.nextInt();

				//Creamos el bucle for

				for (int i=1;i<=num;i++) {

					System.out.println(i);

				}

				//Cerramos el escáner

				sc.close();

	}

}
