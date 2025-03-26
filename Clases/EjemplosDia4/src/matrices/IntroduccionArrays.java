package matrices;

public class IntroduccionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Matrices 1D
		int[] valores = new int[10];
		valores[0] = 9;
		valores[1] = 5;
		valores[2] = 3;
		//Modificar la última posición a -1
		valores[9] = -1;
		valores[8] = 9;
		
		float[] precios = {9.5f,23.6f,100,34.99f,45.75f};
		
		int capacidad = precios.length; //Me devuelve la capacidad del array
		
		//Calcular la suma de todos los precios.
		float suma = 0;
		
		for(int indice = 0;indice<precios.length;indice+=1) {
			suma = suma + precios[indice];
		}
		double mediaPrecios = suma / capacidad;
		
		
		
		
		
		
		
		
		
	}

}
