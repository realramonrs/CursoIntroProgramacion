package repasoGeneral;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Programa que verifica que un DNI es correcto
 */
		String dni;
		int resto;
		boolean correcto = false;
		do {
		Scanner lectorDNI = new Scanner(System.in);
		
		System.out.println("Por favor introduzca su DNI con letra");
		dni = lectorDNI.nextLine();
		
		//1er paso: Extraer la parte numérica
		String dniSinletra = dni.substring(0,8);//Obtengo los 8 primeros caracteres
		int dniNumero = Integer.parseInt(dniSinletra);
		
		resto = dniNumero % 23;
		char letra = dni.charAt(8);
		
		char[] letras = {'T','R','W','A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		if(letra == letras[resto]) {
			System.out.println("Su dni es correcto");
			correcto = true;
		}
		else {
			System.out.println("Error en la letra del DNI");
			correcto = false;
		}
		
		}while(!correcto);
		
		
		
	}

}
