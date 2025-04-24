package ejemplosPOO;

public class TestAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno a1 = new Alumno("123987676987645678O","julian@fpfomento.com","678908787","1ºGMI");
		Alumno a2 = new Alumno("92345678P","pepe@fpfomento.com","655432190","1ºGMI");
		Alumno a3 = new Alumno("62345678Z","maria@fpfomento.com","60987612","1ºGMI");
		
		a1.setDNI("3");
		System.out.println("Los 3 alumnos son: ");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}

}
