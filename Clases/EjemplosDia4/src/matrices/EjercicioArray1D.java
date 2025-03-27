package matrices;

import java.util.Random;

public class EjercicioArray1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa almacena valores aleatorios en un array de 20 enteros
		//A  continuación muestra la siguiente info:
		// a) Array generado
		// b) Contar cuantos valores negativos hay
		// b2)El primer número > 20
		// c) La posición en la que se encuentra el primer valor 0
		// d) El valor más alto generado
		// e) El valor más bajo
		// f) El primer número primo almacenado en el array y su posición
	
		//Declaración del array
		int[] valores = new int[20];
		//Generar valores aleatorios --> Random
		Random generador = new Random();
	
		for(int i = 0;i<valores.length;i++) {
			valores[i] = generador.nextInt(100);
			
		}
		
		System.out.println("El array generado es: ");
		for(int i = 0;i<valores.length;i++) {
			System.out.print(valores[i] + " ");
		}
		System.out.println();
		//Contar valores negativos
		int negativos = 0;
		for(int i = 0;i<valores.length;i++) {
			
			if(valores[i]<0) {
				negativos++;
			}
			
		}
		if(negativos==0) {
			System.out.println("No hay números negativos");
		}
		else {
			System.out.println("Hay " + negativos + " números negativos");
		}
	
	    //b2) Encontrar el primer número > 20
		boolean encontrado = false;
		for(int i = 0;i<valores.length;i++) {
			if(valores[i]>20) {
				encontrado = true;
				System.out.println("El primer valor > 20 es el " + valores[i]);
				break; // Salida prematura del bucle
			}
		}
	
		if(!encontrado ) {
			System.out.println("No hay ningún valor > 20");
		}
		
		//Encontrar el valor más alto
		int maximo = valores[0];
		for(int i = 1;i<valores.length;i++) {
			if(maximo<valores[i]) {
				maximo = valores[i];
			}
		}
		
		System.out.println("El valor más alto es: " + maximo);
		
		//Primer número primo almacenado
		valores[0] = 8;
		valores[1] = 7;
		boolean primo = true;
		
		for(int i = 0;i<valores.length;i++) {
			primo = true;
			//Bucle para detectar divisores de cada valor 
			for(int j = 2;j<=valores[i]/2;j++) {
				if(valores[i] % j == 0) {
					primo = false;
					break;
				}
			}
			
			if(primo==true) {
				System.out.println(valores[i] + " es primo");
			}
		}
		
		
		
		
		
		
		
	}

}
