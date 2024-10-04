package parte1;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// Introducimos las variables de los dos números
		int num1;
		int num2;
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario los números
		System.out.println("Introduzca  primer número entero ");
		// Leemos el número
		num1 = sc.nextInt();
		System.out.println("Introduzca segundo número entero ");
		// Leemos el número
		num2 = sc.nextInt();
		// Creamos la condición de que deban ser dos números iguales
		if (num1 == num2) {
			System.out.println(num1 + " y " + num2 + " son iguales");
		} else {
			System.out.println(num1 + " y " + num2 + " son diferentes");
		}
		// Cerramos el escáner
		sc.close();

	}
}
