import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import ClasesDTO.PersonajeDTO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<PersonajeDTO> listaPersonajes = new ArrayList<>();
		GestionPersonaje gp = new GestionPersonaje();

		// estan bien hechos ya los siguientes
		/*
		 * gp.cargarPersonaje(); 
		 * gp.nuevoPersonaje(); 
		 * gp.mostrarListaPesonajes();
		 * gp.informacionPersonaje("DAN");
		 */

		gp.cargarPersonaje();

		// gp.nuevoPersonaje();
		// gp.mostrarListaPesonajes();

		gp.informacionPersonaje("DAN");
		
		
		
		//prueba parecida a la de la clase tienda
		System.out.print("Nombre del Personaje: ");
		String Nombre = sc.nextLine();
		System.out.println("Datos acatuales.");
		System.out.println(Nombre);
		
		
		gp.modificarPersonaje(Nombre);
		
		
		/*System.out.println("Introduce el nombre del personaje que quieres modificar");
		String Nombre = sc.nextLine();
		System.out.println("Datos acatuales.");
		System.out.println(Nombre);
		
		gp.BuscarInfo(Nombre);
		//quiero que aqui aparezcan los datos para que se puedan ir mirando y ver el valor anterior en caso de no querer cambiarlo
		
		System.out.println("Si algun dato no quieres cambiarlo vuelve a escribir el mismo valor");
		System.out.println("Introduce el nuevo Nivel");
		int Nivel = sc.nextInt();
		System.out.println("Introduce el nueva Vida");
		int Vida = sc.nextInt();
		System.out.println("Introduce el nueva Fuerza");
		int Fuerza = sc.nextInt();
		System.out.println("Introduce el nueva Destreza");
		int Destreza = sc.nextInt();
		System.out.println("Introduce el nueva Constitucion");
		int Constitucion = sc.nextInt();
		System.out.println("Introduce el nueva Inteligencia");
		int Inteligencia = sc.nextInt();
		System.out.println("Introduce el nuevo Oro");
		int Oro = sc.nextInt();
		 
		
		

		gp.modificarDatos(Nombre, Nivel, Vida, Fuerza, Destreza, Constitucion, Inteligencia, Oro);*/
		
	
		
		
		

	}

}
