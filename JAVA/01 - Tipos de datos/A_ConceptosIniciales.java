package tiposDeDatos;

public class A_ConceptosIniciales {
	//La clase es la unidad mínima lógica de encapsulación de código
	
	// Las llaves { } sirven para delimitar un bloque de código
	// Después de { se debe realizar un salto de linea y comenzar siguiente línea con 4 espacios(un tabulador)
	
	//Las clases contienen métodos que es donde programamos nuestros algoritmos.
	//Las clases se agrupan en packages
	//Los packages se agrupan en módulos
	
	//Estas barras permiten introducir comentarios de una línea , ignorados por el compilador
	/* La barra y el asterisco permiten
	 * introducir comentarios de varias lineas
	 */
	/* Los comentarios son útiles para introducir anotaciones que expliquen el código
	 * o para depurar el código, comentandolo para que no se ejecute algunas sentencias (corregir errores)
	 */
	//A continuación nos encontramos con el método principal, que como vemos cuenta con las llaves 
	//para delimitar su bloque de código
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
		//Este es un bloque de código especial
		//Todos los programas empiezan aquí
		//Sólo debe haber un método principal
		//Vamos a escribir las primeras sentencias
		System.out.println("Bienvenidos al maravilloso mundo de Java");
		System.out.println("   /\\         /\\   ");
                System.out.println("  /  \\_______/  \\  ");
        	System.out.println(" /               \\ ");
        	System.out.println("(  /\\         /\\  )");
        	System.out.println("====     V     ====");
        	System.out.println("======(__|__)======");
        	System.out.println("  (             )  ");System.out.println("   (___________)   ");
        	
        //Java lee código linea a línea o de forma más precisa, sentencia a sentencia
        //Una sentencia siempre debe ser finalizada con ; y a continuación se debe hacer un salto de línea(no es obligatorio)
        
        //Normalmente aquí realizaremos llamadas a otros métodos
        pintarPiernas(); 
        //Explicar aquí puntos de ruptura
	}
	
	public static void pintarPiernas() {
		System.out.println("     ||     ||      ");
        System.out.println("     ||     ||      ");
        System.out.println("    (||)   (||)     ");

	}

}
