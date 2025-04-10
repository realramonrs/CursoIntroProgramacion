package metodos;

public class TestMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 - Prueba método sumaNEnteros
		int limite = 9;
		long suma = Matematicos.sumaNEnteros(limite);
		
		//2 - Pruena método calculaSumaArray
		int[] pruebas = {4,5,6,7};
		long sumaArray = Matematicos.calculaSumaArray(pruebas);
		
		//3 - Prueba método calculaMediaArray
		double media = Matematicos.calculaMediaArray(pruebas);
		
		//4 - Prueba método generarArray
		int[] pruebas2 = new int[10];
		Matematicos.generarArray(pruebas2, 100);
		Matematicos.printArray(pruebas2);
		System.out.println("La media es: ");
		System.out.println(Matematicos.calculaMediaArray(pruebas2));
		
		//E1 - Prueba método cuentaDivisores
		int n = 100;
		System.out.println(n + " tiene " + Matematicos.cuentaDivisores(n) + " divisores");
		
		//E2 - Prueba método llena Array con vlaores negaticos
		int[] pruebas3 = new int[10];
		Matematicos.llenaArrayNegativos(pruebas3);
		System.out.println("Matriz E2 con valores negativos: ");
		Matematicos.printArray(pruebas3);
		
		
		
		
		
		
		
		
		
		
	}

}
