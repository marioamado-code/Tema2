package parte3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos la variable número que pondrá el usuario
		int num;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número
		System.out.println("Introduzca número del 1 al 99");
		// Lo leemos del teclado
		num = sc.nextInt();
		// Vemos si el numero esta entre 1 y 99
		if (num < 1 || num > 99) {
			System.out.println("Su número no va del 1 al 99");
			// Para todos los que si
		} else {
			// Vemos si el número está entre once y quince que son los que se nombran
			// diferente
			if (num < 16 && num > 10) {
				switch (num) {
				case 11:
					System.out.println("Once");
					break;
				case 12:
					System.out.println("Doce");
					break;
				case 13:
					System.out.println("Trece");
					break;
				case 14:
					System.out.println("Catorce");
					break;
				case 15:
					System.out.println("Quince");
					break;
				}
				// Para los demas numeros los organizamos en grupos, viendo las decenas y las
				// unidades, para el diez y el veinte aparte y el "y" se añade solo si el numero
				// es mayor de 29
				
			} else {
				if (num==10||num==20) {
					switch (num) {
					case 10:
						System.out.println("Diez");
						break;
					case 20:
						System.out.println("Veinte");
						break;
						
					}
				}else {
					
				
				switch (num / 10) {
				case 0:
					System.out.print("");
					break;
				case 1:
					System.out.print("Dieci");
					break;
				case 2:
					System.out.print("Veinti");
					break;
				case 3:
					System.out.print("Treinta");
					break;
				case 4:
					System.out.print("Cuarenta");
					break;
				case 5:
					System.out.print("Cincuenta");
					break;
				case 6:
					System.out.print("Sesenta");
					break;
				case 7:
					System.out.print("Setenta");
					break;
				case 8:
					System.out.print("Ochenta");
					break;
				case 9:
					System.out.print("Noventa");
					break;
				}
				if (num>29) {
					 System.out.print(" y ");
				}else {
					 System.out.print("");
				}
				switch (num % 10) {
				case 0:
					System.out.print("");
					break;
				case 1:
					System.out.print("uno");
					break;
				case 2:
					System.out.print("dos");
					break;
				case 3:
					System.out.print("tres");
					break;
				case 4:
					System.out.print("cuatro");
					break;
				case 5:
					System.out.print("cinco");
					break;
				case 6:
					System.out.print("seis");
					break;
				case 7:
					System.out.print("siete");
					break;
				case 8:
					System.out.print("ocho");
					break;
				case 9:
					System.out.print("nueve");
					break;
				}

			}

		}

	}
		//Cerramos el escáner
		sc.close();
}
}
