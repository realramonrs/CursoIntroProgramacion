package repasoGeneral;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que permita registrar temperaturas , eliminar, y realizar cálculos
		//como la media, la temperatura máxima, mínima, etc...
		int[] temperaturas = new int[100];
		
		//Llenamos el array con un valor absurdo
		for(int i = 0;i<temperaturas.length;i++) {
			temperaturas[i] = -100;
		}
		
		//Actualizamos 3 primeras posiciones:
		temperaturas[0] = 9;
		temperaturas[1] = -3;
		temperaturas[2] = 8;
		
		int opcion = 0;
		Scanner lector = new Scanner(System.in);
		do {
		
		System.out.println("1. Introducir nueva temperatura");
		System.out.println("2. Introducir posición a eliminar.");
		System.out.println("3. Mostrar registros");
		System.out.println("4. Mostrar temperatura media, máxima y mínima");
		System.out.println("5. Salir del programa");
		opcion = lector.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("introduzca nueva temperatura");
			int temp = lector.nextInt();
			//Guardarla en la primera posición vacía
			for(int i = 0;i<temperaturas.length;i++) {
				if(temperaturas[i]== -100) {
					temperaturas[i] = temp;		
					break;
				}
			}
			break;
		case 2:
			break;
		case 3:
			//Mostrar registros
			System.out.println("Temperaturas registradas hasta ahora:");
			for(int i = 0;i<temperaturas.length;i++) {
				if(temperaturas[i]==-100) {
					continue;
				}
				System.out.print(temperaturas[i] + " ,");
			}
			System.out.println();
			break;
		case 4:
		default:
			
				break;
		}
				
		
		}while(opcion!=5);
		
		
	}

}
