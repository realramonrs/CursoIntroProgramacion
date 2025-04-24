package metodos;

import java.util.Random;

public class Matematicos {

	//Método que calcula la suma de n números siendo n un entero que recibe como argumento
	public static long sumaNEnteros(int n) {
		long suma = 0; //Variable locan en la que se recoge el resultado
		
		int i = 1;
		while(i<=n) {
			suma = suma + i;
			i++;
		}
		
		return suma;
	}
	
	//2. Método que obtiene la suma de los elementos de una matriz
	
	public static long calculaSumaArray(int[] matriz) {
		long suma = 0;
		
		for(int i = 0;i<matriz.length;i++) {
			suma = suma + matriz[i];
		}
		
		return suma;
	}
	
	//3. Método que calcula la media de los elementos de una matriz
	
	public static double calculaMediaArray(int[] array) {
		return (double)calculaSumaArray(array) / array.length;
	}
	
	//4. Método que llena una matriz de enteros con valores aleatorios entre 0 y n
	
	public static void generarArray(int[] x,int n) {
		Random generador = new Random();
		
		for(int i = 0;i<x.length;i++) {
			x[i] = generador.nextInt(n+1);
		}
		
		
	}
	
	//5. Método que printa por pantalla un array de enteros
	
	public static void printArray(int[] x) {
		
		for(int valor : x) {  //for mejorado: Se usa para operaciones de solo lectura
			System.out.print(valor + " ");
		}
		System.out.println();
	}
	
	//Ejercicios.
	//E1 - Método que devuelve cuantos divisores tiene un número n que recibe como parámetro
	
	public static int cuentaDivisores(int numero) {
		int contador = 2;
		
		for(int i = 2;i<numero/2;i++) {
			if(numero % i == 0) {
				contador++;
			}
		}
		return contador;
	}	
	
	//E2 - Método que almacena en todas las posiciones del array un número negativo aleatorio
	
	public static void llenaArrayNegativos(int[] m) {
		
		for(int i = 0;i<m.length;i++) {
			m[i] = new Random().nextInt(-101,0);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
