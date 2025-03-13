package sentenciasSeleccion;

import java.util.Scanner;

public class EjemploSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion,contador = 0;
		do {
		//Presentar menú al usuario
		System.out.println("1 -> Opción 1");
		System.out.println("2 -> Opción 2");
		System.out.println("3 -> Opción 3");
		System.out.println("4 -> Salir del programa");
		
		Scanner lector = new Scanner(System.in);
		opcion = lector.nextInt();
		
	/*	if(opcion == 1) {
			System.out.println("Has escogido la opción 1");
		}
		else if(opcion == 2) {
			System.out.println("Has escogido la opción 2");
		}
		else if(opcion == 3) {
			System.out.println("Has escogido la opción 3");
		}
		else if(opcion == 4) {
			System.out.println("Salir del programa");
		}
		else {
			System.out.println("Opción errónea");
		}*/
		
		
		
		switch(opcion) {
		
			case 1:
				System.out.println("Opción 1");
				break;
			case 2:
				System.out.println("Opción 2");
				break;
			case 3:
				System.out.println("Opción 3");
				break;
			case 4:
				System.out.println("Salir del programa");
				break;
			default:
				System.out.println("Opción errónea");
				if(contador==0) {					
					System.out.println("Te quedan 2 intentos");
				}
				else if(contador==1) {
					System.out.println("Te queda 1 intento");
				}
				else {
					System.out.println("Game Over!!!");
				}
				break;
						
			}//Cierre del switch
		//contador = contador + 1;
		//contador++;
		contador+=1;
		} while(opcion>4 && contador < 3);
		
		
	}

}
