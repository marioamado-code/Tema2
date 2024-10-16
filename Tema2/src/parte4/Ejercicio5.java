package parte4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Introducimos la variable que será la edad de cada alumno
		int edad;
		// Introducimos la variable para contar los alumnos
		int cont = 0;
		// Introducimos la variable suma para ir sumando en el while
		int suma = 0;
		// Introducimos la variable media para despúes del while
		float media = 0;
		// Introducimos la variable que contará a los mayores de edad
		int contMayor = 0;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// pedimos una edad al usuario
		System.out.println("Introduzca edad de un alumno");
		// Lo leemos del teclado
		edad = sc.nextInt();
		// Introducimos el bloque while donde pondremos las operaciones
		// siempre que sea mayor o igual a 0
		while (edad >= 0) {
			// Hacemos la suma de las edades que también servirá para la media
			suma = suma + edad;
			
			// Vemos si es mayor que 17 la edad para contarlo como mayor de edad
			if (edad > 17) {
				contMayor++;
			}
			//Añadimos uno al contador
			cont++;
			//Introducimos de nuevo el print
			System.out.println("Introduzca otra edad de un alumno");
			// Lo leemos del teclado
			edad = sc.nextInt();
		}
		// Fuera del bucle calculamos la media siempre que no sea 0 el número de alumnos
		// introducidos
		if (cont > 0) {
			media = (float) suma / cont;
			// Y mostramos los resultados
			System.out.println("La suma de edades es " + suma + ", el número de alumnos es " + cont
					+ ", la media de edad es " + media + ", y el número de mayores de edad es de " + contMayor);
			// Si no decimos que no se ha introducido ningún alumno
		} else {
			System.out.println("No se ha introducido ninguna edad");
		}
		// Y finalizamos el programa
		System.out.println("Fin del programa");
		// Cerramos el escáner
		sc.close();
	}

}
