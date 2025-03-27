package claseString;

public class Ejemplos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char car = 'e';
		String frase = "Me molan las clases de Java";
		
		//Contar cuantas aes hay en la frase
		int contadorAes = 0;
		for(int i = 0;i<frase.length();i++) {
			if(frase.charAt(i) == 'a') {
				contadorAes++;
			}
		}
		System.out.println("Hay " + contadorAes + " aes");
		
		//Funciones más utilizadas de la Clase String
		//indexOf(char c)
		int posicionPrimerEspacio = frase.indexOf(' ');
		//lastIndexOf(char c)
		int ultimaPosEspacio = frase.lastIndexOf(' ');
		
		//startsWith(string s)
		boolean empiezaPorZ = frase.startsWith("z");
		
		//contains(string c)
		boolean contieneMola = frase.contains("mola");
		
		//substring(int posicion) 
		String frase2 = frase.substring(5);
		
		System.out.println(frase2);
		
		String frase3 = frase.substring(posicionPrimerEspacio+1, ultimaPosEspacio);
		System.out.println(frase3);
		
		//split(string separador)
		String[] palabras = frase.split(" ");
		
		//Mostrar el contenido del array palabras
		for(int i = 0;i<palabras.length;i++) {
			System.out.println(palabras[i]);
		}
		
		//equals(String f)
		boolean iguales = frase.equals(frase);
		
		System.out.println(iguales);
		
		//Porque no debo usar == 
		String f1 = "hola";
		String f2 = new String("hola");
		
		System.out.println(f1.equals(f2));
		System.out.println(f1==f2);
		
		//Character es una clase que contiene métodos para identificar
		//si un caracter es mayúscula, minúscula, dígito, letra , símbolo
		boolean digito = Character.isDigit('4');
		boolean letra = Character.isLetter('r');
		boolean mayuscula = Character.isUpperCase('R');
		char minuscula = Character.toLowerCase('Q');
		
		
		//Programa que valida que un String tenga:
		//Al menos 10 caracteres
		//Una mayúscula
		//Un dígito
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
