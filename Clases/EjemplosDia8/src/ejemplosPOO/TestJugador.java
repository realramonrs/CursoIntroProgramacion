package ejemplosPOO;

public class TestJugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = new String("sdfasd");
		Jugador j1 = new Jugador();
		Jugador j2 = new Jugador("Marcos Alonso",33,"Defensa");
		
				
		System.out.println("Edad de j1: " + j1.getEdad());
		//Acceso a los atributos del objeto:
		j1.nombre = "Yago Aspas";
		j1.setEdad(25);
		j1.posicion = "Delantero";
		
		
		j2.setEdad(34);
		
		System.out.println("Edad de j1: " + j1.getEdad() + " Lesionado ? " + j1.lesionado);
	
	    System.out.println("Información de J1: ");
	    System.out.println(j1);
	}

}
