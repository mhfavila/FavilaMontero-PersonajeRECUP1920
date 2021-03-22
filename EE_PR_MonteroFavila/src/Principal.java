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
		System.out.println("Personajes cargados");
		System.out.println("-----------");
		System.out.println("Lista de personajes");
		gp.mostrarListaPesonajes();
		
		System.out.println("-----------");
		gp.eliminarPersonaje("DAN");
		System.out.println("Eliminar");
		System.out.println("-----------");
		System.out.println("Lista de personajes");
		gp.mostrarListaPesonajes();
		System.out.println("Lista de personajes");		
		gp.mostrarListaPesonajes();
		
	
		
		
		

	}

}
