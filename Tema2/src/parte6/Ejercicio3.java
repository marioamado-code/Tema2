package parte6;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		
				// Introducimos la variable número que introducirá el usuario

				float num;

				// Introducimos la variable media, donde calculamos la media

				float media;

				//Introducimos la variable suma donde se almacena la suma

				float suma=0;

				//Introducimos la constante número de veces que pasa por el bucle, llamada iteración

				final int ITER= 10;
				// Introducimos el escáner

				Scanner sc = new Scanner(System.in);


				// Introducimos el bucle for, donde la i será las veces que se introduce un

				// número dentro del bucle hasta llegar a 10.

				for (int i = 1; i <= ITER; i++) {



					// Pedimos un número n



					System.out.println("Introduzca número");



					// Lo leemos



					num = sc.nextFloat();

					//Vamos sumando números

					suma= suma + num;

					

				}

				//Calculamos la media

				media = suma/ITER;

				//La imprimimos

				System.out.println(media);

				// Cerramos el escáner

				sc.close();



	}

}
