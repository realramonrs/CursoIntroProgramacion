package operadores;

public class RelacionalesyLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operadores Relacionales: < , <= , > , >= , == , !=
		
		// Sentencia if else
		//Programa que determina si un número es par o impar
		int numero = 10;
		
		if(numero % 2 == 0) {
			System.out.println("Número par");
		}
		else {
			System.out.println("Número impar");
		}
		
		//Programa que calcula la raiz cuadrada de un número positivo
		int numero2 = -100;
		
		if(numero2 >= 0) {
			double raiz = Math.sqrt(numero2);
			System.out.println("La raiz de " + numero2 + " es : " + raiz);
		}
		else {
			System.out.println("Número negativo");
		}
		
		//Operadores Lógicos : && --> AND  
		//     condicion1 && condicion2 --> Devuelve true si las son ciertas
		
		//Un alumno aprueba si la media > 5 y no faltó nunca a clase
		int nota1 = 2, nota2 = 4 , nota3 = 9;
		boolean asistencia100 = true;
		
		//calcular la media
		float media = (nota1 + nota2 + nota3)/3f;
		System.out.println("La media es: " + media);
		
		if(media >= 5 && asistencia100) {			
			System.out.println("Por lo tanto estás aprobado.");
		}
		else {			
			System.out.println("Por lo tanto estás SUSPENSO.");
		}
		
		// Operador || : Or 
		//Devuelve true si una de las dos condiciones es true
		
		//Programa que aplica un descuento del 15% si: La compra es 
		//superior a 50€ o el clente es VIP
		float compra = 40;
		boolean vip = true;
		
		if(compra >= 50 || vip == true) {
			float descuento = 0.15f*compra;
			compra = compra - descuento;
			System.out.println("Tiene un descuento del 15%");
		}
		
		System.out.println("Precio final de su compra = " + compra);
		
		//Operador ! : Not
		
		//Programa que aplica un recargo al combustible del 20% 
		//si no es eléctrico
		boolean electrico = false;
		float precioLitro = 1.50f;
		
		if(!electrico) {
			precioLitro = precioLitro + 0.2f*precioLitro;
		//	precioLitro = 1.2f*precioLitro;
		}
		
		System.out.println("Precio litro: " + precioLitro);
		
	}

}
