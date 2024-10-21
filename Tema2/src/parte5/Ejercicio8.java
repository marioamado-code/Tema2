package parte5;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Introducimos la variable resultado 1 y 2 y la suma de ambos
				int res1 = 0;
				int res2 = 0;
				int suma;
				boolean salir1=false;
				boolean salir2=false;
				// Introducimos el escáner
				Scanner sc = new Scanner(System.in);
				//Iniciamos el do while primero
				do{
					
				// Pedimos al usuario la primera tirada
				System.out.println("Ingrese resultado de la primera tirada: UNO, DOS, TRES, CUATRO, CINCO, SEIS");
				// Ahora generamos una variable tipo string de la tirada primera que servirá
				// para el switch
				String tirada1 = sc.nextLine().toUpperCase();
				salir1=false;
				// Ahora con switch convertimos las letras en números
				switch (tirada1) {
				case "UNO":
					res1 = 1;
					break;
				case "DOS":
					res1 = 2;
					break;
				case "TRES":
					res1 = 3;
					break;
				case "CUATRO":
					res1 = 4;
					break;
				case "CINCO":
					res1 = 5;
					break;
				case "SEIS":
					res1 = 6;
					break;
					//Si no es ninguno el booleano pasa a true y vuelve al bucle
					default:
						salir1= true;
						
				}
				
	}while(salir1);
				//Introducimos el do while segundo y lo acabamos de la misma forma
				do {
					
				// Pedimos al usuario la segunda tirada
				System.out.println("Ingrese resultado de la segunda tirada: UNO, DOS, TRES, CUATRO, CINCO, SEIS");
				// Ahora generamos una variable tipo string de la tirada segunda
				String tirada2 = sc.nextLine().toUpperCase();
				salir2=false;
				// Ahora con switch convertimos las letras en números
				switch (tirada2) {
				case "UNO":
					res2 = 1;
					break;
				case "DOS":
					res2 = 2;
					break;
				case "TRES":
					res2 = 3;
					break;
				case "CUATRO":
					res2 = 4;
					break;
				case "CINCO":
					res2 = 5;
					break;
				case "SEIS":
					res2 = 6;
					break;
					default:
						salir2=true;
						
				}
				
				}while(salir2);
				// Ahora se suman los resultados
				suma = res1 + res2;
				System.out.println("La suma da " + suma);
				// Cerramos el escáner
				sc.close();


	}

}
