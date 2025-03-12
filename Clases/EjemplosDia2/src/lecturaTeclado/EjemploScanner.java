package lecturaTeclado;

import java.util.Scanner;

public class EjemploScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		
		//Leer la edad del usuario
		System.out.println("Introduzca su edad: ");
		int edad = lector.nextInt();
		System.out.println("Introduzca su dni");
		String dni = lector.next();
		
		
		if(edad >= 18) {
			System.out.println(dni + " Puede pasar");
		}
		
	}

}
