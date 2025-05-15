package misClases;

import java.time.LocalDate;


public class Alumno {

	private String dni;
	float[] notas;
	private double media;
	LocalDate fechaNacimiento;
	
	public Alumno() {
		notas = new float[10];
		inicializarNotas();		
	}
	
	public Alumno(String dni,LocalDate fecha) {
		notas = new float[10];
		inicializarNotas();
		this.dni = dni;
		this.fechaNacimiento = fecha;
	}
		
	//Método de acceso getDNI
	public String getDni() {
		return this.dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public double getMedia() {
		return this.media;
	}	
	
	//Método que permita añadir nota a un alumno
	public void addNota(float nota) {
		//Buscar primera pos vacía (-1) y guardar la nota
		for(int i = 0;i<notas.length;i++) {
			if(notas[i]==-1) {
				notas[i] = nota;
				break;
			}
		}		
		calcularMedia();
	}
	
	private void calcularMedia() {
		int contador = 0;
		float sumaNotas = 0;
		
		for(int i = 0;i<notas.length;i++) {
			if(notas[i]>=0) {
				sumaNotas = sumaNotas + notas[i];
				contador++;
			}
		}		
		this.media = sumaNotas / contador;		
	}
	//Método que inicializa el array de notas a -1
	
	private void inicializarNotas() {
		for(int i = 0;i<notas.length;i++) {
			notas[i] = -1;
		}
	}
	
	
	
	
	
	
	
	
	
}
