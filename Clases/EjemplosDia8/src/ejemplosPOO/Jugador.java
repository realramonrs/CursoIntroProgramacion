package ejemplosPOO;

public class Jugador {

	//Atributos
	String nombre;
	private int edad;
	String posicion;
	boolean lesionado;
	
	//Constructores: Métodos que son llamados por el operador new
	//Dos características: No tienen tipo de retorno y se tienen que llamar como la clase
	//Constructor por defecto:
	public Jugador() {
		
	}
	
	public Jugador(String nombre,int edad,String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		this.lesionado = false;
	}
	
	//Métodos de acceso a int edad
	public void setEdad(int e) {
		if(e>0 && e<100) {
			edad = e;
		}		
	}
	
	public int getEdad() {
		return edad;
	}
	
	//Sobreescribir el método toString
	
	@Override
	public String toString() {
		return this.nombre + " , " + this.edad + " " + this.posicion;
	}
	
	
	
	

}
