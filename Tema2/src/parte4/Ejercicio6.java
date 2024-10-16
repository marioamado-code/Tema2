package parte4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
	//Creamos una variable para almacenar las alturas
		int alt;
		//Creamos una variable para almacenar la altura más alta momentanea o final
		int altMax = 0;
		//Introducimos contador para ver si se introdujeron alturas permitidas
		int cont=0;
		//Creamos el escáner
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario una altura
		System.out.println("Introduzca altura");
		//Leemos del teclado
		alt= sc.nextInt();
		//Introducimos el while siempre que la altura no sea menos uno
		while (alt!=-1) {
			//Creamos un ternario para ver si el nuevo número es mayor que el mayor que haya
			altMax = alt > altMax? alt: altMax;
			//Pedimos otra vez la altura
			System.out.println("Introduzca otra altura");
			//Leemos del teclado
			alt= sc.nextInt();
			cont++;
		}
		//Imprimimos la altura siempre que se hayan introducido valores positivos
		if (cont>0) {
			System.out.println(altMax);
		
		}else {
			System.out.println("Ninguna altura introducida");
		}
		//Cerramos el escáner
		sc.close();
	}

}
