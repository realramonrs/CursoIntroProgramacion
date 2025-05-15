package misClases;

import java.time.LocalDate;

public class TestAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno a = new Alumno();
		Alumno a2 = new Alumno("12345678E",LocalDate.of(2008, 10, 15));
		
		//Mostrar dnis alumnos
		System.out.println("DNI a: " + a.getDni());
		System.out.println("DNI a2: " + a2.getDni());
		
		//Asignar un DNI al alumno a:
		a.setDni("111111111T");
		
		//Evaluar a los alumnos
		a.addNota(6);
		a.addNota(5);
		a.addNota(3);
		//Mostrar la media
		System.out.println("Media alumno a: " + a.getMedia());
	}

}
