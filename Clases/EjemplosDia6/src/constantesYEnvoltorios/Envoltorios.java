package constantesYEnvoltorios;

public class Envoltorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Conversiones explicitas
		float temperatura = 8.6f;
		int temp = (int)temperatura;
		
		//Conversiones implícitas
		byte n = 9;
		int n2 = n;
		
		//Pasar un String a un int --> No se puede hacer con notación anterior 
		String cadena = "23";
		//int cadenaEntero = (int)cadena;
		int cadenaEntero = Integer.parseInt(cadena);
		short cadenaShort = Short.parseShort(cadena);
		byte cadenaByte = Byte.parseByte(cadena);
		
		int numero = 67;
		String numeroString = Integer.toString(numero);
		String numeroHexadecimal = Integer.toHexString(numero);
		
		
		
		
		
		
	}

}
