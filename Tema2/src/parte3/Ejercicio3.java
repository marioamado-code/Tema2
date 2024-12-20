package parte3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Introducimos la variable numero
		int num;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número
		System.out.println("Introduzca número de 8 cifras");
		// Lo leemos del teclado
		num = sc.nextInt();
		// Vemos si no es de 8 cifras, si no lo es lo metemos en el if y si lo es va al
		// else y luego al switch
		if(num<10000000||num>99999999) {
			System.out.println("Su número no es de 8 cifras");
		}else {
			//Aqui ponemos todas las opciones posibles del resto de la division
			switch (num%23){
			case 0:
				System.out.println("T");
				break;
			case 1:
				System.out.println("R");
				break;
			case 2:
				System.out.println("W");
				break;
			case 3:
				System.out.println("A");
				break;
			case 4:
				System.out.println("G");
				break;
			case 5:
				System.out.println("M");
				break;
			case 6:
				System.out.println("Y");
				break;
			case 7:
				System.out.println("F");
				break;
			case 8:
				System.out.println("P");
				break;
			case 9:
				System.out.println("D");
				break;
			case 10:
				System.out.println("X");
				break;
			case 11:
				System.out.println("B");
				break;
			case 12:
				System.out.println("N");
				break;
			case 13:
				System.out.println("J");
				break;
			case 14:
				System.out.println("Z");
				break;
			case 15:
				System.out.println("S");
				break;
			case 16:
				System.out.println("Q");
				break;
			case 17:
				System.out.println("V");
				break;
			case 18:
				System.out.println("H");
				break;
			case 19:
				System.out.println("L");
				break;
			case 20:
				System.out.println("C");
				break;
			case 21:
				System.out.println("K");
				break;
			case 22:
				System.out.println("E");
				//No hace falta el default porque tiene que ser siempre una de estas
			}
		}
		//Cerramos el escáner
		sc.close();

	}

}
