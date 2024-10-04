package parte1;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		// Creamos las variables de los tres números
		float num1;
		float num2;
		float num3;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario los tres números y los leemos por pantalla
		System.out.println("Introduzca primer número");
		num1 = sc.nextFloat();
		System.out.println("Introduzca segundo número");
		num2 = sc.nextFloat();
		System.out.println("Introduzca tercer número");
		num3 = sc.nextFloat();
		// Creamos un if para ver si el numero 1 es mayor que los dos otros numeros
		if (num1 > num2 && num1 > num3) {
			// Si se cumple vemos cual es el segundo mayor y lo imprimimos con su
			// respectivo resultado
			if (num2 > num3) {
				System.out.println(num1 + " , " + num2 + " y " + num3);
			} else {
				System.out.println(num1 + " , " + num3 + " y " + num2);
			}
			// Si el 1 no es mayor vemos cual de los dos es mayor
		} else {
			if (num2 > num3) {
				// Si es el 2 hacemos otro if para ver cual de los dos restantes es mayor y
				// ponemos el resultado correspondiente
				if (num3 > num1) {
					System.out.println(num2 + " , " + num3 + " y " + num1);
				} else {
					System.out.println(num2 + " , " + num1 + " y " + num3);
				}
			}
			// Si no es ni 1 ni 2 es el 3 y luego se comparan los otros dos números
			else {
				if (num2 > num1) {
					System.out.println(num3 + " , " + num2 + " y " + num1);
				} else {
					System.out.println(num3 + " , " + num1 + " y " + num2);
				}
			}
		}
		//Cerramos el escáner
		sc.close();
	}

}
