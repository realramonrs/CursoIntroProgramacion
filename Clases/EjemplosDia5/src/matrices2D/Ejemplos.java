package matrices2D;

import java.util.Random;

public class Ejemplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] valores2D = new int[3][9];
		valores2D[0][0] = 9;
		valores2D[0][1] = 10;
		int numeroFilas = valores2D.length;
		int numeroColumnas = valores2D[0].length;
		//...
		
		//Llene toda la matriz con números aleatorios entre 0 y 15
		Random generador = new Random();
		for(int i = 0;i<valores2D.length;i++) {
			for(int j = 0;j<valores2D[0].length;j++) {
				valores2D[i][j] = generador.nextInt(16);
			}
		}
		//Mostrar la matriz generada
		for(int i = 0;i<valores2D.length;i++) {
			for(int j = 0;j<valores2D[0].length;j++) {
				System.out.print(valores2D[i][j] + " ");
				}
			System.out.println();
			}
		}
	
	

}
