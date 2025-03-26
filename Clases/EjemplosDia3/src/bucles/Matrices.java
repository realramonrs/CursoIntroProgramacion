package bucles;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] notas = new int[10]; //Matriz con capacidad para 10 enteros
		//Para acceder usamos un índice
		notas[0] = 9;
		notas[1] = 8;
		notas[2] = 4;
		
		//Bucle que muestra por pantalla todos los valores
		//Bucle for
		for(int i = 0;i<10;i++) {
			System.out.print(notas[i] + " ");
		}
		
		//Programa un bucle que modifique todas las posiciones del array
		//aumantando su valor en 10 
		
		for(int i = 0;i<10;i++) {
			notas[i] = notas[i] + 10;
		}
		//Algoritmo que muestra solo los valores pares
		
		//Algoritmo que calcula la suma de todos los valores del array
		
		
	}

}
