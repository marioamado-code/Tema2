package parte3;

import java.util.Scanner;
import java.util.Random;
public class Ejercicio5 {

	public static void main(String[] args) {
		//Introducimos la variable numero leido por teclado
		int numl;
		//Introducimos el escáner y la clase random
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		//Generamos los dos numeros aleatorios
		int num1 = rand.nextInt(1,100);
		int num2 = rand.nextInt(1,100);
		//Pedimos al usuario que los sume
		System.out.println("Cuanto es " + num1 + " + " + num2);
		//Leemos la respuesta por teclado
		numl = sc.nextInt();
		//Vemos si es verdad y hacemos el if
		if(numl == num1 +num2) {
			System.out.println("Correcto");
			
			
		}else {
			System.out.println("Incorrecto");
		}
		
		//Cerramos el escáner
		sc.close();

	}

}
