package parte1;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// Creamos las variables número que proporcionará el usuario y resto para ver si
		// es par
		int num;
		int resto;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número
		System.out.println("Introduzca número entero");
		// Leemos el número
		num = sc.nextInt();
		// Vemos si el número es divisible por 2 o no, y dependiendo de lo que de el
		// resto de pasarán cosas diferentes
		resto = num%2;
		if (resto==0) {
			System.out.println(num + " es par");	}
		else {
			System.out.println(num + " es impar");
		}
		//Cerramos el escáner
		sc.close();
	}

}
