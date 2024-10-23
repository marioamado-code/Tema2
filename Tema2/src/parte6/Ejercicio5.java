package parte6;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		



				// Introducimos la variable suma donde se almacena la multiplicación

				int mult= 1;

				//Introducimos el número del cual se calcula el factorial

				int num;
				
				// Introducimos el escáner

				Scanner sc = new Scanner(System.in);

				//Pedimos el número

				System.out.println("Introduzca número");

				//Lo leemos

				num = sc.nextInt();

				//Introducimos el for para hacer las multiplicaciones

				for (int i = 1; i <= num; i++) {



					// Vamos multiplicando números

					mult = mult*i;



				}

				// Imprimimos la multiplicación

				System.out.println("Su factorial es "+mult);

				// Cerramos el escáner

				sc.close();



	}

}
