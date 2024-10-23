package parte6;
import java.util.Scanner;
public class Ejercicio2 {

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

				for (int i=3;i<=num;i+=3) {

					//Imprimimos el número que cambia

					System.out.println(i);

				}

				//Cerramos el escáner

				sc.close();

	}

}
