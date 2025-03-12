package operadores;

public class LibreriaMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Class Math: Métodos matemáticos
		//Calcular la raíz cuadrada de un número:
		int n = 9;
		double raiz = Math.sqrt(n);
		
		//Calcular potencias:
		long resultado = (long) Math.pow(10, 3);
		
		int a1 = 9,a2 = 8;
		
		int menor = Math.min(a1, a2);
		
		int x1 = 5, x2 = 9, x3 = 1;
		
		int menor2 = Math.min(x1, x2);
		menor2 = Math.min(menor2, x3);
		
		int z1 = 9 , z2 = 5;
		int auxiliar = z1;
		z1=z2;
		z2 = auxiliar;
		
		
		
	}

}
