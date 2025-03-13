package sentenciasSeleccion;

import java.util.Scanner;

public class EjemploIfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que me indica si un número tiene 1 , 2, 3 o más dígitos
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce un número y te digo cuantos dígitos tiene");
		int numero = lector.nextInt();
		if(numero < 10 && numero >=0) {
			System.out.println("Número con un dígito");
		}
		else if(numero <100) {
			System.out.println("Número con dos dígitos");
		}
		else if(numero < 1000) {
			System.out.println("Número con tres dígitos");
		}
		else {
			System.out.println("Tiene 4 o más dígitos");
		}
	}

}
