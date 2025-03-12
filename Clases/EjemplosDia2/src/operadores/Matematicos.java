package operadores;

public class Matematicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operadores Matemáticos: + , - , * , / , % (resto division entera)
		int resultado1 = 10 + 5;
		byte resultado2 = 10 + 5;
		int n1 = 200 , n3 = 5;
		byte resultado3 = (byte) (n1 + n3); //Conversión explícita
		//Las conversiones explícitas pueden dar problemas de overflow
		System.out.println("Resultado3 = " + resultado3);
		
		int n4 = 10 , n5 = 20;
		float division1 = n5 / n4;
		float division2 = (float)n4 / n5;
		float division3 = n4 / 3f;
		
		
		System.out.println("Operador división: ");
		System.out.println("Division1 : " + division1);
		System.out.println("Division2 : " + division2);
		System.out.println("Division3 : " + division3);
		
		int resto = n4 % 2; // resto valdrá 0
		int resto2 = n4 % 3; // resto valdrá 1
		
		
		
		
		
		
	}

}
