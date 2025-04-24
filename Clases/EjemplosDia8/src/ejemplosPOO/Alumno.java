package ejemplosPOO;

public class Alumno {

	//Atributos: DNI, Email, Telefono, Curso, notaFinal (inicialmente es 0)
	private String dni;
	String email;
	String telefono;
	String curso;
	float notaFinal;
	
	//Constructores:
	// 1 constructor que reciba toda la info menos la nota final
	
	public Alumno(String dni,String email,String telefono,String curso) {
		setDNI(dni);
		this.email = email;
		this.telefono = telefono;
		this.curso = curso;
	}
	//Métodos de acceso para el DNI (que debe de ser private)
	
	public void setDNI(String dni) {
		//Comprobar que tiene 9 caracteres
		if(dni.length()==9) {
			this.dni = dni;
		}
	}

	//Sobreescribir em método toString
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", email=" + email + ", telefono=" + telefono + ", curso=" + curso
				+ ", notaFinal=" + notaFinal + "]";
	}
		
	//Crear una clase TestAlumno
	//Crear en ella 3 alumnos
	//Mostrar la info por pantalla
}
