package parte1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Introducimos la variable termino independiente
		float t0;
		// Introducimos la variable termino al cuadrado
		float t2;
		// Introducimos la variable termino
		float t1;
		// Introducimos la variable resultado 1
		float res1;
		// Introducimos la variable resultado 2
		float res2;

		// Introducimos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario los datos, a
		System.out.println("Introduzca término de segundo grado");
		// La leemos
		t2 = sc.nextFloat();
		// b
		System.out.println("Introduzca término de primer grado");
		// La leemos
		t1 = sc.nextFloat();
		// c
		System.out.println("Introduzca término independiente");
		// La leemos
		t0 = sc.nextFloat();
		// Calculamos primero si tiene solución real
		if (t1 * t1 >= 4 * t2 * t0) {
			// Si la tiene hacemos los cálculos con el más y el menos
			res1 = (-t1 + (4 * t2 * t0)) / (2 * t2);
			res2 = (-t1 - (4 * t2 * t0)) / (2 * t2);
			// Ahora mostramos el resultado
			System.out.println(res1 + " y " + res2 + " son los resultados");
		} else {
			System.out.println("No tiene solución real");
		}
		sc.close();
	}

}
