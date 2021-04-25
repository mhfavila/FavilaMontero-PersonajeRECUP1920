import java.io.IOException;
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
		 * gp.eliminarPersonaje("DAN");//da fallo pero lo borra, no funciona cundo pide el nombre
		 */
		int eleccion = 0;
		do {
			System.out.println("1. Cargar los personajes(los que ya estan creados como predefinidos");
			System.out.println("2. Nuevo personaje");
			System.out.println("3. Lista de personajes");
			System.out.println("4. Informacion de los personajes.");
			System.out.println("5. eliminar personaje");
			System.out.println("6. Modificar ");
			System.out.println("7. Mostrar personaje con Inventario ");
			System.out.println("8. anadirItem ");
			System.out.println("9. Guardar backup ");
			System.out.println("10. Cargar backup ");

			eleccion = sc.nextInt();

			switch (eleccion) {
			case 1:
				gp.cargarPersonaje();
				System.out.println("Personajes cargados");
				break;
			case 2:
				gp.nuevoPersonaje();
				break;
			case 3:
				gp.mostrarListaPesonajes();
				break;
			case 4:
				String nombre;
				System.out.println("Introduce el nombre del personaje");
				sc.nextLine();//para que pida bien el nombre
				nombre=sc.nextLine();
				//nombre="goku";
				
				gp.informacionPersonaje(nombre); 
				break;
			case 5:
				String nombreeli;
				System.out.println("Introduce el nombre del personaje");
				
				sc.nextLine();//para que pida bien el nombre
				nombreeli=sc.nextLine();
				gp.eliminarPersonaje(nombreeli);
				break;
			case 6:
				String nombre1;
				System.out.println("Introduce el nombre del personaje");
				sc.nextLine();//para que pida vien el nombre
				nombre1=sc.nextLine();
				//nombre="goku";
				
				gp.modificarDatos(nombre1);
				break;
				
				
			case 7:
				gp.mostrarListaPesonajesConInventario();
				break;
			case 8:
				String Nombre = null;
				System.out.println("Introduce el nombre del personaje");
				sc.nextLine();//para que pida vien el nombre
				Nombre=sc.nextLine();
				gp.agregarItem(Nombre);
				break;
			case 9:
				try {
					gp.guardarBackup();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 10:
				try {
					gp.cargarBackup();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			}
			
				
		} while (eleccion != 0);

		/*gp.cargarPersonaje();
		System.out.println("Personajes cargados");
		System.out.println("-----------");
		System.out.println("Introduce un nombre");
		String nombre = sc.nextLine();

		System.out.println(nombre);
		System.out.println("se va a eliminar");
		gp.eliminarPersonaje(nombre);
		System.out.println("se ha eliminado");
		System.out.println("-----------");
		System.out.println("Lista");
		gp.mostrarListaPesonajes();*/

		/*
		 * System.out.println("Lista de personajes"); gp.mostrarListaPesonajes();
		 * System.out.println("-----------"); gp.eliminarPersonaje("DAN");
		 * gp.mostrarListaPesonajes(); System.out.println("-----------");
		 * gp.informacionPersonaje("goku");*?
		 * 
		 * /*System.out.println("-----------"); gp.eliminarPersonaje("DAN");
		 * System.out.println("Eliminar"); System.out.println("-----------");
		 * System.out.println("Lista de personajes"); gp.mostrarListaPesonajes();
		 * System.out.println("Lista de personajes"); gp.mostrarListaPesonajes();
		 */

	}

}
